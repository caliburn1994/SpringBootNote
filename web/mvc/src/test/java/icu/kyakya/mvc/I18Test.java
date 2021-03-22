package icu.kyakya.mvc;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.context.MessageSource;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;

import java.util.Locale;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class I18Test {

    @LocalServerPort
    private int port;
    @Value("#{servletContext.contextPath}")
    private String servletContextPath;
    String URL;
    @Autowired
    private TestRestTemplate restTemplate;

    @Autowired
    MessageSource messageSource;

    @BeforeEach
    void beforeAll() {
        URL = "http://localhost:" + port + servletContextPath;
    }

    /**
     * {@link icu.kyakya.mvc.controller.i18n.Example1Controller}
     * {@link icu.kyakya.mvc.controller.i18n.Example2Controller}
     */
    @Test
    public void example1_2() {
        String actual = restTemplate.getForObject(URL + "/i18n/example/1?lang=ja", String.class);
        String expected = messageSource.getMessage("hello", new String[]{}, Locale.JAPANESE);
        assertThat(actual).contains(expected);


        actual = restTemplate.getForObject(URL + "/i18n/example/1?lang=en", String.class);
        expected = messageSource.getMessage("hello", new String[]{}, Locale.ENGLISH);
        assertThat(actual).contains(expected);
    }

    /**
     * {@link icu.kyakya.mvc.controller.i18n.Example3Controller}
     */
    @Test
    public void example3() {
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_FORM_URLENCODED);

        MultiValueMap<String, String> mapJap = new LinkedMultiValueMap<String, String>();
        mapJap.add("lang", "ja");
        MultiValueMap<String, String> mapEn = new LinkedMultiValueMap<String, String>();
        mapJap.add("lang", "en");

        HttpEntity<MultiValueMap<String, String>> request = new HttpEntity<>(mapJap, headers);
        ResponseEntity<String> response = restTemplate.postForEntity(URL + "/i18n/example/3", request, String.class);
        assertThat(response.getBody()).contains("許可されていません");

        request = new HttpEntity<>(mapEn, headers);
        response = restTemplate.postForEntity(URL + "/i18n/example/3", request, String.class);
        assertThat(response.getBody()).contains("must not be null");
    }
}
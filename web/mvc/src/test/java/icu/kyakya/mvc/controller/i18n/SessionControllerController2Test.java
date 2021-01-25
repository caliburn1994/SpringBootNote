package icu.kyakya.mvc.controller.i18n;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.springframework.boot.test.context.SpringBootTest.WebEnvironment;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
class SessionControllerController2Test {

//    @LocalServerPort
//    private int port;
//
//    @Autowired
//    private TestRestTemplate restTemplate;
//
//    @Test
//    public void test_ja() {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/web/i18n/echo", String.class)).contains("こんにちは");
//    }
//
//    @Test
//    public void test_page() {
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/web/i18n/index?lang=ja", String.class)).contains("こんにちは");
//        assertThat(this.restTemplate.getForObject("http://localhost:" + port + "/web/i18n/index?lang=en", String.class)).contains("hello");
//    } todo
}
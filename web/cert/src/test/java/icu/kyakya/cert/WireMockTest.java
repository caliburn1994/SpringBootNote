package icu.kyakya.cert;

import com.github.tomakehurst.wiremock.common.Slf4jNotifier;
import com.github.tomakehurst.wiremock.junit.WireMockRule;
import org.junit.Rule;
import org.junit.Test;

import static com.github.tomakehurst.wiremock.core.WireMockConfiguration.wireMockConfig;

/**
 * @author Chen Xiaojie
 * @since 2020-12-02
 */
public class WireMockTest {

    @Rule
    WireMockRule rule = new WireMockRule(wireMockConfig()
            .httpsPort(8080)
            .httpsPort(8081) // 随即端口
            .keystorePath("/init/truststore.jks")
            .notifier(new Slf4jNotifier(true)));;

    @Test
    public void test(){
        System.out.println(rule.httpsPort());
        while (true){

        }
    }
}

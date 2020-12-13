package icu.kyakya.orm.mybatis.generator;

import org.junit.jupiter.api.Test;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

import java.io.IOException;
import java.sql.SQLException;

@SpringBootTest
@ActiveProfiles({"develop", "h2", "generator"})
class GenerateMybatisCode {

    @Autowired
    MyBatisGenerator generator;

    @Test
    void generate() throws InterruptedException, SQLException, InvalidConfigurationException, IOException {
        generator.run();
    }
}

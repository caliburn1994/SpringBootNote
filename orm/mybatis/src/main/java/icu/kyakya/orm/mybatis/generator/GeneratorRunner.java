package icu.kyakya.orm.mybatis.generator;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Profile("generator")
@Component
@Slf4j
public class GeneratorRunner {

    public GeneratorRunner(Context context) {
        this.context = context;
    }

    private final Context context;

    public void run() throws InvalidConfigurationException, InterruptedException, SQLException, IOException {
        List<String> warnings = new ArrayList<>();
        Configuration config = new Configuration();

        config.addContext(context);

        DefaultShellCallback callback = new DefaultShellCallback(true);
        org.mybatis.generator.api.MyBatisGenerator myBatisGenerator;
        try {
            myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        } catch (InvalidConfigurationException e) {
            log.error("errors happened");
            throw e;
        }
        myBatisGenerator.generate(null);
        warnings.forEach(log::warn);
    }


}


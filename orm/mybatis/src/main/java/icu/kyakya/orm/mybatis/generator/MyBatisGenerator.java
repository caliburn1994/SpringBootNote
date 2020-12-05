package icu.kyakya.orm.mybatis.generator;


import lombok.extern.slf4j.Slf4j;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.Context;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

@Profile("generator")
@Component
@Slf4j
public class MyBatisGenerator {

    public MyBatisGenerator(Context context) {
        this.context = context;
    }

    private Context context;

    public void run() throws InvalidConfigurationException, InterruptedException, SQLException, IOException {
        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        Configuration config = new Configuration();

        config.addContext(context);

        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        org.mybatis.generator.api.MyBatisGenerator myBatisGenerator = null;
        try {
            myBatisGenerator = new org.mybatis.generator.api.MyBatisGenerator(config, callback, warnings);
        } catch (InvalidConfigurationException e) {
            log.error("配置出现错误");
            throw e;
        }
        myBatisGenerator.generate(null);
    }


}


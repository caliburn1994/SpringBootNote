package icu.kyakya.orm.mybatis.mybatis.config;

import org.testcontainers.containers.MySQLContainer;

/**
 * @author : Chen Xiaojie
 * created date : 2020-10-21
 */
public class MySQLBuilder {

    private static MySQLContainer<?> container = null;

    static MySQLContainer<?> buildMySQLContainer() {
        if (container == null) {
            container = new MySQLContainer<>("mysql:5.7.16")
                    .withInitScript("mvn/db/mysql/scripts/all_schemas.sql")
                    .withCommand("--character-set-server=utf8 " + //utf8
                            "--collation-server=utf8_general_ci " +
                            "--lower_case_table_names=1 " + // 大小写insensitive
                            "--sql_mode=ALLOW_INVALID_DATES");// 允许日期非法
            ;
            container.start();
        }

        return container;
    }

    public static void close() {
        if (container != null) {
            container.close();
        }
    }
}
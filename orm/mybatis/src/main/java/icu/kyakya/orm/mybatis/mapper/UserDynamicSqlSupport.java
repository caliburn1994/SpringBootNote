package icu.kyakya.orm.mybatis.mapper;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;
/**
 * todo demo
 */
public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.007375+09:00", comments="Source Table: user")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.008588+09:00", comments="Source field: user.user_id")
    public static final SqlColumn<Integer> userId = user.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.009235+09:00", comments="Source field: user.name")
    public static final SqlColumn<String> name = user.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.009355+09:00", comments="Source field: user.city_id")
    public static final SqlColumn<Integer> cityId = user.cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.008309+09:00", comments="Source Table: user")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> userId = column("user_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<Integer> cityId = column("city_id", JDBCType.INTEGER);

        public User() {
            super("user");
        }
    }
}
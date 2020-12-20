package icu.kyakya.orm.mybatis.mapper;

import java.sql.JDBCType;
import java.util.Date;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class UserDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.254317673+09:00", comments="Source Table: USER")
    public static final User user = new User();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.255120365+09:00", comments="Source field: USER.USER_ID")
    public static final SqlColumn<Integer> userId = user.userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.255951791+09:00", comments="Source field: USER.CITY_ID")
    public static final SqlColumn<Integer> cityId = user.cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.256189313+09:00", comments="Source field: USER.NAME")
    public static final SqlColumn<String> name = user.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.25644099+09:00", comments="Source field: USER.GENDER")
    public static final SqlColumn<String> gender = user.gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.256609936+09:00", comments="Source field: USER.HEIGHT")
    public static final SqlColumn<Integer> height = user.height;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.256775281+09:00", comments="Source field: USER.CREATE_TIME")
    public static final SqlColumn<Date> createTime = user.createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.254802191+09:00", comments="Source Table: USER")
    public static final class User extends SqlTable {
        public final SqlColumn<Integer> userId = column("USER_ID", JDBCType.INTEGER);

        public final SqlColumn<Integer> cityId = column("CITY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> gender = column("GENDER", JDBCType.VARCHAR);

        public final SqlColumn<Integer> height = column("HEIGHT", JDBCType.INTEGER);

        public final SqlColumn<Date> createTime = column("CREATE_TIME", JDBCType.TIMESTAMP);

        public User() {
            super("USER");
        }
    }
}
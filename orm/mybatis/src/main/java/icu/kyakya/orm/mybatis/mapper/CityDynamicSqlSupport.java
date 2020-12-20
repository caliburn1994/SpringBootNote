package icu.kyakya.orm.mybatis.mapper;

import java.sql.JDBCType;
import javax.annotation.Generated;
import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

public final class CityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.279347843+09:00", comments="Source Table: CITY")
    public static final City city = new City();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.279710172+09:00", comments="Source field: CITY.CITY_ID")
    public static final SqlColumn<Integer> cityId = city.cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.27987078+09:00", comments="Source field: CITY.NAME")
    public static final SqlColumn<String> name = city.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.280015001+09:00", comments="Source field: CITY.STATE")
    public static final SqlColumn<String> state = city.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.280169372+09:00", comments="Source field: CITY.COUNTRY")
    public static final SqlColumn<String> country = city.country;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.279521414+09:00", comments="Source Table: CITY")
    public static final class City extends SqlTable {
        public final SqlColumn<Integer> cityId = column("CITY_ID", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("NAME", JDBCType.VARCHAR);

        public final SqlColumn<String> state = column("STATE", JDBCType.VARCHAR);

        public final SqlColumn<String> country = column("COUNTRY", JDBCType.VARCHAR);

        public City() {
            super("CITY");
        }
    }
}
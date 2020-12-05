package icu.kyakya.orm.mybatis.mapper;

import org.mybatis.dynamic.sql.SqlColumn;
import org.mybatis.dynamic.sql.SqlTable;

import javax.annotation.Generated;
import java.sql.JDBCType;

/**
 * todo demo
 */
public final class CityDynamicSqlSupport {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050572+09:00", comments="Source Table: city")
    public static final City city = new City();

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050973+09:00", comments="Source field: city.city_id")
    public static final SqlColumn<Integer> cityId = city.cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.0511+09:00", comments="Source field: city.name")
    public static final SqlColumn<String> name = city.name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.051278+09:00", comments="Source field: city.state")
    public static final SqlColumn<String> state = city.state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.051388+09:00", comments="Source field: city.country")
    public static final SqlColumn<String> country = city.country;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050772+09:00", comments="Source Table: city")
    public static final class City extends SqlTable {
        public final SqlColumn<Integer> cityId = column("city_id", JDBCType.INTEGER);

        public final SqlColumn<String> name = column("name", JDBCType.VARCHAR);

        public final SqlColumn<String> state = column("state", JDBCType.VARCHAR);

        public final SqlColumn<String> country = column("country", JDBCType.VARCHAR);

        public City() {
            super("city");
        }
    }
}
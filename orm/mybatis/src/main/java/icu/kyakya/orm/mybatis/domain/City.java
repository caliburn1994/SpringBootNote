package icu.kyakya.orm.mybatis.domain;

import javax.annotation.Generated;
/**
 * todo demo
 */
public class City {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.04254+09:00", comments="Source field: city.city_id")
    private Integer cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.042745+09:00", comments="Source field: city.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050097+09:00", comments="Source field: city.state")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050327+09:00", comments="Source field: city.country")
    private String country;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.042615+09:00", comments="Source field: city.city_id")
    public Integer getCityId() {
        return cityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.042655+09:00", comments="Source field: city.city_id")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.046436+09:00", comments="Source field: city.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.049908+09:00", comments="Source field: city.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050198+09:00", comments="Source field: city.state")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050278+09:00", comments="Source field: city.state")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050382+09:00", comments="Source field: city.country")
    public String getCountry() {
        return country;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.050435+09:00", comments="Source field: city.country")
    public void setCountry(String country) {
        this.country = country;
    }
}
package icu.kyakya.orm.mybatis.domain;

import javax.annotation.Generated;

public class City {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.310381983+09:00", comments="Source field: CITY.CITY_ID")
    private Integer cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312016711+09:00", comments="Source field: CITY.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312223851+09:00", comments="Source field: CITY.STATE")
    private String state;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.31239579+09:00", comments="Source field: CITY.COUNTRY")
    private String country;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.311579181+09:00", comments="Source field: CITY.CITY_ID")
    public Integer getCityId() {
        return cityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.311929587+09:00", comments="Source field: CITY.CITY_ID")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312080441+09:00", comments="Source field: CITY.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312168171+09:00", comments="Source field: CITY.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312281587+09:00", comments="Source field: CITY.STATE")
    public String getState() {
        return state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312342531+09:00", comments="Source field: CITY.STATE")
    public void setState(String state) {
        this.state = state;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312488725+09:00", comments="Source field: CITY.COUNTRY")
    public String getCountry() {
        return country;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.312550301+09:00", comments="Source field: CITY.COUNTRY")
    public void setCountry(String country) {
        this.country = country;
    }
}
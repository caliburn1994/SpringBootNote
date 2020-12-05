package icu.kyakya.orm.mybatis.domain;

import javax.annotation.Generated;
/**
 * todo demo
 */
public class User {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:38:59.998282+09:00", comments="Source field: user.user_id")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.001866+09:00", comments="Source field: user.name")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.002106+09:00", comments="Source field: user.city_id")
    private Integer cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.001225+09:00", comments="Source field: user.user_id")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.001677+09:00", comments="Source field: user.user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.001976+09:00", comments="Source field: user.name")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.002062+09:00", comments="Source field: user.name")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.002154+09:00", comments="Source field: user.city_id")
    public Integer getCityId() {
        return cityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.002196+09:00", comments="Source field: user.city_id")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }
}
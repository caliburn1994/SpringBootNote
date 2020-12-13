package icu.kyakya.orm.mybatis.domain;

import java.util.Date;
import javax.annotation.Generated;

public class User {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398361755+09:00", comments="Source field: USER.USER_ID")
    private Integer userId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398387445+09:00", comments="Source field: USER.CITY_ID")
    private Integer cityId;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.39844035+09:00", comments="Source field: USER.NAME")
    private String name;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398486002+09:00", comments="Source field: USER.GENDER")
    private String gender;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398512273+09:00", comments="Source field: USER.HEIGHT")
    private Integer height;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398535654+09:00", comments="Source field: USER.CREATE_TIME")
    private Date createTime;

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398372009+09:00", comments="Source field: USER.USER_ID")
    public Integer getUserId() {
        return userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398381807+09:00", comments="Source field: USER.USER_ID")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398392341+09:00", comments="Source field: USER.CITY_ID")
    public Integer getCityId() {
        return cityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398397968+09:00", comments="Source field: USER.CITY_ID")
    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398459841+09:00", comments="Source field: USER.NAME")
    public String getName() {
        return name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398476908+09:00", comments="Source field: USER.NAME")
    public void setName(String name) {
        this.name = name;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398494265+09:00", comments="Source field: USER.GENDER")
    public String getGender() {
        return gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398504472+09:00", comments="Source field: USER.GENDER")
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398519765+09:00", comments="Source field: USER.HEIGHT")
    public Integer getHeight() {
        return height;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398528591+09:00", comments="Source field: USER.HEIGHT")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.39854599+09:00", comments="Source field: USER.CREATE_TIME")
    public Date getCreateTime() {
        return createTime;
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.398567313+09:00", comments="Source field: USER.CREATE_TIME")
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
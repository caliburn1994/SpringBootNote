package icu.kyakya.orm.mybatis.mapper;

import icu.kyakya.orm.mybatis.domain.City;
import org.apache.ibatis.annotations.*;
import org.apache.ibatis.type.JdbcType;
import org.mybatis.dynamic.sql.BasicColumn;
import org.mybatis.dynamic.sql.delete.DeleteDSLCompleter;
import org.mybatis.dynamic.sql.delete.render.DeleteStatementProvider;
import org.mybatis.dynamic.sql.insert.render.InsertStatementProvider;
import org.mybatis.dynamic.sql.insert.render.MultiRowInsertStatementProvider;
import org.mybatis.dynamic.sql.select.CountDSLCompleter;
import org.mybatis.dynamic.sql.select.SelectDSLCompleter;
import org.mybatis.dynamic.sql.select.render.SelectStatementProvider;
import org.mybatis.dynamic.sql.update.UpdateDSL;
import org.mybatis.dynamic.sql.update.UpdateDSLCompleter;
import org.mybatis.dynamic.sql.update.UpdateModel;
import org.mybatis.dynamic.sql.update.render.UpdateStatementProvider;
import org.mybatis.dynamic.sql.util.SqlProviderAdapter;
import org.mybatis.dynamic.sql.util.mybatis3.MyBatis3Utils;

import javax.annotation.Generated;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static icu.kyakya.orm.mybatis.mapper.CityDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;

@Mapper
public interface CityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.325076844+09:00", comments="Source Table: CITY")
    BasicColumn[] selectList = BasicColumn.columnList(cityId, name, state, country);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.317988874+09:00", comments="Source Table: CITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.319189413+09:00", comments="Source Table: CITY")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.319486692+09:00", comments="Source Table: CITY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<City> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.320178321+09:00", comments="Source Table: CITY")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<City> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.320541022+09:00", comments="Source Table: CITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CityResult")
    Optional<City> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.321071439+09:00", comments="Source Table: CITY")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CityResult", value = {
        @Result(column="CITY_ID", property="cityId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="STATE", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="COUNTRY", property="country", jdbcType=JdbcType.VARCHAR)
    })
    List<City> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.322055205+09:00", comments="Source Table: CITY")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.322295509+09:00", comments="Source Table: CITY")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.322513263+09:00", comments="Source Table: CITY")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.322788493+09:00", comments="Source Table: CITY")
    default int deleteByPrimaryKey(Integer cityId_) {
        return delete(c -> 
            c.where(cityId, isEqualTo(cityId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.323049904+09:00", comments="Source Table: CITY")
    default int insert(City record) {
        return MyBatis3Utils.insert(this::insert, record, city, c ->
            c.map(cityId).toProperty("cityId")
            .map(name).toProperty("name")
            .map(state).toProperty("state")
            .map(country).toProperty("country")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.32377958+09:00", comments="Source Table: CITY")
    default int insertMultiple(Collection<City> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, city, c ->
            c.map(cityId).toProperty("cityId")
            .map(name).toProperty("name")
            .map(state).toProperty("state")
            .map(country).toProperty("country")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.324128452+09:00", comments="Source Table: CITY")
    default int insertSelective(City record) {
        return MyBatis3Utils.insert(this::insert, record, city, c ->
            c.map(cityId).toPropertyWhenPresent("cityId", record::getCityId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(country).toPropertyWhenPresent("country", record::getCountry)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.326024639+09:00", comments="Source Table: CITY")
    default Optional<City> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.326363743+09:00", comments="Source Table: CITY")
    default List<City> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.326658285+09:00", comments="Source Table: CITY")
    default List<City> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.327053524+09:00", comments="Source Table: CITY")
    default Optional<City> selectByPrimaryKey(Integer cityId_) {
        return selectOne(c ->
            c.where(cityId, isEqualTo(cityId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.327423842+09:00", comments="Source Table: CITY")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.327798732+09:00", comments="Source Table: CITY")
    static UpdateDSL<UpdateModel> updateAllColumns(City record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(cityId).equalTo(record::getCityId)
                .set(name).equalTo(record::getName)
                .set(state).equalTo(record::getState)
                .set(country).equalTo(record::getCountry);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.328165718+09:00", comments="Source Table: CITY")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(City record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(cityId).equalToWhenPresent(record::getCityId)
                .set(name).equalToWhenPresent(record::getName)
                .set(state).equalToWhenPresent(record::getState)
                .set(country).equalToWhenPresent(record::getCountry);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.328747853+09:00", comments="Source Table: CITY")
    default int updateByPrimaryKey(City record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(state).equalTo(record::getState)
            .set(country).equalTo(record::getCountry)
            .where(cityId, isEqualTo(record::getCityId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-14T00:07:58.329177896+09:00", comments="Source Table: CITY")
    default int updateByPrimaryKeySelective(City record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(state).equalToWhenPresent(record::getState)
            .set(country).equalToWhenPresent(record::getCountry)
            .where(cityId, isEqualTo(record::getCityId))
        );
    }
}
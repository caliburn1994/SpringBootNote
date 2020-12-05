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

/**
 * todo demo
 */
@Mapper
public interface CityMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052817+09:00", comments="Source Table: city")
    BasicColumn[] selectList = BasicColumn.columnList(cityId, name, state, country);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.05152+09:00", comments="Source Table: city")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.051592+09:00", comments="Source Table: city")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.051659+09:00", comments="Source Table: city")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<City> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.051726+09:00", comments="Source Table: city")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<City> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.051903+09:00", comments="Source Table: city")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("CityResult")
    Optional<City> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.051986+09:00", comments="Source Table: city")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="CityResult", value = {
        @Result(column="city_id", property="cityId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="name", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="state", property="state", jdbcType=JdbcType.VARCHAR),
        @Result(column="country", property="country", jdbcType=JdbcType.VARCHAR)
    })
    List<City> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052129+09:00", comments="Source Table: city")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052193+09:00", comments="Source Table: city")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052261+09:00", comments="Source Table: city")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052378+09:00", comments="Source Table: city")
    default int deleteByPrimaryKey(Integer cityId_) {
        return delete(c -> 
            c.where(cityId, isEqualTo(cityId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052451+09:00", comments="Source Table: city")
    default int insert(City record) {
        return MyBatis3Utils.insert(this::insert, record, city, c ->
            c.map(cityId).toProperty("cityId")
            .map(name).toProperty("name")
            .map(state).toProperty("state")
            .map(country).toProperty("country")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052558+09:00", comments="Source Table: city")
    default int insertMultiple(Collection<City> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, city, c ->
            c.map(cityId).toProperty("cityId")
            .map(name).toProperty("name")
            .map(state).toProperty("state")
            .map(country).toProperty("country")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052648+09:00", comments="Source Table: city")
    default int insertSelective(City record) {
        return MyBatis3Utils.insert(this::insert, record, city, c ->
            c.map(cityId).toPropertyWhenPresent("cityId", record::getCityId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(state).toPropertyWhenPresent("state", record::getState)
            .map(country).toPropertyWhenPresent("country", record::getCountry)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052889+09:00", comments="Source Table: city")
    default Optional<City> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.052957+09:00", comments="Source Table: city")
    default List<City> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.053025+09:00", comments="Source Table: city")
    default List<City> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.053093+09:00", comments="Source Table: city")
    default Optional<City> selectByPrimaryKey(Integer cityId_) {
        return selectOne(c ->
            c.where(cityId, isEqualTo(cityId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.054269+09:00", comments="Source Table: city")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, city, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.054385+09:00", comments="Source Table: city")
    static UpdateDSL<UpdateModel> updateAllColumns(City record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(cityId).equalTo(record::getCityId)
                .set(name).equalTo(record::getName)
                .set(state).equalTo(record::getState)
                .set(country).equalTo(record::getCountry);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.054553+09:00", comments="Source Table: city")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(City record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(cityId).equalToWhenPresent(record::getCityId)
                .set(name).equalToWhenPresent(record::getName)
                .set(state).equalToWhenPresent(record::getState)
                .set(country).equalToWhenPresent(record::getCountry);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.054679+09:00", comments="Source Table: city")
    default int updateByPrimaryKey(City record) {
        return update(c ->
            c.set(name).equalTo(record::getName)
            .set(state).equalTo(record::getState)
            .set(country).equalTo(record::getCountry)
            .where(cityId, isEqualTo(record::getCityId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-06T00:39:00.054877+09:00", comments="Source Table: city")
    default int updateByPrimaryKeySelective(City record) {
        return update(c ->
            c.set(name).equalToWhenPresent(record::getName)
            .set(state).equalToWhenPresent(record::getState)
            .set(country).equalToWhenPresent(record::getCountry)
            .where(cityId, isEqualTo(record::getCityId))
        );
    }
}
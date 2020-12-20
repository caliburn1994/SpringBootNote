package icu.kyakya.orm.mybatis.mapper;

import static icu.kyakya.orm.mybatis.mapper.UserDynamicSqlSupport.*;
import static org.mybatis.dynamic.sql.SqlBuilder.*;

import icu.kyakya.orm.mybatis.domain.User;
import java.util.Collection;
import java.util.List;
import java.util.Optional;
import javax.annotation.Generated;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.UpdateProvider;
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

@Mapper
public interface UserMapper {
    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.26867289+09:00", comments="Source Table: USER")
    BasicColumn[] selectList = BasicColumn.columnList(userId, cityId, name, gender, height, createTime);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.257673544+09:00", comments="Source Table: USER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    long count(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.258748407+09:00", comments="Source Table: USER")
    @DeleteProvider(type=SqlProviderAdapter.class, method="delete")
    int delete(DeleteStatementProvider deleteStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.259171435+09:00", comments="Source Table: USER")
    @InsertProvider(type=SqlProviderAdapter.class, method="insert")
    int insert(InsertStatementProvider<User> insertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.259808782+09:00", comments="Source Table: USER")
    @InsertProvider(type=SqlProviderAdapter.class, method="insertMultiple")
    int insertMultiple(MultiRowInsertStatementProvider<User> multipleInsertStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.260401867+09:00", comments="Source Table: USER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @ResultMap("UserResult")
    Optional<User> selectOne(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.26115001+09:00", comments="Source Table: USER")
    @SelectProvider(type=SqlProviderAdapter.class, method="select")
    @Results(id="UserResult", value = {
        @Result(column="USER_ID", property="userId", jdbcType=JdbcType.INTEGER, id=true),
        @Result(column="CITY_ID", property="cityId", jdbcType=JdbcType.INTEGER),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="GENDER", property="gender", jdbcType=JdbcType.VARCHAR),
        @Result(column="HEIGHT", property="height", jdbcType=JdbcType.INTEGER),
        @Result(column="CREATE_TIME", property="createTime", jdbcType=JdbcType.TIMESTAMP)
    })
    List<User> selectMany(SelectStatementProvider selectStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.26269508+09:00", comments="Source Table: USER")
    @UpdateProvider(type=SqlProviderAdapter.class, method="update")
    int update(UpdateStatementProvider updateStatement);

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.263236128+09:00", comments="Source Table: USER")
    default long count(CountDSLCompleter completer) {
        return MyBatis3Utils.countFrom(this::count, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.263799852+09:00", comments="Source Table: USER")
    default int delete(DeleteDSLCompleter completer) {
        return MyBatis3Utils.deleteFrom(this::delete, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.264389154+09:00", comments="Source Table: USER")
    default int deleteByPrimaryKey(Integer userId_) {
        return delete(c -> 
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.265097171+09:00", comments="Source Table: USER")
    default int insert(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(userId).toProperty("userId")
            .map(cityId).toProperty("cityId")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
            .map(height).toProperty("height")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.266591101+09:00", comments="Source Table: USER")
    default int insertMultiple(Collection<User> records) {
        return MyBatis3Utils.insertMultiple(this::insertMultiple, records, user, c ->
            c.map(userId).toProperty("userId")
            .map(cityId).toProperty("cityId")
            .map(name).toProperty("name")
            .map(gender).toProperty("gender")
            .map(height).toProperty("height")
            .map(createTime).toProperty("createTime")
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.26735075+09:00", comments="Source Table: USER")
    default int insertSelective(User record) {
        return MyBatis3Utils.insert(this::insert, record, user, c ->
            c.map(userId).toPropertyWhenPresent("userId", record::getUserId)
            .map(cityId).toPropertyWhenPresent("cityId", record::getCityId)
            .map(name).toPropertyWhenPresent("name", record::getName)
            .map(gender).toPropertyWhenPresent("gender", record::getGender)
            .map(height).toPropertyWhenPresent("height", record::getHeight)
            .map(createTime).toPropertyWhenPresent("createTime", record::getCreateTime)
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.269527782+09:00", comments="Source Table: USER")
    default Optional<User> selectOne(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectOne(this::selectOne, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.270012916+09:00", comments="Source Table: USER")
    default List<User> select(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectList(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.270510801+09:00", comments="Source Table: USER")
    default List<User> selectDistinct(SelectDSLCompleter completer) {
        return MyBatis3Utils.selectDistinct(this::selectMany, selectList, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.271515408+09:00", comments="Source Table: USER")
    default Optional<User> selectByPrimaryKey(Integer userId_) {
        return selectOne(c ->
            c.where(userId, isEqualTo(userId_))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.272136763+09:00", comments="Source Table: USER")
    default int update(UpdateDSLCompleter completer) {
        return MyBatis3Utils.update(this::update, user, completer);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.272770371+09:00", comments="Source Table: USER")
    static UpdateDSL<UpdateModel> updateAllColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalTo(record::getUserId)
                .set(cityId).equalTo(record::getCityId)
                .set(name).equalTo(record::getName)
                .set(gender).equalTo(record::getGender)
                .set(height).equalTo(record::getHeight)
                .set(createTime).equalTo(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.273526999+09:00", comments="Source Table: USER")
    static UpdateDSL<UpdateModel> updateSelectiveColumns(User record, UpdateDSL<UpdateModel> dsl) {
        return dsl.set(userId).equalToWhenPresent(record::getUserId)
                .set(cityId).equalToWhenPresent(record::getCityId)
                .set(name).equalToWhenPresent(record::getName)
                .set(gender).equalToWhenPresent(record::getGender)
                .set(height).equalToWhenPresent(record::getHeight)
                .set(createTime).equalToWhenPresent(record::getCreateTime);
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.274749993+09:00", comments="Source Table: USER")
    default int updateByPrimaryKey(User record) {
        return update(c ->
            c.set(cityId).equalTo(record::getCityId)
            .set(name).equalTo(record::getName)
            .set(gender).equalTo(record::getGender)
            .set(height).equalTo(record::getHeight)
            .set(createTime).equalTo(record::getCreateTime)
            .where(userId, isEqualTo(record::getUserId))
        );
    }

    @Generated(value="org.mybatis.generator.api.MyBatisGenerator", date="2020-12-21T00:32:47.275753441+09:00", comments="Source Table: USER")
    default int updateByPrimaryKeySelective(User record) {
        return update(c ->
            c.set(cityId).equalToWhenPresent(record::getCityId)
            .set(name).equalToWhenPresent(record::getName)
            .set(gender).equalToWhenPresent(record::getGender)
            .set(height).equalToWhenPresent(record::getHeight)
            .set(createTime).equalToWhenPresent(record::getCreateTime)
            .where(userId, isEqualTo(record::getUserId))
        );
    }
}
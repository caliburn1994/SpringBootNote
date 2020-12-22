package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.mapper.CityMapper;
import icu.kyakya.orm.mybatis.mapper.UserMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.sql.DataSource;
import java.util.List;

import static icu.kyakya.orm.mybatis.mapper.UserDynamicSqlSupport.user;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;

@Service
public class UserService {

    private final UserMapper userMapper;
    private final CityMapper cityMapper;


    public UserService(UserMapper userMapper, CityMapper cityMapper) {
        this.userMapper = userMapper;
        this.cityMapper = cityMapper;
    }

    public int insert(User user) {
        return userMapper.insert(user);
    }

    public User selectByPrimaryKey(Integer id) throws Exception {
        return userMapper.selectByPrimaryKey(id)
                .orElseThrow(() -> new Exception("User Not found"));
    }

    @Transactional
    public List<User> selectAllOrInit() {
        return selectAll();
    }

    public List<User> selectAll() {
        return userMapper.selectMany
                (select(user.allColumns()).from(user)
                        .where().build()
                        .render(RenderingStrategies.MYBATIS3));
    }


    @Transactional
    public void printOneSession() throws Exception {
        selectByPrimaryKey(1);
        selectByPrimaryKey(1);
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertTsTest(User user) throws Exception {
        boolean hasError = true;
        userMapper.insert(user);
        //noinspection ConstantConditions
        if (hasError) {
            throw new Exception("test transaction");
        }
        userMapper.insert(user);
    }
}

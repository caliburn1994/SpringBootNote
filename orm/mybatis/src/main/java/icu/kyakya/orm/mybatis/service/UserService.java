package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.mapper.CityMapper;
import icu.kyakya.orm.mybatis.mapper.UserMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;
import java.util.stream.IntStream;

import static icu.kyakya.orm.mybatis.mapper.UserDynamicSqlSupport.user;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;

@Service
public class UserService {

    private UserMapper userMapper;
    private CityMapper cityMapper;

    @SuppressWarnings("SpringJavaInjectionPointsAutowiringInspection")
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

    public List<User> selectAllOrInit() {
        List<User> users = selectAll();
        if (users.size() == 0) {
            IntStream.range(0, 30).forEach(i -> {
                User u = new User();
                u.setName("u" + i);
                u.setGender("xx");
                u.setHeight(180 - i);
                u.setCreateTime(new Date());
                insert(u);
            });
            users = selectAll();
        }

        return users;
    }

    private List<User> selectAll() {
        List<User> users = userMapper.selectMany
                (select(user.allColumns()).from(user)
                        .where().build()
                        .render(RenderingStrategies.MYBATIS3));
        return users;
    }


    @Transactional
    public void printOneSession() throws Exception {
        selectByPrimaryKey(1);
        selectByPrimaryKey(1);
    }
}

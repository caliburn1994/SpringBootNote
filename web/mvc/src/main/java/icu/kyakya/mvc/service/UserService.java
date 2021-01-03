package icu.kyakya.mvc.service;

import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.mapper.UserMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import static icu.kyakya.orm.mybatis.mapper.UserDynamicSqlSupport.user;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;

@Service
public class UserService {

    private final UserMapper userMapper;

    public UserService(UserMapper userMapper) {
        this.userMapper = userMapper;
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


}

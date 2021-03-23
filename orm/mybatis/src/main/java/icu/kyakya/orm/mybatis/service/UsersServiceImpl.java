package icu.kyakya.orm.mybatis.service;

//import icu.kyakya.orm.mybatis.domain.User;
//import org.mybatis.dynamic.sql.render.RenderingStrategies;

import icu.kyakya.orm.mybatis.domain.Users;
import icu.kyakya.orm.mybatis.mapper.UsersMapper;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static icu.kyakya.orm.mybatis.mapper.UsersDynamicSqlSupport.users;
//import org.springframework.transaction.annotation.Transactional;
//
//import java.util.List;
//
//import static icu.kyakya.orm.mybatis.mapper.UserDynamicSqlSupport.user;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;

@Service
public class UsersServiceImpl implements UsersService {

    private final UsersMapper usersMapper;

    public UsersServiceImpl(UsersMapper usersMapper) {
        this.usersMapper = usersMapper;
    }

    @Override
    public int insert(Users user) {
        return usersMapper.insertSelective(user);
    }

    @Transactional(rollbackFor = Exception.class)
    public void insertMultiple(List<Users> users) {
        usersMapper.insertMultiple(users);
    }

    @Override
    public Optional<Users> selectByID(Integer id) throws Exception {
        return usersMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Users> selectAll() {
        return usersMapper.selectMany
                (select(users.allColumns()).from(users)
                        .where().build()
                        .render(RenderingStrategies.MYBATIS3));
    }
//
//
//    @Transactional
//    public void printOneSession() throws Exception {
//        selectByPrimaryKey(1);
//        selectByPrimaryKey(1);
//    }
//

}

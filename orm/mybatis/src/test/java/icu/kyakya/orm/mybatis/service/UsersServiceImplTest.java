package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.MybatisConfig;
import icu.kyakya.orm.mybatis.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.util.Assert;

import java.util.Optional;

@SpringBootTest(classes = MybatisConfig.class)
class UsersServiceImplTest {

    @Autowired
    UsersService usersService;

    @Test
    void test1_select() throws Exception {
        Optional<Users> users = usersService.selectByID(1);
        Assert.isTrue(users.isPresent(), "The object must not be null");
    }

}
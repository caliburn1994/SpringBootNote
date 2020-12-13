package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.domain.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    void test() throws Exception {
        int insert = userService.insert(new User());
        Assertions.assertEquals(1, insert);

        User user = userService.selectByPrimaryKey(1);
        Assertions.assertNotNull(user);
    }

    @Test
    void exception() {
        Assertions.assertThrows(Exception.class, () -> userService.selectByPrimaryKey(99999));
    }


    @Test
    void session() throws Exception {
        userService.insert(new User());
        userService.printOneSession();
    }
}
package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.mapper.UserDynamicSqlSupport;
import icu.kyakya.orm.mybatis.mapper.UserMapper;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mybatis.dynamic.sql.render.RenderingStrategies;
import org.mybatis.dynamic.sql.where.condition.IsEqualTo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.testcontainers.shaded.org.apache.commons.lang.ArrayUtils;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import static icu.kyakya.orm.mybatis.mapper.UserDynamicSqlSupport.user;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.mybatis.dynamic.sql.SqlBuilder.isEqualTo;
import static org.mybatis.dynamic.sql.select.SelectDSL.select;

@SpringBootTest
@ActiveProfiles({"h2", "dev"})
class UserServiceTest {

    @Autowired
    UserService userService;
    @Resource
    UserMapper userMapper;

    @Test
    void test() throws Exception {
        int insert = userService.insert(new User());
        Assertions.assertEquals(1, insert);

        User user = userService.selectByPrimaryKey(1);
        Assertions.assertNotNull(user);
    }

    /**
     * log.level=debug时，查看重复查询会进行几次数据库操作。
     */
    @Test
    void session() throws Exception {
        userService.insert(new User());
        userService.printOneSession();
    }

    /**
     * aop 插入数据的测试。
     */
    @Test
    public void selectAll() {
        List<User> users = userService.selectAllOrInit();
        Assertions.assertTrue(users.size() != 0);
    }

    /**
     * transaction测试什么时候会回滚
     */
//    @Test
//    public void testTransaction() {
//        User userPo = new User();
//        userPo.setCreateTime(new Date());
//        try {
//            userService.insertTsTest(userPo);
//        } catch (Exception e) {
//            e.printStackTrace();
//        } finally {
//            userService.selectAll().forEach(user -> {
//                Date createTime = user.getCreateTime();
//                System.out.println("data in DB:"+createTime);
//                Assertions.assertNotEquals(userPo.getCreateTime().getTime(),createTime.getTime());
//            });
//            System.out.println("inserted:" + userPo.getCreateTime());
//        }
//
//    }


}
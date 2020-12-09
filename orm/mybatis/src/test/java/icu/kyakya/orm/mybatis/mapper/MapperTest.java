package icu.kyakya.orm.mybatis.mapper;

import icu.kyakya.orm.mybatis.domain.User;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
@Slf4j
class MapperTest {

    @Resource
    UserMapper userMapper;

    @Test
    void test(){
        int insert = userMapper.insert(new User());
        Assert.assertEquals(1,insert);
    }
}

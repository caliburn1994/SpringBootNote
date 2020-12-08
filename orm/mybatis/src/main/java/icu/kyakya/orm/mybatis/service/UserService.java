package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.domain.City;
import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.mapper.CityMapper;
import icu.kyakya.orm.mybatis.mapper.UserMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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


    public boolean isTokyo(Integer id) throws Exception {
        Integer cityId = userMapper.selectByPrimaryKey(id)
                .map(User::getCityId)
                .orElseThrow(() -> new Exception("User Not found"));


        String cityName = cityMapper.selectByPrimaryKey(cityId).map(City::getName)
                .orElseThrow(() -> new Exception("City Not found"));

        return "tokyo".equals(cityName);
    }


    @Transactional
    public void printOneSession() throws Exception {
        selectByPrimaryKey(1);
        selectByPrimaryKey(1);
    }
}

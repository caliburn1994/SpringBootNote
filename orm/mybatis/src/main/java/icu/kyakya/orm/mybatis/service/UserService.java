package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.domain.User;
import icu.kyakya.orm.mybatis.mapper.UserMapper;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserService {

    @Setter
    @Getter
    @Resource
    private UserMapper mapper;

    public int insert(User user) {
        return mapper.insert(user);
    }

    public User selectByPrimaryKey(Integer id) {
        return mapper.selectByPrimaryKey(id).get();
    }
}

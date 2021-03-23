package icu.kyakya.orm.mybatis.service;

import icu.kyakya.orm.mybatis.domain.Users;

import java.util.List;
import java.util.Optional;

public interface UsersService {

    int insert(Users user);

    Optional<Users> selectByID(Integer id) throws Exception;

    List<Users> selectAll();
}

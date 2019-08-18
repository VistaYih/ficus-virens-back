package dev.daqiang.blog.infra.mapper;

import dev.daqiang.blog.domain.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<User> getUsers();

    User selectUserInfoById(Long id);

    Integer deleteUserById();

    Integer insertUser();

    Integer updateUser();

}

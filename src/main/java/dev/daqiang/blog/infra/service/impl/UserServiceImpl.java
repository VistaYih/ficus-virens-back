package dev.daqiang.blog.infra.service.impl;

import dev.daqiang.blog.domain.entity.User;
import dev.daqiang.blog.domain.entity.UserInfo;
import dev.daqiang.blog.infra.mapper.UserMapper;
import dev.daqiang.blog.infra.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> findAllUser() {
        return userMapper.selectAll();
    }

    @Override
    public User findUserInfoById(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public User findUserByUsername(String username) {
        return null;
    }

    @Override
    public User findUserById(Long id) {
        return null;
    }

    @Override
    public UserInfo findUserInfoByUsername(String username) {
        return null;
    }

    @Override
    public Integer changePassword(String oldPassword, String newPassword) {
        return null;
    }

    @Override
    public Integer saveUser(User user) {
        return null;
    }

    @Override
    public Integer deleteUserById() {
        return null;
    }

    @Override
    public Integer updateUserInfo(UserInfo userInfo) {
        return null;
    }
}

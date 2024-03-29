package dev.daqiang.blog.infra.service.impl;

import dev.daqiang.blog.domain.entity.User;
import dev.daqiang.blog.infra.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.client.AutoConfigureWebClient;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserServiceImplTest {

    @Autowired
    UserService userService;

    @Test
    public void findAllUser() {
        List<User> users = userService.findAllUser();

        System.out.println(users);

        assertEquals(users.size(), 3);
    }

    @Test
    public void findUserInfoById() {
        User user = userService.findUserInfoById(100001L);
        System.out.println(user.getUsername());
        assertEquals(user.getUsername(), "admin");
    }
    @Test
    public void findUserByUsername() {
    }

    @Test
    public void findUserById() {
    }

    @Test
    public void findUserInfoByUsername() {
    }

    @Test
    public void changePassword() {
    }

    @Test
    public void saveUser() {
    }

    @Test
    public void deleteUserById() {
    }

    @Test
    public void updateUserInfo() {
    }
}
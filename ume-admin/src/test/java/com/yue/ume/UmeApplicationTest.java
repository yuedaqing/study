package com.yue.ume;

import cn.hutool.core.collection.CollectionUtil;
import com.yue.ume.domain.User;
import com.yue.ume.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;


@SpringBootTest
public class UmeApplicationTest {

    @Resource
    private UserService userService;

    @Test
    public void fun() {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 10000; i++) {
            User user = new User();
            user.setPhone("15543442123");
            user.setAccount("123456");
            user.setGender("1");
            user.setUserName("yueyue");
            users.add(user);
        }
        System.out.println("users.size() = " + users.size());
        if (CollectionUtil.isNotEmpty(users)) {
            userService.saveBatch(users, 1000);
        }
    }
}
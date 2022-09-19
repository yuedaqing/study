package com.yue.ume.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yue.ume.domain.User;
import com.yue.ume.service.UserService;
import com.yue.ume.mapper.UserMapper;
import org.springframework.stereotype.Service;

/**
* @author Yue
* @description 针对表【user】的数据库操作Service实现
* @createDate 2022-08-13 15:44:36
*/
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User>
    implements UserService{

    @Override
    public User user(User user) {
        return null;
    }
}





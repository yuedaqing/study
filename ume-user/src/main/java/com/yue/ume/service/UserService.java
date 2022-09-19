package com.yue.ume.service;

import com.yue.ume.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Yue
* @description 针对表【user】的数据库操作Service
* @createDate 2022-08-13 15:44:36
*/
public interface UserService extends IService<User> {

    /**
     * 
     * @param 
     * @return 
     * @author: yue
     * @date: 2022/8/13
     */
    User user(User user);
}

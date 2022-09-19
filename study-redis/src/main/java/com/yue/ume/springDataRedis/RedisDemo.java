package com.yue.ume.springDataRedis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;

/**
 * @author Yue
 * SpringDataRedis的使用
 */
public class RedisDemo {
    @Autowired
    private RedisTemplate redisTemplate;
}

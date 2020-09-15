package com.shixun.redisdemo;


import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTests {

    @Autowired
    private RedisTemplate redisTemplate;

    @Resource
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testSet() {
        redisTemplate.opsForValue().set("name1","lzy");
        System.out.println(redisTemplate.opsForValue().get("name1"));
        stringRedisTemplate.opsForValue().set("name2","hosimizu");
        System.out.println(stringRedisTemplate.opsForValue().get("name2"));
    }

}
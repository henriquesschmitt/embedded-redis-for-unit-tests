package com.embeddedredis;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisOperations;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmbeddedRedisApplicationTests {

    @Autowired
    RedisOperations<String, String> redisOperations;
    
    @Test
    public void contextLoads() {
        redisOperations.opsForValue().set("key", "value");
    }

}

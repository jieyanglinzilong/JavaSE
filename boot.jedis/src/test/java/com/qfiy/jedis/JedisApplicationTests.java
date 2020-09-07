package com.qfiy.jedis;

import com.qfiy.jedis.config.JedisConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import redis.clients.jedis.JedisPool;

@SpringBootTest
class JedisApplicationTests {
    @Autowired
     private JedisPool jedisPool;

    @Test
    void contextLoads() {

        System.out.println(jedisPool);
    }

}

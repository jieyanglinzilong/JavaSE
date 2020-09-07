package com.qfiy.jedis.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class JedisConfig  {
    private Logger logger= LoggerFactory.getLogger(JedisConfig.class);
    @Value("$(spring.redis.host)")
    String host;
    @Value("$(spring.redis.port)")
    String port;
    @Value("$(spring.redis.password)")
    String password;

    @Value(value = "$(spring.redis.timeout)")
    String timeout;
    /*max-active: 10
    max-idle: 6
    min-idle: 2*/
    @Value("$(spring.redisjedis.pool.max-active)")
    int maxActive;
    @Value("$(spring.redis.jedis.pool.max-idle)")
    int maxIdle;
    @Value("$(spring.redis.jedis.pool.min-idle)")
    int minIdle;

    @Bean
    public JedisPool jedisPool(){
        JedisPoolConfig jedisPoolConfig = new JedisPoolConfig();
        jedisPoolConfig.setMaxIdle(maxIdle);
        jedisPoolConfig.setMinIdle(minIdle);
        jedisPoolConfig.setMaxTotal(maxActive);

        JedisPool jedisPool =new JedisPool(jedisPoolConfig);
        //jedisPoolConfig,host,port,timeout,password
            logger.info("连接成功"+host+"\t"+port);
            return  jedisPool;
           //jedisPoolConfig,host,port,timeout,password);

    }


}

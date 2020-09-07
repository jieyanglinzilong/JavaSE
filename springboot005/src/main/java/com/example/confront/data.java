package com.example.confront;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class data {
    @Bean
    @ConfigurationProperties(prefix = "spring.datasource")
    public DataSource get(){
        return new DruidDataSource();
    }
}

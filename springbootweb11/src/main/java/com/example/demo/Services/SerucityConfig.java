package com.example.demo.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import javax.sql.DataSource;

@EnableWebSecurity
public class SerucityConfig extends WebSecurityConfigurerAdapter{
   @Autowired
    private DataSource dataSource;

    @Override
    protected void configure(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        BCryptPasswordEncoder encoder=new BCryptPasswordEncoder();

        String userSQL ="select username,password,valid from t_customer " +
             "where username = ?";String authoritySQL="select c.username,a.authority from t_customer c,t_authority a,"+
              "t_customer_authority ca where ca.customer_id=c.id " +
              "and ca.authority_id=a.id and c.username =?";
     authenticationManagerBuilder.jdbcAuthentication().passwordEncoder(encoder)
             .dataSource(dataSource).usersByUsernameQuery(userSQL).authoritiesByUsernameQuery(authoritySQL);

                // 3、使用UserDetailsService进行身份认证
//        auth.userDetailsService(userDetailsService).passwordEncoder(encoder);


      //authenticationManagerBuilder.jdbcAuthentication().passwordEncoder(encoder).dataSource(dataSource).usersByUsernameQuery(userSQL).authoritiesByUsernameQuery(authoritySQL);
    }
}

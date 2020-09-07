package com.itheima.dao;

import com.itheima.domin.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select*from account")
    List<Account> findall();
    @Insert("insert into account(uid,money)values(#{uid},#{money})")
    void saveAccount(Account account);
    @Delete("delete from account where name=#{name}")
    void delete(String name);

    List<Double> findMoney();
    void update(Account account);
}

package lzl.com.example.demo.dao;

import lzl.com.example.demo.domain.Account;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AccountDao {
    List<Account> findAccount();
    @Select("select*from account where uid=#{uid} ")
    List<Account> findByUid(Integer uid);
    void updatein(Account inaccount);
    void updateout(Account outaccout);
    @Insert("insert into account(money,uid)values(#{money},#{uid})")
    void add(Account account);
}

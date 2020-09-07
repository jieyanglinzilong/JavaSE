package cn.itcast.dao;

import cn.itcast.domain.Account;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface AccountDao {
    @Select("select*from account")
    List<Account> findall();
    @Insert("insert into account(name,money)values(#{name},#{money})")
    void saveAccount(Account account);
    @Delete("delete from account where name=#{name}")
    void delete(String name);
}

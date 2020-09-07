package com.itheima.dao;

import com.itheima.domain.Account;
import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

import javax.management.Query;
import java.util.List;

/**
 * @author 黑马程序员
 * @Company http://www.ithiema.com
 *
 * 用户的持久层接口
 */
public interface IUserDao {

    /**
     * 查询所有操作
     * @return
     */
    List<Account> findaccout();
    List<User> findAll();
    void saveuser(User us);
   User find(Integer id);
   /**模糊查询


   * */
   List<User> findname(String username);
   List<User> findsaverbyVo(QueryVo vo);

}

package com.itheima.dao;

import com.itheima.domain.QueryVo;
import com.itheima.domain.User;

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
    List<User> findAll();
    void saveuser(User us);
   List<User> find(Integer id);
   /**模糊查询


   * */
   List<User> findname(String username);
   List<User> findcondition(User user);
    List<User> findUserInIds(QueryVo vo);

}

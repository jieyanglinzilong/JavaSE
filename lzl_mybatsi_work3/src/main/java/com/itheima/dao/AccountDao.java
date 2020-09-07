package com.itheima.dao;

import com.itheima.domin.Account;
import com.itheima.domin.tranfer;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface AccountDao {
    List<Account> add(Account account);
    void tranferin(List<tranfer> tranfers);



}

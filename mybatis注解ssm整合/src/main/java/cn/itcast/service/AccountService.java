package cn.itcast.service;

import cn.itcast.dao.AccountDao;
import cn.itcast.domain.Account;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface AccountService {

    List<Account> findall();
    void saveAccount(Account account);
    void delete(String name);
}

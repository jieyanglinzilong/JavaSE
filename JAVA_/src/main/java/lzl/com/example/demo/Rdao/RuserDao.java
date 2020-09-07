package lzl.com.example.demo.Rdao;

import lzl.com.example.demo.domain.RuserAdd;
import org.springframework.data.repository.CrudRepository;

import java.sql.Date;
import java.util.List;

public interface RuserDao extends CrudRepository<RuserAdd,Integer> {
    List<RuserAdd> findByAddress(String address);
    List<RuserAdd> findByRegistration(Date date);
    List<RuserAdd> findByName(String name);


}

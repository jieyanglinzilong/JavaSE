package lzl.com.example.demo.Rdao;

import lzl.com.example.demo.domain.Redao;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface RedaoDao extends CrudRepository<Redao,Integer> {
  List<Redao> findByRid(Integer rid);
  List<Redao> findByUid(Integer uid);
  List<Redao> findBySecuritycode(Integer code);
  @Transactional
 // @Modifying
 // @Query("UPDATE Redao c SET c.password= ?1 WHERE  c.rid = ?2")
  List<Redao> updateRedao(Integer password,Integer rid);
  List<Redao>  delteRedao(Integer rid);
}

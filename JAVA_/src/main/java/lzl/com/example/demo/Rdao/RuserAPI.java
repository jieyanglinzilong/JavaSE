package lzl.com.example.demo.Rdao;


import lzl.com.example.demo.domain.Ruser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface RuserAPI extends JpaRepository<Ruser,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE user C SET C.address=?1 WHERE C.id=?2")
    public int updateRuser(String address,Integer id);
}

package com.example.it;

import com.example.domin.Discuss;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import java.util.List;
@Mapper
public interface findDisscuss  extends JpaRepository<Discuss, Integer> {
    @Query("SELECT c FROM t_comment c WHERE  c.aId = ?1")
     List<Discuss> getDiscussPaged(Integer aid, Pageable pageable);
    List<Discuss> findByAuthorNotNull();

}

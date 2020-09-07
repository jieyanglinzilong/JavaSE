package com.example.springboot_huancun.Dao;

import com.example.springboot_huancun.domain.comment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface CommentRepository extends JpaRepository<comment,Integer> {
    @Transactional
    @Modifying
    @Query("UPDATE t_comment c set c.author =?1 where c.id=?2")
    public int update(String author,Integer id);

}

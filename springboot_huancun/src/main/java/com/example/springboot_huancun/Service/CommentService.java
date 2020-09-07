package com.example.springboot_huancun.Service;

import com.example.springboot_huancun.Dao.CommentRepository;
import com.example.springboot_huancun.domain.comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.cache.annotation.Caching;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CommentService {
    @Autowired
    private  CommentRepository commentRepository;
    //@Cacheable(cacheNames = "comment")
    @Cacheable(cacheNames = "comment" , unless = "#result==null")
    public comment findbyId(int comment_id){
        Optional<comment> optional=commentRepository.findById(comment_id);
        if(optional.isPresent()){
            return  optional.get();
        }
        return  null;
    }
    //@CachePut(cacheNames = "comment",key = "#result.id")
    @CachePut(cacheNames = "comment",key = "#result.id")
    public comment updateComment(comment comment){
        commentRepository.update(comment.getAuthor(),comment.getId());
        return  comment;
    }
    @CacheEvict(cacheNames = "comment")
    public void delteComment(int comment_id){

        commentRepository.deleteById(comment_id);
    }


}

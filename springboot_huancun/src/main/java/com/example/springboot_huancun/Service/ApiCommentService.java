package com.example.springboot_huancun.Service;

import com.example.springboot_huancun.Dao.CommentRepository;
import com.example.springboot_huancun.domain.comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
public class ApiCommentService {
    @Autowired
    private CommentRepository commentRepository;
    @Autowired
    private RedisTemplate redisTemplate;
    public comment findById(int comment_id){
        Object object=redisTemplate.opsForValue().get("comment_id");
        if(object!=null){
            return (comment)object;
        }
        else{
            Optional<comment> optional=commentRepository.findById(comment_id);
            if(optional.isPresent()){
                comment comment=optional.get();
                redisTemplate.opsForValue().set("comment_"+comment_id,comment,1, TimeUnit.DAYS);//保存一天
                return  comment;
            }
        else{
            return null;

        }
    }
}
public  comment updateComment(comment comment){
   redisTemplate.opsForValue().set("comment_"+ comment.getId(),comment);
   return  comment;
}
public void deleteComment(int comment_id){
        commentRepository.deleteById(comment_id);
        redisTemplate.delete("comment_"+comment_id);
}











}

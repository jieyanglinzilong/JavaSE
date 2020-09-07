package com.example.springboot_huancun.Controller;

import com.example.springboot_huancun.Service.CommentService;
import com.example.springboot_huancun.domain.comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommentControoler {
    @Autowired
    private CommentService commentService;
    @GetMapping("/get/{id}")
    public comment findbyId(@PathVariable("id") int comment_id){
        comment comment=commentService.findbyId(comment_id);
        return comment;
    }
    @GetMapping("/update/{id}/{author}")
    public comment updateComment(@PathVariable("id") int comment_id,@PathVariable("author") String author){
        comment comment=commentService.findbyId(comment_id);
        comment.setAuthor(author);
        comment updateComment=commentService.updateComment(comment);
        return  updateComment;
    }
    @GetMapping("/delete/{id}")
    public void deleteComment(@PathVariable("id") int comment_id){
        commentService.delteComment(comment_id);
    }

}

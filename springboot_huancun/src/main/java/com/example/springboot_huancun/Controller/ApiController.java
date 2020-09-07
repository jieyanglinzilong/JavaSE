package com.example.springboot_huancun.Controller;

import com.example.springboot_huancun.Service.ApiCommentService;
import com.example.springboot_huancun.domain.comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ApiController {
    @Autowired
    private ApiCommentService apiCommentService;
    @GetMapping("/get/{id}")
    public comment findByid(@PathVariable("id")int comment_id){
        comment comment=apiCommentService.findById(comment_id);
        return  comment;
    }
}

package cn.itcast.po.service;

import cn.itcast.po.article.Comment;
import cn.itcast.po.dao.CommentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService {
    @Autowired
    private CommentRepository commentRepository;
    public void saveComment(Comment comment){
        commentRepository.save(comment);
    }
    public void deleteComment(String id){
        commentRepository.deleteById(id);

    }
    public List<Comment>  findCommentList(){


        return commentRepository.findAll();
    }
    public Comment findByid(String id){
        return  commentRepository.findById(id).get();
    }



}

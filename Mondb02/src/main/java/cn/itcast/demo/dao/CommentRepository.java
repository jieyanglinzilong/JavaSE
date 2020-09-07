package cn.itcast.demo.dao;


import cn.itcast.demo.article.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment,String> {

}

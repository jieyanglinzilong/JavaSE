package cn.itcast.po.dao;

import cn.itcast.po.article.Comment;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CommentRepository extends MongoRepository<Comment,String> {

}

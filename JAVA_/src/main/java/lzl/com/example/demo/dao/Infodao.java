package lzl.com.example.demo.dao;

import lzl.com.example.demo.Pojo.Usercenter;
import lzl.com.example.demo.domain.info;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface Infodao {

   Usercenter find(Integer id);
    @Select("select*from info")
    List<info> findInfo();
    @Insert("insert into info(id,word,email,name)values(#{id},#{word},#{email},#{name})")
    void addInformation(info info);
}

package lzl.com.example.demo.dao;

import lzl.com.example.demo.domain.Tranfer;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;



@Mapper
public interface TranferDao {
    @Insert("insert into tranfer(tid,uid,time,money,rid)values(#{tid},#{uid},#{time},#{money},#{rid})")
    int tranfer(Tranfer tranfer );
}

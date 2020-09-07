package lzl.com.example.demo.dao;

import lzl.com.example.demo.domain.Point;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface PointDao {
    List<Point> findPiont();
    @Insert("insert into point(uid,point,rank)values(#{uid},#{point},#{rank})")
    void addPoint(Point point);
}

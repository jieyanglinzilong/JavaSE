package com.it.Ido;


import com.it.domin.Quervo;
import com.it.domin.User;
import com.it.domin.Area;
import java.util.List;

public interface Iuser {
    List<User> findAll();
    List<User> findname(String name);
    void add(User user);
    List<Area> findarea();
    List<User> findbycondtion(User user);
    List<User> findwhere(Quervo vo);

}

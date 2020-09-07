package com.itherma.dao;

import com.itherma.domin.Employees;
import com.itherma.domin.Slary;

import java.util.List;

public interface Employdao {
    public List<Employees> find();
    public  List<Slary> slaryfind();
}

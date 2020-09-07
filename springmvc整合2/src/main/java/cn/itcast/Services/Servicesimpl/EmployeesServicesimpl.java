package cn.itcast.Services.Servicesimpl;

import cn.itcast.Services.EmployeesServices;
import cn.itcast.dao.Employeesdao;
import cn.itcast.domin.Employees;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("EmployeesService")
public class EmployeesServicesimpl implements EmployeesServices {
    @Autowired
    private Employeesdao employeesdao;


    @Override
    public List<Employees> findalll() {
        System.out.println("职员查询");
        return employeesdao.findAll();
    }
}

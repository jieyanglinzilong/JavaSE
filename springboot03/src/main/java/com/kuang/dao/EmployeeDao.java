package com.kuang.dao;

import com.kuang.pojo.Department;
import com.kuang.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class EmployeeDao {
    private static Map<Integer, Employee> employeeMaps=null;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employeeMaps=new HashMap<Integer, Employee>();
        employeeMaps.put(1001,new Employee(1001,"A","789",new Department(101,"教学部"),0));
        employeeMaps.put(1002,new Employee(1002,"B","786",new Department(101,"后勤部"),1));
        employeeMaps.put(1003,new Employee(1003,"C","786",new Department(101,"市场部"),0));
        employeeMaps.put(1004,new Employee(1004,"D","789",new Department(101,"教研部"),1));



    }
    private static Integer intid=1005;
    public void save(Employee employee){
        if(employee.getId()== null){
            employee.setId(intid++);
        }
        employee.setDepartment(departmentDao.getDepartmentbyid(employee.getDepartment().getId()));
        employeeMaps.put(employee.getId(),employee);


    }
    public Collection<Employee> getAll(){
        return  employeeMaps.values();

    }
    public Employee getEmployee(Integer id){
        return employeeMaps.get(id);
    }
    public void  delete(Integer id){
        employeeMaps.remove(id);
    }



}

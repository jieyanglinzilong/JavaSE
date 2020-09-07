package com.itherma.domin;

import java.io.Serializable;
import java.sql.Date;

public class Slary implements Serializable {
   private Integer emp_no;
   private  Integer salary;
   private Date from_date;
   private Date to_date;

    public Integer getEmp_no() {
        return emp_no;
    }

    @Override
    public String toString() {
        return "Slary{" +
                "emp_no=" + emp_no +
                ", salary=" + salary +
                ", from_date=" + from_date +
                ", to_date=" + to_date +
                '}';
    }

    public void setEmp_no(Integer emp_no) {
        this.emp_no = emp_no;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public Date getFrom_date() {
        return from_date;
    }

    public void setFrom_date(Date from_date) {
        this.from_date = from_date;
    }

    public Date getTo_date() {
        return to_date;
    }

    public void setTo_date(Date to_date) {
        this.to_date = to_date;
    }
}

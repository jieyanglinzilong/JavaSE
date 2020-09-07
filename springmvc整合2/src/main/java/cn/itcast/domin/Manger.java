package cn.itcast.domin;

import sun.dc.pr.PRError;

import java.io.Serializable;
import java.sql.Date;

public class Manger implements Serializable {
    private String emp_no;
    private String dept_no;
    private Date from_date;
    private Date to_date;

    public String getEmp_no() {
        return emp_no;
    }

    @Override
    public String toString() {
        return "Manger{" +
                "emp_no='" + emp_no + '\'' +
                ", dept_no='" + dept_no + '\'' +
                ", from_date=" + from_date +
                ", to_date=" + to_date +
                '}';
    }

    public void setEmp_no(String emp_no) {
        this.emp_no = emp_no;
    }

    public String getDept_no() {
        return dept_no;
    }

    public void setDept_no(String dept_no) {
        this.dept_no = dept_no;
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

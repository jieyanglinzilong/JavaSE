package cn.itcast.doimn;

import java.io.Serializable;
import java.util.Date;

public class User implements Serializable {
    private Integer age;
    private  String uname;
    private Date date;
    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "User{" +
                "age=" + age +
                ", uname='" + uname + '\'' +
                ", date=" + date +
                '}';
    }
}

package lzl.com.example.demo.Pojo;

import lzl.com.example.demo.domain.Account;
import lzl.com.example.demo.domain.Point;
import lzl.com.example.demo.domain.info;

import java.io.Serializable;
import java.sql.Date;

public class Usercenter implements Serializable {

    Integer id;
    String name;
    Date registration;
    String sex;
    String address;
    Point point;
    info info;
    Account accounts;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Usercenter{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registration=" + registration +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                ", point=" + point +
                ", info=" + info +
                ", accounts=" + accounts +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistration() {
        return registration;
    }

    public void setRegistration(Date registration) {
        this.registration = registration;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Point getPoint() {
        return point;
    }

    public void setPoint(Point point) {
        this.point = point;
    }

    public lzl.com.example.demo.domain.info getInfo() {
        return info;
    }

    public void setInfo(lzl.com.example.demo.domain.info info) {
        this.info = info;
    }

    public Account getAccounts() {
        return accounts;
    }

    public void setAccounts(Account accounts) {
        this.accounts = accounts;
    }
}

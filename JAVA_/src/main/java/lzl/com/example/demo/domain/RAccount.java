package lzl.com.example.demo.domain;


import org.springframework.data.redis.core.RedisHash;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@RedisHash("account")
public class RAccount implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer aid;
    private Integer uid;
    private Double money;

    public Integer getAid() {
        return aid;
    }

    @Override
    public String toString() {
        return "RAccount{" +
                "aid=" + aid +
                ", uid=" + uid +
                ", money=" + money +
                '}';
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }
}

package lzl.com.example.demo.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;
@RedisHash("Redao")
//@Entity(name = "Redao")
public class Redao implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rid;

    private Integer securitycode;
    @Indexed
    private Integer uid;
    private Integer password;

    public Integer getPassword() {
        return password;
    }

    @Override
    public String toString() {
        return "Redao{" +
                "rid=" + rid +
                ", securitycode=" + securitycode +
                ", uid=" + uid +
                ", password=" + password +
                '}';
    }

    public void setPassword(Integer password) {
        this.password = password;
    }

    public Integer getRid() {
        return rid;
    }

    public void setRid(Integer rid) {
        this.rid = rid;
    }

    public Integer getSecuritycode() {
        return securitycode;
    }

    public void setSecuritycode(Integer securitycode) {
        this.securitycode = securitycode;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }
}

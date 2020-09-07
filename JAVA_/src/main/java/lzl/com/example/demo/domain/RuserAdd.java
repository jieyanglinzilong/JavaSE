package lzl.com.example.demo.domain;

import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.data.jpa.convert.threetenbp.ThreeTenBackPortJpaConverters;
import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import javax.persistence.Convert;
import java.io.Serializable;
import java.sql.Date;
@RedisHash("User")

public class RuserAdd implements Serializable {
    @Indexed
    Integer id;
    @Indexed
    String name;

    String registration;
    String sex;
    String address;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "RuserAdd{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", registration='" + registration + '\'' +
                ", sex='" + sex + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRegistration() {
        return registration;
    }

    public void setRegistration(String registration) {
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
}

package lzl.com.example.demo.domain;

import org.springframework.data.redis.core.RedisHash;
import org.springframework.data.redis.core.index.Indexed;

import java.io.Serializable;
/**
 * 短信登陆的验证码的类
 * **/
@RedisHash("Reload")
public class Reload implements Serializable {
    @Indexed
    private Integer id;
    @Indexed
    private String email;
    private String word;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "Reload{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", word='" + word + '\'' +
                '}';
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
}

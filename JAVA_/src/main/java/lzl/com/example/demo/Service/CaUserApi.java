package lzl.com.example.demo.Service;

import lzl.com.example.demo.Rdao.RuserAPI;
import lzl.com.example.demo.domain.Ruser;
import lzl.com.example.demo.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.concurrent.TimeUnit;

@Service
public class CaUserApi {
    @Autowired
    private RuserAPI ruserAPI;
    @Autowired
    private RedisTemplate redisTemplate;
    public Ruser findById(Integer id){
        Object object=redisTemplate.opsForValue().get("user_"+id);
        if(object!=null){
            return (Ruser)object;
        }
        else{
            Optional<Ruser> optional=ruserAPI.findById(id);
            if(optional.isPresent()){
                Ruser ruser=optional.get();
                redisTemplate.opsForValue().set("user_"+id,ruser,1, TimeUnit.DAYS);

                System.out.println(ruser);
                return  ruser;
            }else {
                return  null;
            }

        }
    }
    public Ruser update(Ruser ruser){
        User user=new User();
        user.setAddress(ruser.getAddress());
        user.setId(ruser.getId());
        System.out.println(user);
        ruserAPI.updateRuser(user.getAddress(),user.getId());
        redisTemplate.opsForValue().set("user_"+ruser.getId(),ruser);
        return ruser;
    }
}

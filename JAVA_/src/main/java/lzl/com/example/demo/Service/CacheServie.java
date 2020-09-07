package lzl.com.example.demo.Service;

import lzl.com.example.demo.Rdao.RedaoDao;
import lzl.com.example.demo.domain.Redao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CacheServie {
    @Autowired
    private RedaoDao redaoDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Cacheable(cacheNames = "Redao",unless = "#result==null")
    public Redao findByRid(Integer rid){
     Optional<Redao> optional=redaoDao.findById(rid);
     if(optional.isPresent()){
         return  optional.get();

     }
     return  null;
    }
    @CachePut(cacheNames = "Redao",key = "#result.rid")
    public Redao updateRedao(Redao redao){
        System.out.println("g高-----------------");
        redaoDao= (RedaoDao) redaoDao.updateRedao(redao.getPassword(),redao.getRid());
        System.out.println("g低-----------------");
        return  redao;

    }
}

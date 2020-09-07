package lzl.com.example.demo.Controller;

import lzl.com.example.demo.Service.CacheServie;
import lzl.com.example.demo.domain.Redao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CacheController {
    @Autowired
    private CacheServie cacheServie;
    @RequestMapping("/get/{rid}")
    public Redao findByRid(@PathVariable("rid")Integer rid){
        Redao redao= (Redao) cacheServie.findByRid(rid);
        return redao;
    }
    @GetMapping("/update/{rid}/{pass}")
    public Redao updateRedao(@PathVariable("rid")Integer rid,@PathVariable("pass") Integer password){
        System.out.println("过了--------------");
        Redao redao=cacheServie.findByRid(rid);
        System.out.println("过了+++++++++++++++");
        redao.setPassword(password);
        Redao redao1=cacheServie.updateRedao(redao);
        return redao1;
    }
}

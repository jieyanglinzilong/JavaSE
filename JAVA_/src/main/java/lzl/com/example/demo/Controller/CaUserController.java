package lzl.com.example.demo.Controller;

import lzl.com.example.demo.Service.CaUserApi;
import lzl.com.example.demo.domain.Ruser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class CaUserController {
    @Autowired
    private CaUserApi  apiUserService;
    @GetMapping("up/{id}/{address}")
    public Ruser update(@PathVariable("id")int id,@PathVariable("address")String address){
        System.out.println("你好");
        Ruser ruser=apiUserService.findById(id);
        System.out.println(ruser);
        ruser.setAddress(address);
        Ruser ruser1=apiUserService.update(ruser);
        return ruser1;
    }
    @GetMapping("get/{id}")
    public Ruser findById(@PathVariable("id") Integer id){
        Ruser ruser=apiUserService.findById(id);
        return ruser;
    }

}

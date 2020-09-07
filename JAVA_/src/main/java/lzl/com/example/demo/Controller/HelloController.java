package lzl.com.example.demo.Controller;

import lzl.com.example.demo.Service.AsyncService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private AsyncService asyncService;
    @RequestMapping("/aysncTest")
    public Object asyncTest() {
        asyncService.tesetAsync();
        System.out.println("-----------------删除的key ---------------------------------");
        return "Hello async";
    }
}

package lzl.com.example.demo.Controller;

import lzl.com.example.demo.Pojo.Usercenter;
import lzl.com.example.demo.Service.TranferService;
import lzl.com.example.demo.dao.Infodao;
import lzl.com.example.demo.domain.RAccount;
import lzl.com.example.demo.domain.Reload;
import lzl.com.example.demo.domain.Tranfer;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("Forword")
public class UserController  {
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private TranferService tranferService;
    @Autowired
    private Infodao infodao;

    private static Integer uid;
    @RequestMapping("check")
    public String forward(Reload reload, Model model){
        String key="hash2";
        Integer id=reload.getId();
        String word=reload.getWord();
        String email=reload.getEmail();
        String m=id.toString();
        uid=id;
        Cursor<Map.Entry<Integer, HashMap<Integer,Reload>>> cursor =redisTemplate.opsForHash().scan(key, ScanOptions.scanOptions().match(m).build());
        //TreeMap<String,byte[]> streaming = new TreeMap<>();
        System.out.println("你好世界");
        HashMap<Integer,Reload> reloadHashMap=new HashMap<>();
        System.out.println(reload);

        Map.Entry<Integer, HashMap<Integer,Reload>> entry = cursor.next();
        reloadHashMap=entry.getValue();

        //Integer key2= entry.getKey();

        System.out.println(reloadHashMap);
        reloadHashMap.values();
        Object[] value = new Reload[10];
        value= reloadHashMap.values().toArray();
        ObjectMapper objectMapper=new ObjectMapper();
        Reload reload1=objectMapper.convertValue(value[0],Reload.class);
        System.out.println(reload1);


          // System.out.println(value);


        if(word.equals(reload1.getWord())){
            model.addAttribute("list",reload.getId());
            return "success";
        }
        else{
            System.out.println("仍在方法体里");
            return "Execption";
        }



    }
    @PostMapping("Tranfer")
    public String tran(){
        return "Tranfer";
    }
    @PostMapping("tranfer")
    public String transfer(Tranfer tranfer,Model model){
        String key="Account";
        boolean n=true;
        System.out.println(tranfer);
        RAccount account1= (RAccount) redisTemplate.opsForHash().get(key,tranfer.getUid());
        System.out.println(account1);
        if((tranfer.getMoney()<account1.getMoney())&&(account1!=null)){
         n=tranferService.tranfer(tranfer,account1);

        }

       // model.addAttribute("list",)
       if(n==true){

           return "Tranfer";
       }


        return "Execption";
    }
    @PostMapping("User")
    public String UserCenter(Model model){
        Usercenter usercenters=infodao.find(uid);
        System.out.println(uid);
        System.out.println(usercenters);
        model.addAttribute("id",usercenters.getId());
        model.addAttribute("address",usercenters.getAddress());
        model.addAttribute("name",usercenters.getName());
        model.addAttribute("money",usercenters.getAccounts().getMoney());
        model.addAttribute("day",usercenters.getRegistration());
        model.addAttribute("email",usercenters.getInfo().getEmail());
        model.addAttribute("point",usercenters.getPoint().getPoint());
        model.addAttribute("rank",usercenters.getPoint().getRank());


        return "User";
    }
    @PostMapping("logs")
    public String log(Model model){


        return "login";
    }
}

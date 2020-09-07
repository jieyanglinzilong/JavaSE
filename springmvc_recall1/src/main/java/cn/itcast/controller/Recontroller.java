package cn.itcast.controller;

import cn.itcast.Execption.userException;
import cn.itcast.domin.User;
import org.omg.Messaging.SYNC_WITH_TRANSPORT;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.util.UUID;

@Controller
@RequestMapping("user")
public class Recontroller {
    @RequestMapping(path = "hello",params = {"username"})
    public String hello(){
        System.out.println("hello");
        return "success";

    }
    @RequestMapping("forword")
    public String testForord(){

        //转发请求
        //return "forward:/WEB-INF/pages/success.jsp";
        return "redirect:/index.jsp";
    }
    @RequestMapping(value="testAjax")
    @ResponseBody
    public User AJAX(@RequestBody User user){
        System.out.println("传递参数");
        System.out.println(user);
        return user;
    }
    @RequestMapping("upload")
    public String fileUpload(HttpServletRequest request, MultipartFile upload)throws  Exception{
        System.out.println("上传文件");
        String path=request.getSession().getServletContext().getRealPath("/uploads/");
        File file=new File(path);
        if(!file.exists()){
            file.mkdir();
        }
        String filename=upload.getOriginalFilename();
        String uid= UUID.randomUUID().toString().replaceAll("-","").toUpperCase();
        filename=uid+"_"+filename;
        upload.transferTo(new File(path,filename));




        return "success";
    }
    @RequestMapping("error")
    public String error() throws userException {
        try{

            int i=1/0;
        }catch (Exception e){
            e.printStackTrace();
            throw new userException("系统升级种");
        }
        return "success";
    }

}

package cn.itcast.controller;



import cn.itcast.doimn.User;
import com.sun.deploy.net.HttpResponse;
import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.MultipartStream;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.UUID;

@Controller
@RequestMapping(path="user")
public class UserController {
     @RequestMapping(path="/testString")
    public String testString(Model model)
    {
        System.out.println("执行成功");
        User user=new User();
        user.setAge(10);
        user.setPassword("123");
        user.setUsername("小月");
        model.addAttribute("user" ,user);
        return "success";
    }
    @RequestMapping(path="/testvoid")
    public void testvoid(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException {
        System.out.println("执行成功");
        //请求转发
        //request.getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request,response);
        //重定向
        //response.sendRedirect(request.getContextPath()+"/WEB-INF/pages/success.jsp");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");//解决中文乱码
        response.getWriter().println("你好世界");
        return;


    }
    @RequestMapping(path="/testModel")
    public ModelAndView  testMold()
    {
        ModelAndView mv=new ModelAndView();
        System.out.println("执行成功");
        User user=new User();
        user.setAge(10);
        user.setPassword("123");
        user.setUsername("小月");
        mv.addObject("user",user);
        mv.setViewName("success");
        return mv;
    }
    //获取json数据
    @RequestMapping("/testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println("testAjax方法执行了...");
        // 客户端发送ajax的请求，传的是json字符串，后端把json字符串封装到user对象中
        System.out.println(user);
        // 做响应，模拟查询数据库
        user.setUsername("haha");
        user.setAge(40);
        // 做响应
        return user;
    }
    @RequestMapping("/fileupload2")
    public String fileuoload1(HttpServletRequest request, MultipartFile upload) throws Exception {
        System.out.println("文件上传...");

        // 使用fileupload组件完成文件上传
        // 上传的位置
        String path = request.getSession().getServletContext().getRealPath("/uploads/");
        // 判断，该路径是否存在
        File file = new File(path);
        if(!file.exists()){
            // 创建该文件夹
            file.mkdirs();
        }


                // 说明上传文件项
                // 获取上传文件的名称
                String filename =upload.getOriginalFilename();
                // 把文件的名称设置唯一值，uuid
                String uuid = UUID.randomUUID().toString().replace("-", "");
                filename = uuid+"_"+filename;
                // 完成文件上传
                upload.transferTo(new File(path,filename));



        return "success";
    }

}

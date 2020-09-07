package cn.itcast.Execption;

import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ResolverHander implements HandlerExceptionResolver {
    @Override
    public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Object o, Exception e) {
        userException exception=null;
        if(e instanceof  userException){
            exception=(userException)e;
        }else {
            exception=new userException("系统正在维护");


        }
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("errorMsg",exception.getMessages());
        modelAndView.setViewName("error");
        return modelAndView;
    }
}

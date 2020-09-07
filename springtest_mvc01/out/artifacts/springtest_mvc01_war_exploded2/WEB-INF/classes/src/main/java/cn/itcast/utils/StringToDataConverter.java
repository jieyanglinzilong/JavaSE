package cn.itcast.utils;

import org.springframework.core.convert.converter.Converter;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDataConverter implements Converter<String, Date> {


    @Override
    public Date convert(String s) {
        if(s==null){
            throw  new  RuntimeException("请输入数学");
        }
        DateFormat dateFormat=new SimpleDateFormat("yy-mm-dd");
        try{
        return  dateFormat.parse(s);}
        catch (Exception e){
            throw  new  RuntimeException("转换异常");
        }

    }
}

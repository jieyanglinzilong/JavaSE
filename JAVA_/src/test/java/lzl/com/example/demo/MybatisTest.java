package lzl.com.example.demo;

import lzl.com.example.demo.dao.*;
import lzl.com.example.demo.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.sql.Timestamp;
import java.util.Calendar;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class MybatisTest {
    /**
     *
     */
    @Autowired
    private UserDao userDao;
    @Autowired
    private PointDao pointDao;
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private Employeesdao employeesdao;
    @Autowired
    private TranferDao tranferDao;
    @org.junit.Test
    public  void test()throws Exception {
        //1.读取配置文件

        //5.使用代理对象执行方法
        List<User> users = userDao.findUser();
        for(User user : users){

            System.out.println(user);
        }

        //6.释放资源

    }
    @org.junit.Test
    public void save(){
        User user=new User();
        user.setAddress("江苏南京");
        String day="1998-8-30";
        user.setName("郑晓凯");
        user.setSex("男");
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();

        java.sql.Date  sqlDate = new java.sql.Date(date.getTime());

        user.setRegistration(sqlDate);
        userDao.add(user);



    }
    @org.junit.Test
    public void find(){

        User users=userDao.findById(1001);
        String day=users.getRegistration().toString();

            System.out.println(users);





    }

   @Test
    public void findPoint(){
        List<Point> pointList=pointDao.findPiont();
        for(Point point:pointList){
            System.out.println(point);
        }
   }
    @Test
    public void findAccount(){
     List<Account> accountList=accountDao.findAccount();
     for(Account account:accountList){
         System.out.println(account);
     }
    }
    @Test
    public void addAccount(){
        Account account=new Account();
        account.setAid(1);
        account.setUid(1010);
        account.setMoney(30.0);
        accountDao.updatein(account);
        System.out.println("转账成功");

    }
    @Test
    public void outTranfer(){
        Account account=new Account();
        account.setAid(1);
        account.setUid(1001);
        account.setMoney(7894.0);
        accountDao.updatein(account);
        System.out.println("转账成功");

    }
    @Test
    public void findEmployees(){
        long start=System.currentTimeMillis();
        List<Employees> employeesList=employeesdao.findAll();
        for(Employees employees:employeesList){
            System.out.println(employees);
        }
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println("运行时间是："+time);
    }
    @Test
    public void AddTranfer(){
        Calendar calendar = Calendar.getInstance();
        java.util.Date date = calendar.getTime();
        System.out.println(date);
        String day=date.toString();
        String formatSqlDate = "2013-05-09";
        java.sql.Date valueOf = java.sql.Date.valueOf(formatSqlDate);

        Timestamp timeStamp = new Timestamp(date.getTime());
        System.out.println(timeStamp);
        Tranfer tranfer=new Tranfer();
        tranfer.setTime(timeStamp);
        tranfer.setMoney(300.0);

        tranfer.setUid(1001);
        tranfer.setRid(1002);
        tranferDao.tranfer(tranfer);
        System.out.println("转账成功");
    }
    @Test
    public void tranfer(){

    }

}

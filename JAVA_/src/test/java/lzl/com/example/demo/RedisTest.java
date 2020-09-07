package lzl.com.example.demo;

import lzl.com.example.demo.Rdao.RedaoDao;
import lzl.com.example.demo.dao.AccountDao;
import lzl.com.example.demo.dao.Employeesdao;
import lzl.com.example.demo.dao.Infodao;
import lzl.com.example.demo.dao.TranferDao;
import lzl.com.example.demo.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.Cursor;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ScanOptions;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.*;
import java.util.concurrent.TimeUnit;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTest {
    @Autowired
    private RedaoDao redaoDao;
    @Autowired
    private RedisTemplate redisTemplate;
    @Autowired
    private Employeesdao employeesdao;
    @Autowired
    private TranferDao tranferDao;
    @Autowired
    private AccountDao accountDao;
    @Autowired
    private Infodao infodao;



    @Test
    public void add(){
        Redao redao=new Redao();
        redao.setRid(2);
        redao.setUid(1004);
        redao.setSecuritycode(1);
        redao.setPassword(969855);
        Redao redaoList= redaoDao.save(redao);
        System.out.println(redaoList);
    }
    @Test
    public void delete(){
        Redao redao=new Redao();
        redao.setRid(1);
        redaoDao.delete(redao);
        System.out.println("删除成功");
    }
    @Test
    public void  addUser(){
       // User users=userDao.findById(1001);
        //System.out.println(users);
       /** RuserAdd ruserAdd=new RuserAdd();
        ruserAdd.setAddress(userList.getAddress());
        ruserAdd.setId(userList.getId());
        ruserAdd.setName(userList.getName());
        ruserAdd.setRegistration(userList.getRegistration());
        ruserAdd.setSex(userList.getSex());
        ruserDao.save(ruserAdd);
        System.out.println(ruserAdd);**/


    }
    /**添加密码类
     * **/
    @Test
    public void addReload(){
        String key="hash2";
        Map<Integer, Reload> map=new HashMap<Integer, Reload>();
        List<info> infoList=infodao.findInfo();
        for(info info:infoList){
            Reload reload=new Reload();
            reload.setWord(info.getWord());
            reload.setId(info.getId());
            reload.setEmail(info.getEmail());
            reload.setId(info.getId());
            map.put(info.getId(),reload);
            System.out.println(info);
        }
        /**reload.setEmail("1679569188@qq.com");
        reload.setId(1002);
        reload.setWord("679856");
        Reload reload2=new Reload();
        reload2.setEmail("1679569188@qq.com");
        reload2.setId(1010);
        reload2.setWord("679856");

     **/
        //map.put(1010,reload);
        //map.put(1002,reload2);
        redisTemplate.opsForHash().putAll(key,map);


    }
    @Test
    public void findReload(){

        String key="hash2";

        Map map=new HashMap<String, Reload>();
        map= (Map<String, Reload>) redisTemplate.opsForHash().entries(key);
        System.out.println(map);
        //redisTemplate.opsForValue().
        redisTemplate.expire(key,10,TimeUnit.MINUTES);



    }
    @Test
    public void updateReload(){
        String key="hash2";
        Reload reload=new Reload();
        reload.setEmail("1679569188@qq.com");
        reload.setId(1010);
        reload.setWord("123456");
        System.out.println(redisTemplate.opsForHash().hasKey(key,1010));
        redisTemplate.opsForHash().put(key,1010,reload);
        Map map=new HashMap<String, Reload>();
        map= (Map<String, Reload>) redisTemplate.opsForHash().entries(key);
        System.out.println(map);

    }
    @Test
    public void ADDRandom(){
        String key="hash2";
        Reload reload=new Reload();
        reload.setEmail("1679569188@qq.com");
        reload.setId(1009);
        reload.setWord("abcdfg");
        Map<Integer,Reload> map=new HashMap<Integer, Reload>();
        map.put(1009,reload);
        redisTemplate.opsForHash().put(key,1009,map);
    }
    @Test
    public void AddEmployees(){

        String key="Employees";
        Map<Integer,Remployees> employeesMap=new HashMap<>();
        List<Employees> employeesList=employeesdao.findAll();
        long start=System.currentTimeMillis();
        for(Employees employees:employeesList){
            Integer id=employees.getEmp_no();
            Remployees remployees=new Remployees();
            remployees.setBirth_date(employees.getBirth_date().toString());
            remployees.setHire_date(employees.getHire_date().toString());
            remployees.setEmp_no(employees.getEmp_no());
            remployees.setFirst_name(employees.getFirst_name());
            remployees.setLast_name(employees.getLast_name());
            remployees.setGender(employees.getGender());
            employeesMap.put(id,remployees);
        }
        redisTemplate.opsForHash().putAll(key,employeesMap);
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println("运行时间是："+time);



    }
    @Test
    public void findEemployess(){
        String key="Employees";
        long start=System.currentTimeMillis();
        Map<Integer,Remployees> employeesMap=new HashMap<>();
        employeesMap=redisTemplate.opsForHash().entries(key);
        for (Map.Entry<Integer, Remployees> entry : employeesMap.entrySet()){
            System.out.println("key值为"+entry.getKey()+"value值为"+entry.getValue());

        }
        long end=System.currentTimeMillis();
        long time=end-start;
        System.out.println("运行时间是："+time);

    }
    @Test
        public void findById(){
            String key="Employees";
            Map<Integer,Remployees> employeesMap=new HashMap<>();
            //获取所有的key
            // System.out.println(redisTemplate.opsForHash().keys(key));

            //redisTemplate.opsForValue().
            Cursor<Map.Entry<Integer, String>> cursor =redisTemplate.opsForHash().scan(key, ScanOptions.scanOptions().match("813*").build());
            TreeMap<String,byte[]> streaming = new TreeMap<>();

            while (cursor.hasNext())
            {
                Map.Entry<Integer, String> entry = cursor.next();
                Integer key2= entry.getKey();
                Object value = entry.getValue();

                System.out.printf("%s %s\n",key2,value);
            }
    }
    @Test
    public void findById2(){
        String key="hash2";
        Map<Integer,Remployees> employeesMap=new HashMap<>();
        //获取所有的key
        // System.out.println(redisTemplate.opsForHash().keys(key));

        //redisTemplate.opsForValue().
        Cursor<Map.Entry<Integer, Reload>> cursor =redisTemplate.opsForHash().scan(key, ScanOptions.scanOptions().match("10*").build());
        TreeMap<String,byte[]> streaming = new TreeMap<>();

        while (cursor.hasNext())
        {
            Map.Entry<Integer, Reload> entry = cursor.next();
            Integer key2= entry.getKey();
             Reload value = entry.getValue();

            System.out.printf("%s %s  %s\n",key2,value,value.getWord());
        }}
        /**
         * 将Account类添加入redis
         * **/
        @Test
        public void findTranfer(){
          String key="Account";
          List<Account> accounts=accountDao.findAccount();
          //List<RAccount> accountList=new ArrayList<>();
          Map<Integer, RAccount> map=new HashMap<>();
          for(Account Account:accounts){
              RAccount account=new RAccount();
              account.setAid(Account.getAid());
              account.setMoney(Account.getMoney());
              account.setUid(Account.getUid());
              map.put(Account.getUid(),account);

          }

          redisTemplate.opsForHash().putAll(key,map);
          redisTemplate.opsForValue().set(TimeUnit.MINUTES, key, 3);






        }
    @Test
    public void addTranfer(){
        String key="Account";
        RAccount account=new RAccount();
        RAccount account1= (RAccount) redisTemplate.opsForHash().get(key,1001);
        System.out.println(account1);
        redisTemplate.expire(key,10,TimeUnit.DAYS);
        int time=redisTemplate.getExpire(key).intValue();
        System.out.println(time);




    }


}

package lzl.com.example.demo.Service;


import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
/***
 * 实现定时任务
 *
 *
 * */

@Service
public class AsyncService {
  private static final SimpleDateFormat dateformat=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
  private Integer count=1;
  private Integer count2=1;
  private Integer count3=1;
  /**
   * 上次任务执行后开始开始计时
   * */
  @Scheduled(fixedRate = 6000000)
    public void scheduleTask(){
      //System.out.println(String.format("fixedRate 第%s次执行，时间为:%s",count++,dateformat.format(new Date())));
  }
  /**
   * 上次任务完成后一段时间后开始执行
   * **/
  @Scheduled(fixedDelay = 50000000)
    public void TaskAfterSleep() throws InterruptedException {
      //System.out.println(String.format("fixedDelay 第%s次执行，时间为:%s",count2++,dateformat.format(new Date())));
      //Thread.sleep(10000);
  }
  /**
   * cron属性可以指定任何时间的执行任务的时间表
   * */
  @Scheduled(cron = "0 * * * * *")
    public void TaskCron(){
      //System.out.println(String.format("cron 第 %s 次执行，时间为:%s",count3++,dateformat.format(new Date())));
  }

  public void tesetAsync() {

  }

}

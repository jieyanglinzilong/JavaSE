package com.atiguigu.bigdata.rdd

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object Pariation {
  def main(args:Array[String]):Unit={
    //*代表最大核数
    val sparkContext=new SparkConf().setMaster("local[*]").setAppName("parition");
    val sc=new SparkContext(sparkContext);
    /**添加并行度 创建RDD**/
    val list=List(1,2,3,4);
    //分区数=并行度 numSlices = 3 代表了三个分区
    var rdd1:RDD[Int]=sc.makeRDD(list,numSlices = 3);

    //println(rdd1.collect().mkString(", "))
    //local为单线程
    rdd1.saveAsTextFile("output/output02")

    sc.stop();


  }

}

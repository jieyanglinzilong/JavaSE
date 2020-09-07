package com.atiguigu.bigdata.rdd

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object Memory {
  def main(args:Array[String]):Unit={
    val sparkContext=new SparkConf().setMaster("local").setAppName("wordcount");
    val sc=new SparkContext(sparkContext);
    /**添加并行度 创建RDD**/
    val list=List(1,2,3,4);
    var rdd:RDD[Int]=sc.parallelize(list);
    var rdd1:RDD[Int]=sc.makeRDD(list);
    rdd.collect().foreach(println);
    println(rdd1.collect().mkString(", "))
    sc.stop();


  }

}

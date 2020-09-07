package com.atiguigu.bigdata.rdd

import org.apache.spark.{SparkConf, SparkContext}
import org.apache.spark.rdd.RDD

object diskRdd {
  def main(args:Array[String]):Unit={
    val sparkContext=new SparkConf().setMaster("local").setAppName("File-RDD");
    val sc=new SparkContext(sparkContext);
    //文件读取采用hadoop方式
    val fileRdd=sc.textFile("input")
    //可以用*模糊查找
    println(fileRdd.collect().mkString(","));



  }
}

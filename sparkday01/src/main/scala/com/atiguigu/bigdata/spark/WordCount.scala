package com.atiguigu.bigdata.spark

import org.apache.spark.rdd.RDD
import org.apache.spark.{SparkConf, SparkContext}

object WordCount {
  def main(args:Array[String]):Unit={
    val config:SparkConf =new SparkConf().setMaster("local[*]").setAppName("wordcount")
    val context=new SparkContext(config);
    val lines:RDD[String]=context.textFile("input");
    val words=lines.flatMap(_.split(" "));
    val wordToOne:RDD[(String,Int)]=words.map((_,1));
    val wordunit:RDD[(String,Int)]=wordToOne.reduceByKey(_+_);
    val result:Array[(String,Int)]=wordunit.collect();

    //print(result)
    result.foreach(println);
  }

}

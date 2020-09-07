package com.atiguigu.bigdata.scalaType

object Lesson_Object {
  val Name="周岚"
  def apply(score:Int): Unit ={
    println("Score 是",score)
  }

  def main(args:Array[String]):Unit={
    /*val a=100
    val b=100
    val c=a+b
    println(c)*/
    val person=new student("周月",30)
    println(person.age)
    println(person.sayName)
    Lesson_Object(10000)
  }

}
class Person{

}
class student(xname:String,xage:Int){

  val name=xname
  val age=xage
  var weight=0
  println("***in person****")
  def sayName(): Unit ={
    println("hello "+Lesson_Object.Name)
  }
  def this(xname:String,xage:Int,xweight:Double){
    this(xname,xage)
    this.weight=weight

  }


}

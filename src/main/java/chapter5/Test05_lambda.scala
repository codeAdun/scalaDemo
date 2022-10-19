package chapter5

object Test05_lambda {

  //1、对于一个函数我们可以：定义函数、调用函数
  def main(args: Array[String]): Unit = {
    //调用函数
    foo();

    //定义函数
    def foo():Unit = {
      println("foo....")
    }
  }

  //一、函数可以作为值进行传递
  //1、调用foo函数，把返回值给变量f
  val f = foo1();
  println("1.1 调用foo函数，把返回值给变量f:"+f)

  //(2) 在被调用函数foo后面加上_ ，相当于把函数foo当成一个整体，传递给变量f1
  //指定了变量的类型是函数体
  val f1:Int=>Int=foo1 _
  foo1();

  //(3) 如果明确变量类型，那么不使用下划线也可以将函数作为整体传递给变量
  //var f2:() => Int =foo1()


  def foo1() : Int ={
    println("foo...999");
    return 1
  }




}

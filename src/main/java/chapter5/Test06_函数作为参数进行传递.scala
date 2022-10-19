package chapter5

object Test06_函数作为参数进行传递 {

  def main(args: Array[String]): Unit = {
    // 1、定义一个函数，函数参数还是一个函数签名；
    // f表示函数名称；
    //（int，int） 表示输入两个int参数；int表示函数返回值
    def f1(f:(Int,Int)=>Int):Int ={
      f(2,4);
    }
    // (2) 定义一个函数，参数和返回值类型和f1的输入参数一致
    //def add(a:Int,)


  }

}

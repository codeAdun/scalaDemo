package chapter5

//定义一个函数，实现将传入的名称打印出来
object Test01_function {
  def main(args: Array[String]): Unit = {
    // 函数定义
    def f(arg:String):Unit = {
      println(arg);
    }
    f("hello world");

    //(1) scala语言可以在任何的语法结构中声明任何的语法
    import java.util.Date;
    new Date();

    //(2) 函数没有重载和重写的概念，程序报错
    def test() : Unit ={
      println("无参，无返回值");
    }
    test();

    def test3(name:String) : Unit ={
      println();
    }

    //(3) scala中函数可以嵌套定义
    def test2() : Unit={
      def test4(name:String) : Unit={
        println("函数可以嵌套定义");
      }
    }

    test2();


    //函数5：多参，无返回值
    def test5(name: String,age:Int): Unit ={
      println(s"$name,$age");
    }

    test5("dalang",40);

  }
}

package chapter5

object Test02_TestFunction {

  def main(args: Array[String]): Unit = {
    // (0)函数的标准写法
    def f(s:String) : String = {
      return s + "jinlian";
    }
    println(f("hello"));

    // 1、return 可以省略，scala会使用函数体的最后一行代码作为返回值
    def f1(s:String) : String ={
      s+"jinlian";
    }
    println(f1("hello"))

    //2\如果函数体只有一行代码，可以省略花括号
    def f2(s:String) : String = s+"jinlian";
    println(f2("hellojian"));

    //3\返回值类型如果能够推断出来，那么可以省略（：冒号和返回值类型一起省略）
    def f3(s:String) = s+"jinlian"
    println(f3("hello3"))

    //4\如果有return，则不能省略返回值类型，必须指定
    def f4() : String ={
      return "xieme4";
    }

    //5\如果函数明确声明unit，那么即使函数体中使用return关键字也不起作用
    def f5() : Unit ={
      return  "hello5";
    }
    println(f5())

    //6\scala如果期望无返回值类型，可以省略等号
    //将无返回值的函数称之为过程
    def f6(){
      "dalang6"
    }
    println(f6());


    //7\如果函数无参，但是声明了参数列表，那么调用时，小括号，可加可不加
    def f7() = "dalang7";
    println(f7());
    println(f7);

    //8 如果函数没有参数列表，那么小括号可以省略，调用时小括号必须省略
    def f8="dalang";
    println(f8)

    //9 如果不关心名称，只关心逻辑处理，那么函数名def可以省略
    def f9(name:String):Unit = {
      println(name)
    }
    //匿名函数,把函数名称省略，直接表示逻辑，lambda表达式
    (name:String) => {println(name)}
    (name:String) => println(name)
  }


}

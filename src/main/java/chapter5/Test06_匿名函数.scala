package chapter5

object Test06_匿名函数 {

  /*
  1、没有匿名的函数就是匿名函数
      （x：Int）=> {函数体}
      x表示参数，Int:表示输入参数类型；函数体：表示具体代码逻辑
  2、实例实操



  *
  */

  def main(args: Array[String]): Unit = {
    // 1、定义一个函数：参数包含数据和逻辑函数
    def operation(arr:Array[Int],op:Int => Int) ={
        for (elem <- arr) yield op(elem)
    }

    //2、定义逻辑函数
    def op(ele:Int) : Int ={
      ele + 1
    }

    //(3) 标准函数调用
    val arr = operation(Array(1,2,3,4),op)
    println(arr.mkString(","))

    // 4、采用匿名函数
    val arr1 = operation(Array(1,2,3,4),(ele: Int)=>{ele+1})
    println(arr1.mkString(","))
  }

}

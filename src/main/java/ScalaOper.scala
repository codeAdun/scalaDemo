object ScalaOper {
/*
在Scala中其实是没有运算符的，所有运算符都是方法。
l scala是完全面向对象的语言，所以数字其实也是对象
l 当调用对象的方法时，点.可以省略
l 如果函数参数只有一个，或者没有参数，()可以省略
* */
  def main(args: Array[String]): Unit = {
    val i: Int = 10;
    val j: Int = i.+(20);
    val k: Int = j+(20)
    val m : Int = k+30;
  }

}

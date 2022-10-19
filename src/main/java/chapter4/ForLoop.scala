package chapter4

object ForLoop {
  def main(args: Array[String]): Unit = {

    //1、范围遍历，for推导四字
    //通过 <- 把值给到i，本质是方法的调用
    for (i <- 1 to 10){
      println(i+"hello");
    }
    //1、有一个参数可以省略
    //2、本意是方法的调用
    for (i : Int <- 1.to(10)){
      println(i+"hello");
    }

   println("22222222222")
    val result = for ( i <- Range(1,5) ) yield {
      i * 2
    }
    println(result)

    println("--------------------------")

    scala.util.control.Breaks.breakable {
      for ( i <- 1 to 5 ) {
        if ( i == 3 ) {
          scala.util.control.Breaks.break
        }
        println(i)
      }
    }


  }


}

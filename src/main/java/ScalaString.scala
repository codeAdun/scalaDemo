object ScalaString {

  def main(args: Array[String]): Unit = {
      val name : String = "scala";
      val subname : String =name.substring(0,2);
      println(subname);
    println("name"+subname);
    println("name=%s\n",name);
    println("name=",name);
    // 插值字符串
    // 将变量值插入到字符串
    println(s"name=${name}")
    // 多行格式化字符串
    // 在封装JSON或SQL时比较常用
    // | 默认顶格符
    println(
      s"""
         | Hello
         | ${name}
        """.stripMargin)
  }

}

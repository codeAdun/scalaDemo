import scala.io.StdIn

object ScanIn {

  def main(args: Array[String]): Unit = {
    //val name: String=StdIn.readLine();
    //println(name);
    //var age : Int=StdIn.readInt();
    //println(age);

    //从文件中获取输入
    //
    scala.io.Source.fromFile("input/test.txt").foreach(
      line=>{
        print(line);
      }
    );

    scala.io.Source.fromFile("input/test.txt").getLines();
  }

}

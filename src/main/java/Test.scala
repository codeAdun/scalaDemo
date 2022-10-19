object Test {

  def main(args: Array[String]): Unit = {
    System.out.println("gg");
    println("hellp");

    //变量：
    //变量1：变量的类型在变量名之后等号之前声明
    //
    var username : String = "zhangsan";
    var userpassworde : String = "zhangsan";

    /*
    变量的类型如果能够通过变量值推断出来，那么可以省略类型声明，这里的省略，并不是不声明，而是由Scala编译器在编译时自动声明编译的。
    2、省略变量类型，能自动推测
    */
    var username2 = "zhangsan";
    var userpassword2 = "dddd";


    /*
      Java语法中变量在使用前进行初始化就可以，
      但是Scala语法中是不允许的，必须显示进行初始化操作。
    * */

    //var username3; //error
    var username3 = "zhangsan";

    /*
    2.2.3 可变变量,值可以变，类型不可以变
    值可以改变的变量，称之为可变变量，但是变量类型无法发生改变, Scala中可变变量使用关键字var进行声明
    * */
    // 用户名称
    var username5 : String = "zhangsan"
    username5 = "lisi" // OK
    //username5 = true // Error


    /*
    2.2.4 不可变变量
值一旦初始化后无法改变的变量，称之为不可变变量。Scala中不可变变量使用关键字val进行声明, 类似于Java语言中的final关键字
    * */


  }

}

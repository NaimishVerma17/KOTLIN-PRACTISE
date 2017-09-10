

fun main(args:Array<String>)
{
    val name:String?  //"?" here means that variable can have value after declaration
    val age:Int
    var num1:Float
    var num2:Float
    var sum:Double
    println("Enter name")
    name= readLine();
    println("Enter age")
    age= readLine()!!.toInt();
    println("Enter first number")
    num1= readLine()!!.toFloat();
    println("Enter second number")
    num2= readLine()!!.toFloat();
    sum=(num1+num2).toDouble();
    println("********OUTPUT*********")
    println("Name: "+name)
    println("Age: "+age)
    println("First Number: $num1")
    println("Second Number: "+num2)
    println("Sum: "+sum);
}
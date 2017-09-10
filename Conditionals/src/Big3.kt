/**
 * Created by itakg on 9/3/2017.
 */

fun main(args:Array<String>)
{
    var num1:Int
    var num2:Int
    var num3:Int
    println("Enter three nos.")
    num1= readLine()!!.toInt()
    num2= readLine()!!.toInt()
    num3= readLine()!!.toInt()
    if(num1>num2)
    {
        if(num1>num3)
        {
            println("$num1 is greatest")
        }
        else
        {
            println("$num3 is greatest")
        }
    }
    else if(num2>num1)
    {
        if(num2>num3)
        {
            println("$num2 is greatest")
        }
        else
        {
            println("$num3 is greatest")
        }
    }
}
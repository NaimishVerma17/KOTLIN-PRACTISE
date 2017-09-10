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
   var result= if(num1>num2)  //result is stored in a variable "result"
    {
        if(num1>num3)
        {
            "$num1 is greatest"
        }
        else
        {
            "$num3 is greatest"
        }
    }
    else
    {
        if(num2>num3)
        {
            "$num2 is greatest"
        }
        else
        {
           "$num3 is greatest"
        }
    }
    print(result)
}
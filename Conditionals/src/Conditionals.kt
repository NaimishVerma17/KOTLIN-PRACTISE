/**
 * Created by itakg on 9/3/2017.
 */


fun main(args:Array<String>){
    println("Enter a no.")
    var number:Int= readLine()!!.toInt()
    if(number%2==0)
    {
        println("No. is even")
    }
    else if (number%2!=0)
    {
        println("No. is odd")
    }
}
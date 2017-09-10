import java.util.*

/**
 * Created by itakg on 9/4/2017.
 */
fun main(args: Array<String>) {
    hello()
    var x=hello2()
    var y=hello3(2.0f,18.0f)
    println(getDate())
    println(x)
    println(y)
}


fun hello()
{
    println("Hello from the first function")
}

fun hello2():String{
    return "Hello from second function"
}

fun hello3(num1:Float,num2:Float):Float{
    return num1+num2
}

fun getDate():Date{
    return Date()
}
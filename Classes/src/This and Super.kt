/**
 * Created by itakg on 9/8/2017.
 */

open class Parent
{
   open  fun first(num1:Double,num2:Double):
   Double {
        return(Math.pow(num1,num2))
    }
}

class Child: Parent() {

    override fun first(num1: Double, num2: Double): Double {
        return super.first(num1, num2)
    }

    fun second(num1:Double,num2:Double):
    Double{
       return this.first(num1,num2)
    }

}

fun main(args: Array<String>) {
    var operation=Child()
    println("Enter 2 nos.")
    var num1:Double= readLine()!!.toDouble()
    var num2:Double= readLine()!!.toDouble()
    var result:Double=operation.second(num1,num2)
    println("Result is : "+result)
}
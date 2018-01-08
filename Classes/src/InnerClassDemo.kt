/**
 * Created by itakg on 9/10/2017.
 */
import java.io.*
import java.util.*;

class Outer {
    private var a = "naimishverma"
    fun sum(num1: Int, num2: Int):
            Int {

        return num1 + num2
    }

    inner class Inner {
        fun mul(num1: Int, num2: Int): Int {
            println(a)
            println(sum(num1, num2))

            return num1 * num2
        }
    }
}

fun main(args: Array<String>) {
    var instance_outer = Outer()
    var instance_inner = Outer().Inner()
    var date = Date()
    println(date)
    println(instance_inner.mul(4, 5))
}
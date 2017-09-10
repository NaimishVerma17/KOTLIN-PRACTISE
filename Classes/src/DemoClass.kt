/**
 * Created by itakg on 9/4/2017.
 */

class Man()
{
    var name:String=""
    var age:Int=19

    fun details(){
        println("I can walk")
    }
}

fun main(args: Array<String>) {
    var john=Man()
    john.age=20
    john.name="John"
    println(john.name)
    println(john.age)
    john.details()
}
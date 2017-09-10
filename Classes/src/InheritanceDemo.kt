/**
 * Created by itakg on 9/4/2017.
 */

  abstract open class First(open var name:String,open var age:Int)
{
    abstract fun gender() //Abstract function

    open fun display()
    {
        println("You are first user")
        println("Your name is $name and your age is $age")
    }
}

class Second (  var name1:String,var age1:Int,var gen:String):First(name1,age1){
    override fun gender() {

        println("Your gender is $gen")
    }

    override fun display()
    {
        println("You are second user")
        println("Your name is $name and your age is $age")
    }

}

fun main(args: Array<String>) {
    var user1=Second("Sam",21,"Male")
    user1.display()
    user1.gender()

    var user2=Second("Kevin",19,"Female")
    user2.display()
    user2.gender()
}
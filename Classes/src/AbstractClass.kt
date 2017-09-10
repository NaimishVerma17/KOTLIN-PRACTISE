/**
 * Created by itakg on 9/8/2017.
 */

abstract class Credit(){
    fun ID():String{
        return "2228782hdwdhu827"
    }
    abstract fun Amount():Double
}

class User():Credit(){
    override fun Amount(): Double {
        return 94150.98
    }
}

fun main(args: Array<String>) {
    var u1=User()
    println(u1.ID())
    println(u1.Amount())


}
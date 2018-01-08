/**
 * Created by itakg on 9/8/2017.
 */

abstract class Credit() {
    fun ID(): String {
        println(Amount())
        return "2228782hdwdhu827"

    }

    abstract fun Amount(): Double
}

class User1() : Credit() {
    override fun Amount(): Double {
        return 94150.98
    }
}

class User2():Credit(){
    override fun Amount(): Double {
        return 250.20
    }

}

fun main(args: Array<String>) {
    var u1 = User2()
    println(u1.ID())
    println(u1.Amount())


}
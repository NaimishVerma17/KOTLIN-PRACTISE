
/**
 * Created by itakg on 9/6/2017.
 */

interface Sum{
    var num1:Double
    val num2:Double
    fun calculate():Double
    fun display( result:Double)
}
class Perform():Sum{
     override var num1:Double =0.0
    override var num2:Double =0.0

    constructor(n1:Double,n2:Double) : this()  {
       this. num1=n1
       this. num2=n2
    }

   override fun calculate(): Double {
        return num1+num2
    }

     override fun display(result: Double){
        println(result)
    }

}

fun main(args: Array<String>) {

    println("Enter two nos.")
    var n1:Double= readLine()!!.toDouble()
    var n2:Double= readLine()!!.toDouble()

    var operation1=Perform(n1,n2)
    var result:Double=operation1.calculate()
    operation1.display(result)
}
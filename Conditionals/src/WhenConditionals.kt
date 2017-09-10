/**
 * Created by itakg on 9/3/2017.
 */

fun main(args: Array<String>) {
    println("Enter a no.")
    var no:Int= readLine()!!.toInt()

    when(no){
        1->println("No. is one.");
        2->println("No. is two.");
        3,4->println("No. is three or four.");
        in 5..10->println("No. is in the range of 5 to 10.")
        !in 5..10->println("No. is not in the range of 5 to 10.")

    }
}
/**
 * Created by itakg on 9/10/2017.
 */
fun main(args: Array<String>) {
    println("Enter a no")
    var no:Int
            = readLine()!!.toInt()
   try{

       var ans=100/no
    println("The answer is: "+ans)

   }
   catch (exception:Exception)
   {
       println(exception.message)
   }

    println("The program is executed!!")

}
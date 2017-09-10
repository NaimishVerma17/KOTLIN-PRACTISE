/**
 * Created by itakg on 9/10/2017.
 */


fun ArrayList<String>.swap(index1:Int,index2:Int):ArrayList<String> //defined the property swap which can be accessed anywhere with the name of arrayList
{
    val temp:String=this.get(index1)
    this.set(index1,this.get(index2))
    this.set(index2,temp)
    return this
}
fun main(args: Array<String>) {
    var member1=ArrayList<String>()
    member1.add(readLine()!!)
    member1.add(readLine()!!)
    member1.add(readLine()!!)
    println(member1.swap(1,2))
    }


/**
 * Created by itakg on 9/4/2017.
 */
//
//class Man()
//{
//    var name:String=""
//    var age:Int=19
//
//    fun details(){
//        println("I can walk")
//    }
//}
//
//fun main(args: Array<String>) {
//    var john=Man()
//    john.age=20
//    john.name="John"
//    println(john.name)
//    println(john.age)
//    john.details()
//}
data class User3(val name:String,val age:Int)

fun main(args: Array<String>) {
    val obj=User3("Naimish",20)
    val(name,age)=obj;
    print(name+"\t"+age)
}
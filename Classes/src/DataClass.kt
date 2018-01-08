/**
 * Created by itakg on 9/6/2017.
 */

class Information1(var name: String, var branch: String) {}

data class Information2(val name: String="", val branch: String="")
data class User(val name: String = "", val age: Int = 0)

fun main(args: Array<String>) {
    var o1 = Information1("Naimish", "Information Technology")
    var o2 = Information2("Naimish", "Information Technology")
    val jack=User("Jack",4)
    val olderJack=jack.copy(age=5)
    println(jack)
    print(olderJack)

    println(o1)
    println(o2)

    var (name, branch) = o2;
    println(name)
    println(branch)

}
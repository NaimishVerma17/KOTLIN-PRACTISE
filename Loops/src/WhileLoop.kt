/**
 * Created by itakg on 9/3/2017.
 */
fun main(args: Array<String>) {

    //forward loop

    var count=10
    while (count!=20)
    {
        println(count)
        count++
    }

    //reverse loop

    var index=10
    while (index!=0)
    {
        println(index)
        index--
    }

    //do while loop will execute even if the condition is false for first time
    var iterate=3

    do {
        print(iterate)
    }while (iterate>4)
}
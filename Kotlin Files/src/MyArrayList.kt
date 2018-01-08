/**
 * Created by itakg on 9/3/2017.
 */
fun main(args: Array<String>) {

    var myList1 = arrayListOf<String>("One", "Two", "Three", "Four")
    for (i in myList1)
        println(i + " ")

    var myList2 = arrayListOf<String>("Five", "Six")

    println(myList1[2] + " " + myList2[1])
    println(myList1 + myList2)

    println(myList1.isNotEmpty())
    println(myList2.contains("One"))

    myList1.add("Eight")
    myList2.remove("Six")
    println(myList1)
    println(myList2)
    var myList3 = myList1.add("One")
    println(myList1)
    println(!myList3) //returns true or false weather task is completed or not

    var newList = myList1.subList(1, 3) // 1 is inclusive and 3 is exclusive
    println(newList)
}
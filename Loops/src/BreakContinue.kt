/**
 * Created by itakg on 9/3/2017.
 */
fun main(args: Array<String>) {

   // Using break

    println("Enter a string")
    var s= readLine()
    for (i in s!!)
    {
       if(i=='a')
           break
        print(i)
    }

    //Using continue

    var name= listOf<String>("Sam","Infernoq","Shuttler","Kapilq","Naimish")

    for (n in name)
    {
        if(n.contains('q'))
            continue
        print(n+" ")
    }

    //using labels

    first@ for (i in 1..5)
    {
        for (j in 5..10)
        {
            if (j==7)
                break@first
            println(j)
        }
    }



}
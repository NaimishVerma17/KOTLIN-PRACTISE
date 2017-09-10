/**
 * Created by itakg on 9/3/2017.
 */
fun main(args: Array<String>) {

    //To print odd no from 1 to 100

    for(i in 1..10)
    {
        if(i%2!=0)
            println(i)
    }


    //looping in array or list

    var name= listOf<String>("Naimish","Prince","Vivek")
    for(i in name)
        println(i)


    //to get the index we use

    for((index,item)in name.withIndex())
    {
        println("At position $index, we have $item")
    }

}
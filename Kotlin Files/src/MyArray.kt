import com.sun.xml.internal.fastinfoset.util.StringArray

/**
 * Created by itakg on 9/3/2017.
 */
fun main(args: Array<String>) {

    var first = arrayOf("One", "Two")
    var mixed = arrayOf("Abc", "Def", 3, 5.4); // You can use mixed data types in an array.
    println("Element is "+first[1]);
    println("Element is "+mixed[3]);

    println(mixed[1])

    mixed[1]=70 //Updation is allowed in array
    println(mixed[1])

    var no= intArrayOf(1,2,3,4,5,6,7,8,9)

    var floatNo= floatArrayOf(1.2f,3.4f,6.0f)

    println(no.isEmpty()) //returns boolean value

    println(floatNo.contains(1.2f))

    var two= arrayOf("Three","Four","Five")
    var three=first+two

    println("Length of three is: ${three.size}");

}
import java.lang.Integer.parseInt

/**
 * Created by itakg on 8/29/2017.
 */
fun main(args:Array<String>){
    println(hello("9","6"));
    loop();
}

val i = null;
fun hello(A:String,B:String):
String{
    val x:Int=parseInt(A);
    val y:Int=parseInt(B);
    val z:Int=x*y;
    return z.toString();
}
fun loop()
{
    var index=0;
    val items= listOf(9,8,11,12);
    while (index<items.size)
    {
        print(  " "+items[index] );
        index++;
    }
}
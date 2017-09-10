

fun main(args:Array<String>)
{
    var a=25; //var is used if any updation is required in variabe in future else val is used.
    var b=32;
    var c=a+b;
    println(c);
    var name:String
    name="Naimish"
    val age:Int=19;
    val pi:Float=3.14f;
    val s2:Double=1.414;
    println(name+" "+age+" "+pi+" "+s2);

    var s:String?//"?" here means that s can have a null value.
    s=null
    print(s!!);//"!!" here means that s must have a value or else it will show an error.
}
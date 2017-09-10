/**
 * Created by itakg on 9/4/2017.
 */
fun main(args: Array<String>) {
    var name= listOf<String>("Sarah","Ram","John","Sam")
    print(generate(name))
}

fun generate(name:List<String>):List<String>
{
 var email= arrayListOf<String>()
    for(i in name)
    {
        email.add(i+"@gmail.com")
    }
    return email
}
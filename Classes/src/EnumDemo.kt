/**
 * Created by itakg on 9/9/2017.
 */

enum class Seat{
    WINDOW,
    AISLE,
    MIDDLE
}

fun getSeat()
:Seat{
    return Seat.WINDOW
}

fun main(args: Array<String>) {
    println("Your seat is ${getSeat()}")
}
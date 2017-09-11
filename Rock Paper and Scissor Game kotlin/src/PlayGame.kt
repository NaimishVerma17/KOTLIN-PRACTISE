/**
 * Created by itakg on 9/11/2017.
 */

fun main(args: Array<String>) {
     var player1Score:Int=0
     var player2Score:Int=0
     var player1FinalScore:Int=0
     var player2FinalScore:Int=0
println("Player 1")
    var player1=Players()
    println()
    var player2=Players()
    println()
    for(i in 1..20)
    {
        println("Game no: "+i)
        player1Score=0
        player2Score=0
        player1.storeWeapon()
        player2.storeWeapon()



        for (j in 1..3)
        {
            println("Round no: "+j)
            if(player1.getWeapon().battle(player2.getWeapon())) {
                player1Score++
                println("Round win by Player 1.")
            }
            else{
                player2Score++
            println("Round win by Player 2.")}

        }
        if(player1Score>player2Score) {
            player1FinalScore++
            println("Game won by Player 1.")
        }
        else {
            player2FinalScore++
            println("Game won by Player 2.")
        }
    }
    println("*******FINAL RESULT********")
    println("Final score of Player 1: $player1FinalScore")
    println("Final score of Player 2: $player2FinalScore")
    if(player1FinalScore>player2FinalScore)
        println("Tournament winner is Player 1.")
    else
        println("Tournament winner is Player 2.")
}


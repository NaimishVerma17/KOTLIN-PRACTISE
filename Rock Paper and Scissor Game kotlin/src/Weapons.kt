import java.util.*

/**
 * Created by itakg on 9/10/2017.
 */

open public class Weapons
{

    private var strength:Int?=null
    private var Rock:String="rock"
    private var Paper:String="paper"
    private var Scissor:String="scissor"
    private var name:String?=null

   fun initialStrength(){
        this.strength=Random().nextInt(1000)
    }


    public fun setName(name:String)
    {
        this.name=name
        println(this.name+"\t"+this.strength)

    }
    public fun getName():String?
    {
        return this.name
    }
    private fun setStrength(strength:Int)
    {
        this.strength=strength
    }
    public fun getStrength():Int?
    {
        return this.strength
    }
    public fun battle(weapon:Weapons):Boolean
    {

         var weapon1Strength:Int?=this.getStrength()
         var weapon2Strength:Int?=weapon.getStrength()
        println("Player 1: "+this.getName())
        println("Player 2: "+weapon.getName())
        if(this.getName().equals(Rock)&&weapon.getName().equals(Paper))
        {
            weapon1Strength=weapon1Strength!!/2
            weapon2Strength=weapon2Strength!!*2

        }
       else if(this.getName().equals(Paper)&&weapon.getName().equals(Rock))
        {
            weapon1Strength=weapon1Strength!!*2
            weapon2Strength=weapon2Strength!!/2
            this.setStrength(weapon1Strength*2)
            weapon.setStrength(weapon2Strength/2)

        }
        else if(this.getName().equals(Paper)&&weapon.getName().equals(Scissor))
        {
            weapon1Strength=weapon1Strength!!/2
            weapon2Strength=weapon2Strength!!*2
            this.setStrength(weapon1Strength/2)
            weapon.setStrength(weapon2Strength*2)

        }
        else if(this.getName().equals(Scissor)&&weapon.getName().equals(Paper))
        {
            weapon1Strength=weapon1Strength!!*2
            weapon2Strength=weapon2Strength!!/2
            this.setStrength(weapon1Strength*2)
            weapon.setStrength(weapon2Strength/2)

        }
       else if(this.getName().equals(Scissor)&&weapon.getName().equals(Rock))
        {
            weapon1Strength=weapon1Strength!!/2
            weapon2Strength=weapon2Strength!!*2
            this.setStrength(weapon1Strength/2)
            weapon.setStrength(weapon2Strength*2)

        }
        else if(this.getName().equals(Rock)&&weapon.getName().equals(Scissor))
        {
            weapon1Strength=weapon1Strength!!*2
            weapon2Strength=weapon2Strength!!/2
            this.setStrength(weapon1Strength/2)
            weapon.setStrength(weapon2Strength*2)

        }
        if(weapon1Strength!!>weapon2Strength!!)
            return true
        else
            return false
    }
}

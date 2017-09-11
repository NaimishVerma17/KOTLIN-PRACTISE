import java.util.*

/**
 * Created by itakg on 9/11/2017.
 */
class Players {
    private var rock: Rock? = null
    private var paper: Paper? = null
    private var scissor: Scissor? = null
    var weaponToSelect= arrayListOf<Weapons>()
    private var random=Random()
    private var index:Int?=null


    constructor() {
        this.rock=Rock()
        this.paper=Paper()
        this.scissor=Scissor()

    }

    fun storeWeapon()
    {
        weaponToSelect.add(rock!!)
        weaponToSelect.add(paper!!)
        weaponToSelect.add(scissor!!)
    }
    fun getWeapon()
    :Weapons{

        return this.weaponToSelect.get(random.nextInt(3))
    }
}
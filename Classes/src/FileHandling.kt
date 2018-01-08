import java.io.FileReader
import java.io.FileWriter

/**
 * Created by itakg on 9/10/2017.
 */

fun main(args: Array<String>) {
    println("1-Read from file.\n2-Write to file.")
    var choice: Int = readLine()!!.toInt()
    when (choice) {
        1 -> {
            read_file()
        }
        2 -> {
            println("Enter the text that you want to save")
            var text: String = readLine().toString()
            write_file(text)
        }
    }


}

fun write_file(text: String) {

    try {
        var fileWrite = FileWriter("Information.txt", true)
        fileWrite.write(text + "\n")
        fileWrite.close()
        println("Writing to file is commpleted!!")
    } catch (e: Exception) {
        println(e.message)
    }
}

fun read_file() {
    try {
        var fileRead = FileReader("Information.txt")
        var data: Int? = null

        do {
            data = fileRead.read()
            print(data.toChar())

        } while (data != -1)


    } catch (e: Exception) {
        println(e.message)
    }
}
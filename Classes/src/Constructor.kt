/**
 * Created by itakg on 9/4/2017.
 */

class Course {
    var courseName: String = ""
    var courseType: String = ""
    var coursePrice: Int = 0
//
//    init {
//        this.courseName = courseName
//        this.coursePrice = coursePrice
//        this.courseType = courseType
//    }
    constructor(courseName: String, courseType: String, coursePrice: Int){
        this.courseName = courseName
        this.coursePrice = coursePrice
        this.courseType = courseType
}

    fun display() {
        println(this.courseName + " " + this.courseType + " " + this.coursePrice)
    }

}

fun main(args: Array<String>) {
    var swift = Course(courseName = "IOS Development", coursePrice = 300, courseType = "Video")
    swift.display()
}
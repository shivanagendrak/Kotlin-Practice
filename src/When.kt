fun main(){
 simplecalender()
}
fun simplecalender(){
    print("Enter 1 to 7 : ")
val day: Int = readln().toInt()
    val result = when (day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Error, Entered Wrong Number"
    }
    print(result)
}
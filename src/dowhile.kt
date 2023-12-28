/*fun main(){
    var i = 0
    do {
        println("Shiva")
        i++
    }
        while (i<5)
}*/

fun main(){
    println("Multiplication Table")
    println("Enter Number for Muliplication table upto 20 ")
    print("Enter the Number: ")
    val table: Int = readln().toInt()
    if (table > 20)
    {
        println("You Entered $table its Above 20, So ")
        println("Please Try Again ")
        }
    else
    {
            var i = 1
            do {
                println("$table X " + i + " = " + table * i)
                i++
            }
            while (i < 11)
        }
}
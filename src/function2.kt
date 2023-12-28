fun main(){
    print("Enter the Number: ")
    val input = readln().toInt()
    println("Input Number Adding to 5 ")
    val result:Int = funtion2(input)
    println("Result is $result")
}
fun funtion2(x:Int):Int{
    val sum = x + 5
    return sum
}
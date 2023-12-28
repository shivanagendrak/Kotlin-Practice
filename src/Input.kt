fun input(x: Int, y:Int):Int{
    val sum = x + y
    return sum
}
fun main(){
    print("Enter Value of x: ")
    val input1 = readln().toInt()
    print("Enter Value of y: ")
    val input2 = readln().toInt()
    val result:Int = input(input1,input2)
    println("Result is $result ")
}
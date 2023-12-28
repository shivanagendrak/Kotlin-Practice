// shorter syntax for return values
fun shortersum(x: Int, y:Int)=x+y
fun main(){
    print("Enter Value of x: ")
    val input1 = readln().toInt()
    print("Enter Value of y: ")
    val input2 = readln().toInt()
    val result:Int = shortersum(input1,input2)
    println("Result is $result ")
}
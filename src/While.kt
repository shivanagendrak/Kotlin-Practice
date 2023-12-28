fun main(){

    operators()
}
fun whileLoopTree(){
  var i = 1

    while (i<=5){
        println(i)
        i++
    }
}

fun operators(){
    var customers = 10
    customers += 3
        customers - 1 // you can write like this too customers-=1
        customers * 4 // customers *= 4
        customers /= 3
    println(customers)
}
// Operators:
// Integers = Byte , Int , Long , Short
// String = String
// Booleans = Boolean // true , false
// Characters = Char
// Floating Point Numbers = Float , Double
// Unsigned Integers = UByte , UInt , ULong , UShort

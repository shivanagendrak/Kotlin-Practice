fun main(){
// Collections:
    //Lists
    //Sets
    //Maps
// Lists:
    // you can duplicate but you cant change immutable
    val cars = listOf("Honda","Lamborghini","Pagani","BMW")
    println(cars)

    // you can change the items , this can mutable
    val fruits = mutableListOf("Apple", "Mango","grapes")
    println(fruits)

    // you can do casting , casting means : you can change object from one datatype to other type
    val newcars: List<String> = fruits
    println(newcars)


}
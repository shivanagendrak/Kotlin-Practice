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

    // you can do "CASTING" , casting means : you can change object from one datatype to other type
    val newcars: List<String> = fruits
    println(newcars)

    // Accessing Items in List
    println("i love ${fruits[0]} in the fruits")
    // when i want to see which item is first in the list
    println("The first Item from the list of fruits is ${fruits.first()}")
// when i want to see which item is last in the list
    println("The Last Item from the list of fruits is ${fruits.last()}")
    // i want to calculate how many types of fruits are in the fruits list
    println("Total types of Fruits in the fruits list are ${fruits.count()}")
// to check the item is there in the list or not we are using "in" keyword
    // true or false
    println("Apple" in fruits)

    // if you want to add or remove something from a list
    fruits.add("Pineapple")
    println("Adding a fruits to list $fruits")
    // removing pineapple from list
    fruits.remove("Pineapple")
    println(fruits)
}
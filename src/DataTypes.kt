/*
* Variable and data types in Kotlin*/

fun main(args: Array<String>) {
    //implicit type conversion
    var language = "Kotlin" // String
    var version = 1 // int

    //Explicit type conversion
    var name: String // variable declaration of type String
    name = "Sharath" // variable initialization
    name = "Sharath Weaver" // mutable type

    var id: Int // variable declaration of type Int
    id = 1 // variable initialization

    val text = "Hello World"
    // text = "Kotlin World" // Error : val cannot be reassigned

    //Numbers
    var byte: Byte = 1 //Byte
    var int: Int = 1 // Int
    var short: Short = 1 // Short
    var long: Long = 1 // Long
    var float : Float = 1.2f // Float : float values should end with f
    var double : Double = 1.2 // Double

    //Characters
    var char: Char = 'K'
    // var char: Char = 23 // Error: unlike java, cannot assign number to char type variable
    println(char)
    char = 'z'
    println(char)

    // We can use underscore to make numbers more readable
    var value = 10_000
    print(value)

    //Booleans
    var boolean: Boolean = true

}
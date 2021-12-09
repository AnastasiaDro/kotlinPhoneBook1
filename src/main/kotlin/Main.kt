import java.util.*

fun formula(a : Float, b : Float, c : Float, d : Float) : Float {
    return (a * (b + (c/d)))
}

fun inner(a : Int) : Boolean {
    return (a in 10..20)
}

fun maxOf(a : Int, b : Int) = if (a >= b) a else b

fun printPositive (a : Int)
{
    if (a >= 0)
        println("positive")
    else
        println("negative")
}

fun isNegative(a : Int) : Boolean {
    if (a >= 0)
        return false
    return true
}

fun printName(name : String) {
    println("Hello, $name !")
}

fun year(year : Int)
{
    if (year % 4 == 0)
    {
        if (year % 100 == 0 && year % 400 != 0)
        {
            println("false")
            return
        }
        println("true")
        return
    }
    println("false")
}

fun sw(a : Int) {
    when(a%2)
    {
        0 -> println("0")
        else -> println("1")
    }
}
fun div(a : Float, b: Float) = a/b

fun main(args: Array<String>) {
    val phoneBook = PhoneBook()

    var inputS  = ""
    val scan = Scanner(System.`in`)
    while (inputS != "EXIT") {

        inputS = scan.next()

        try {
            when (inputS) {
                "SEARCH" -> phoneBook.showContacts()
                "ADD" -> phoneBook.addContact(phoneBook.generateContact())
            }
        }
        catch (e : Exception) {println("oooops")}
    }
    scan.close()




}
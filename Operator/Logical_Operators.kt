//Write a Kotlin program that uses logical operators (AND, OR, and NOT) to determine whether a given number is between two specified ranges.

fun main() {

    val number = 25

    // Using AND (&&)
    val isBetween = number >= 10 && number <= 50

    println("Number: $number")
    println("Is between 10 and 50? $isBetween")

    // Using OR (||)
    val isOutside = number < 10 || number > 50
    println("Is outside 10 and 50? $isOutside")

    // Using NOT (!)
    val notBetween = !isBetween
    println("NOT between 10 and 50? $notBetween")
}

/*
Description: Simple program to understand how return works in Kotlin
*/

fun add(a: Int, b: Int): Int {
    // This function calculates the sum
    return a + b   // 'return' sends the answer back
}

fun main() {

    val num1 = 5
    val num2 = 3

    // Calling the function
    val result = add(num1, num2)

    println("First Number: $num1")
    println("Second Number: $num2")
    println("Sum is: $result")
}

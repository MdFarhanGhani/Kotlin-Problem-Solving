/*
Topic: Kotlin val and var
Level: Beginner
Concept: Immutable vs Mutable variables

Explanation:
- val = immutable (cannot be reassigned)
- var = mutable (can be reassigned)
*/

fun main() {

    // Immutable variable
    val companyName = "Tech Solutions"

    // Mutable variable
    var salary = 25000

    println("Company Name: $companyName")
    println("Initial Salary: $salary")

    // Reassigning var (allowed)
    salary = 30000
    println("Updated Salary: $salary")

    // Uncommenting below line will cause compilation error
    // companyName = "New Company"
}

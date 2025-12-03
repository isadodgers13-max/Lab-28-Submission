// Lab 28 - Lambda Functions in Kotlin

data class Student(val name: String, val grade: Int)

fun main() {

    println("------ Task 1: Multiply with reduce() ------")

    val numbers = listOf(2, 3, 4, 5)

    // 1. Lambda that multiplies two Int values
    val multiply: (Int, Int) -> Int = { a, b -> a * b }

    val product = numbers.reduce(multiply)
    println("Numbers: $numbers")
    println("Product using reduce: $product\n")


    println("------ Task 2: Square numbers with map() ------")

    // 2. Lambda that squares an Int
    val square: (Int) -> Int = { x -> x * x }

    val squaredList = numbers.map(square)
    println("Original list: $numbers")
    println("Squared list: $squaredList\n")


    println("------ Task 3: Filter numbers using threshold ------")

    val threshold = 10

    // 3. Lambda that checks if number > threshold
    val greaterThanThreshold: (Int) -> Boolean = { x -> x > threshold }

    val filtered = listOf(5, 12, 9, 18, 3, 25).filter(greaterThanThreshold)
    println("Threshold: $threshold")
    println("Filtered list: $filtered\n")


    println("------ Task 4: Sorting Students by grade ------")

    val students = listOf(
        Student("Alice", 88),
        Student("Bob", 75),
        Student("Charlie", 93),
        Student("Diana", 82)
    )

    // 4. Lambda for sorting by grade
    val sortedStudents = students.sortedBy { it.grade }

    println("Students (sorted by grade):")
    sortedStudents.forEach { println("${it.name}: ${it.grade}") }
}

package exercises
/**
 * EXERCISE FOUR
Month and Season:
Write a program that asks the user to enter a number from 1 to 12.

The program must determine:
- The name of the month.
- The season that month belongs to.

Rules:
- 12, 1, and 2 belong to "Winter".
- 3, 4, and 5 belong to "Spring".
- 6, 7, and 8 belong to "Summer".
- 9, 10, and 11 belong to "Autumn".

Examples:
- If the user enters 1, the program must display "January" and "Winter".
- If the user enters 4, the program must display "April" and "Spring".
- If the user enters 8, the program must display "August" and "Summer".
- If the user enters 10, the program must display "October" and "Autumn".
- If the user enters a number that is not between 1 and 12, it must display "Invalid month".

Concepts you must use:
- readln()
- toInt()
- if
- ranges with in
- when
- else
 */
fun main() {
    println("Introduce un numero del 1 al 12")
    val answer = readln().toInt()

    when (answer) {
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> println("December")
        else -> println("Invalid month")
    }

    if(answer in 1..12){
    when  {
        answer in 3..5 -> println("Spring")
        answer in 6..8 -> println("Summer")
        answer in 9..11 -> println("Autumn")
        else -> println("Winter")
    }}
}

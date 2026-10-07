package exercises
/**
 * EXERCISE THREE
Month of the Year:
Write a program that asks the user to enter a number from 1 to 12.

The program must convert that number into the name of the corresponding month.

Examples:
- If the user enters 1, the program must display "January".
- If the user enters 5, the program must display "May".
- If the user enters 12, the program must display "December".
- If the user enters a number that is not between 1 and 12, it must display "Invalid month".

Concepts you must use:
- readln()
- toInt()
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
}
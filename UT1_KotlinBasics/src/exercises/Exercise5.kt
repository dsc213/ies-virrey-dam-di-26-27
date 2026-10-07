package exercises
/**
* EXERCISE FIVE
Number Guessing Game:
Write a program in which the user has to guess a secret number.

Game rules:
- The secret number is fixed.
- The user must enter numbers between 1 and 10.
- The user has a maximum of 3 attempts.
- If the user enters a number outside the range, an error message must be displayed.
- A number outside the range must not count as an attempt.
- If the user guesses correctly, a victory message must be displayed and the game must end.
- If the user guesses wrong, the program must indicate whether the secret number is higher or lower.
- If the user runs out of attempts, a defeat message must be displayed.

Example:
- Secret number: 7
- Maximum attempts: 3
- Valid range: 1..10

The program must keep track of:
- How many attempts the user has used.
- How many attempts the user has left.
- Whether the user has won or lost.

Concepts you must use:
- val
- var
- readln()
- toInt()
- if
- else if
- else
- ranges with in or !in
- while
- break
- continue
*/
fun main() {
    var answer: Int = 0
    val numero = 5
    var attempts = 3
    val range = 1..10

    do{
        println("Introduce un numero del 1 al 10 para adivinar el numero secreto")
        answer = readln().toInt()
        when{
            answer !in range -> println("No has introducido un numero dentro del rango")

            answer == numero -> {
                println("Enhorabuena has acertado el numero")
                break
                }
            answer > numero -> {
                println("El numero es menor")
                attempts -= 1
                println("Te quedan $attempts intento/s")
            }
            answer < numero -> {
                println("El numero es mayor")
                attempts -= 1
                println("Te quedan $attempts intento/s")
                }
            }
        if(attempts == 0){
            println("Has fallado, te has quedado sin intentos")
        }
        }while (attempts != 0)
    }

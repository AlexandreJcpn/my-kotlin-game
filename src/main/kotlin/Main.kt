import kotlin.random.Random

fun main() {
    // Score and life initialization
    var points = 0
    var life = 2

    // Welcome in the game
    println("================================")
    println("Welcome to this mental arithmetic game of Alexandre")
    println("Are you ready to start?\n")
    println("================================")
    do {
        // Generate 2 random numbers
        val number1 = 1
        val number2 = 2

        // Are you ready ??
        do {
            var wrongAnswer = true
            // We display the text
            println("Tapez $number1 pour oui, $number2 pour non")
            val answer = getNumber(readLine()!!)
            // If it's the number one..
            if (answer.toInt() == number1){
                println("The game can begin")
                wrongAnswer = false
            } else {
                println("Take your time...")
                println("Are you ready now ?")
            }
        } while (wrongAnswer)
        // Go to the part
    } while (number1 > 1)

    // First calculation
    do {
        // Generate 2 random numbers
        val number1 = Random.nextInt(1, 99)
        val number2 = Random.nextInt(1, 99)
        // We add
        val sum : Int = number1 + number2

        do {
            // Boolean which will signal that the correct answer has been found
            var wrongAnswer = true
            // We display the calculation to the user and we wait for the answer
            println("$number1 + $number2 = ?")
            val answer = getNumber(readLine()!!)
            // If it's the right answer..
            if (answer.toInt() == sum){
                // Point +1
                points++
                // Score display
                println("Cheer ! Your score is : $points point(s).")
                // Update of the condition to exit the loop
                wrongAnswer = false

                // If it's the wrong answer, we put a message, and this loop is executed again
            } else {
                life--
                println("It's wrong !")
                println("You still have $life life(s)")
                if (life==0) println("Game over : $points")
            }; while (life<1);
        } while (wrongAnswer)
        // Next level when user has 2 points
    } while (points < 2)

    println("Next level")
    // Second calculation
    do {
        // Generate 3 random numbers
        val number1 = Random.nextInt(100, 999)
        val number2 = Random.nextInt(1, 99)
        val number3 = Random.nextInt(1, 99)
        // We calculate
        val sum = number1 - number2 + number3

        do {
            // Boolean which will signal that the correct answer has been found
            var wrongAnswer = true
            // We display the calculation to the user and we wait for the answer
            println("$number1 - $number2 + $number3 = ?")
            val answer = getNumber(readLine()!!)
            // If it's a right answer ..
            if (answer.toInt() == sum) {
                // Points +2
                points = points +2
                // Score display
                println("Cheer ! Your score is : $points point(s).")
                // Update of the condition to exit the loop
                wrongAnswer = false

                // If it's the wrong answer, we put a message, and this loop is executed again
            } else {
                life--
                println("It's wrong !")
                println("You still have $life life(s)")
                if (life==0) println("Game over : $points")
            }; while (life<1);
        } while (wrongAnswer)
        // Next level when user has 6 points
    } while (points < 6)

    println("Next level")
    // Third calculation
    do {
        // Generate 2 random numbers
        val number1 = Random.nextInt(1, 9)
        val number2 = Random.nextInt(1, 99)
        // We multily
        val sum = number1 * number2

        do {
            // Boolean which will signal that the correct answer has been found
            var wrongAnswer = true
            // We display the calculation to the user and we wait for the answer
            println("$number1 * $number2 = ?")
            val answer = getNumber(readLine()!!)
            // If it's a right answer
            if (answer.toInt() == sum) {
                // Points +3
                points = points +3
                // Score display
                println("Cheer ! Your score is : $points point(s).")
                // Update of the condition to exit the loop
                wrongAnswer = false

                // If it's the wrong answer, we put a message, and this loop is executed again
            } else {
                life--
                println("It's wrong !")
                println("You still have $life life(s)")
                if (life==0) println("Game over : $points")
            }; while (life<1);
        } while (wrongAnswer)
        // The game ends, when the user has 12 points
    } while (points < 12)

    println("Congratulations, you have successfully completed all three levels !")
}

// function generate error
fun getNumber(str: String): Int{
    return try {
        Integer.parseInt(str)
    } catch (e: NumberFormatException) {
        0
    }
}
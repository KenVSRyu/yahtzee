package org.superluigi.yahtzee

object DisplayScoreSheet {

    fun apply(scoreSheet: ScoreSheet) {

        println("Score sheet:")

        scoreSheet.upperSection.forEach { name, score ->

            val displayedScore = score ?: "--"

            println("$name:\t$displayedScore")

        }

        println("Sum: ${scoreSheet.sum}")
        println("Bonus: ${scoreSheet.bonus}")

        scoreSheet.lowerSection.forEach { name, score ->

            val displayedScore = score ?: "--"

            println("$name:\t$displayedScore")

        }

        println("Total: ${scoreSheet.total}")

    }
}


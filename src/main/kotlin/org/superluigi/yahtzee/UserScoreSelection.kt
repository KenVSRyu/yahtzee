package org.superluigi.yahtzee

object UserScoreSelection {

    // Temporary solution until we do a GUI.
    // Can we do it with Lanterna? :)

    fun apply(availableScores: Map<String, Int>): Pair<String, Int> {

        val availableScoreList = availableScores.toList()

        println("Select your score:")

        availableScoreList.forEachIndexed { index, pair ->

            println("${index + 1}\t${pair.first}\t${pair.second}")

        }

        var userInput = readLine()!!.toInt()

        while (!availableScoreList.indices.containsRaw(userInput - 1)) {

            println("$userInput is not on the list. Try again.")

            userInput = readLine()!!.toInt()

        }

        return availableScoreList[userInput]

    }

}
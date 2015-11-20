package org.superluigi.yahtzee

object AIScoreSelection {

    // First pass :)

    fun apply(availableScores: Map<String, Int>): Pair<String, Int> {

        println("Select your score:")

        val availableScoreList = availableScores.toList()

        availableScoreList.forEachIndexed { index, pair ->

            println("${index + 1}\t${pair.first}\t${pair.second}")

        }

        val selectedScore =
            availableScoreList
                .reduce { field1, field2 -> if (field1.second > field2.second) field1 else field2 }

        val selectedIndex = availableScoreList.indexOf(selectedScore) + 1

        println(selectedIndex)

        return selectedScore

    }

}

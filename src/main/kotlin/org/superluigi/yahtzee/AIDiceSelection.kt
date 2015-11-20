package org.superluigi.yahtzee

import java.util.*

object AIDiceSelection {

    // For now, the AI selects the dice to keep at random.

    fun apply(dice: List<Int>): Pair<List<Int>, Boolean> {

        print("Select dice to keep: ")

        val random = Math.random()

        if (random < 0.3) {

            println("1 2 3 4 5")

            return Pair(dice, true)

        }

        val numKeptDice = Math.floor(Math.random() * 5.0).toInt()

        val allIndices = arrayListOf(0, 1, 2, 3, 4)

        Collections.shuffle(allIndices)

        val selectedIndices = allIndices.take(numKeptDice)

        selectedIndices.forEach {

            print("${it + 1} ")

        }

        println()

        val keptDice =

            dice.filterIndexed { index, die ->

                selectedIndices.contains(index)

            }

        return Pair(keptDice, false)

    }

}
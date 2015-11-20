package org.superluigi.yahtzee

class DiceRoll(
    private val diceSelection: (List<Int>) -> Pair<List<Int>, Boolean>
) {

    fun apply(dice: List<Int>): Pair<List<Int>, Boolean> {

        val selection =

            if (dice.isEmpty()) {

                Pair(listOf(), false)

            }
            else {

                diceSelection(dice)

            }

        val keptDice = selection.first
        val keptAll = selection.second

        if (keptAll) {

            return Pair(dice, true)

        }

        val numDiceToRoll = 5 - keptDice.size

        val newDice = arrayListOf<Int>()

        newDice.addAll(keptDice)
        // This is broken
        for (i in 1..numDiceToRoll) {

            newDice.add(1)

        }

        newDice.forEach {

            print("$it ")

        }

        return Pair(newDice, false)

    }

}
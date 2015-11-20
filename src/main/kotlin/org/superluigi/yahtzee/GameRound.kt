package org.superluigi.yahtzee

object GameRound {

    fun apply(scoreSheet: ScoreSheet,
              user: Boolean): ScoreSheet {

        DisplayScoreSheet.apply(scoreSheet)

        val diceSelection =
            if (user)
                { dice: List<Int> -> UserDiceSelection.apply(dice) }
            else
                { dice: List<Int> -> AIDiceSelection.apply(dice) }

        val scoreSelection =
            if (user)
                { availableScores: Map<String, Int> -> UserScoreSelection.apply(availableScores) }
            else
                { availableScores: Map<String, Int> -> AIScoreSelection.apply(availableScores) }

        val diceRoll = DiceRoll(diceSelection)

        var dice = listOf<Int>()

        for (i in 1..3) {

            val result = diceRoll.apply(dice)

            dice = result.first

            if (result.second) {

                break

            }

        }

        val upperSection = UpperSection(dice)
        val lowerSection = LowerSection(dice)

        val availabeScores = AvailabeScores.get(scoreSheet, upperSection, lowerSection)

        val selectedScore = scoreSelection(availabeScores)

        AddSelectedScore.apply(scoreSheet, selectedScore)

        val upperSectionValues =
            scoreSheet.upperSection.values
                .filter { it != null }
                .map { it!! }

        val upperSectionSum = Sum.calculate(upperSectionValues)

        val bonus =
            if (upperSectionSum > 63)
                35
            else
                0

        scoreSheet.sum = upperSectionSum
        scoreSheet.bonus = bonus

        val lowerSectionValues =
            scoreSheet.lowerSection.values
                .filter { it != null }
                .map { it!! }

        val lowerSectionSum = Sum.calculate(lowerSectionValues)

        val total = upperSectionSum + bonus + lowerSectionSum

        scoreSheet.total = total

        return scoreSheet

    }

}
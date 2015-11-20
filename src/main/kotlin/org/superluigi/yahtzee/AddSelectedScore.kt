package org.superluigi.yahtzee

object AddSelectedScore {

    fun apply(scoreSheet: ScoreSheet, selectedField: Pair<String, Int>): ScoreSheet {

        if (scoreSheet.upperSection.containsKey(selectedField.first)) {

            scoreSheet.upperSection.put(selectedField.first, selectedField.second)

        }
        else {

            scoreSheet.lowerSection.put(selectedField.first, selectedField.second)

        }

        return scoreSheet

    }

}

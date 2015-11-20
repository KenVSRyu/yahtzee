package org.superluigi.yahtzee

object ScoreSheetComplete {

    fun apply(scoreSheet: ScoreSheet): Boolean {

        val upperSectionComplete =
            !scoreSheet.upperSection.containsValue(null)

        val lowerSectionComplete =
            !scoreSheet.lowerSection.containsValue(null)

        return upperSectionComplete && lowerSectionComplete

    }

}
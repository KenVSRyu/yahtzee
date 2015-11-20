package org.superluigi.yahtzee.view

import javafx.scene.control.Label

data class ScoreSheetLabels(
    val labels: List<Label> =
        listOf(
            Label("Ones"),
            Label("Twos"),
            Label("Threes"),
            Label("Fours"),
            Label("Fives"),
            Label("Sixes"),
            Label("Sum"),
            Label("Bonus"),
            Label("Three of a kind"),
            Label("Four of a kind"),
            Label("Full House"),
            Label("Small straight"),
            Label("Large straight"),
            Label("Chance"),
            Label("YAHTZEE"),
            Label("TOTAL")
        )
)
package org.superluigi.yahtzee

fun main(args: Array<String>) {

    val userScoreSheet = ScoreSheet()
    val aiScoreSheet = ScoreSheet()

    while (!(ScoreSheetComplete.apply(userScoreSheet) && ScoreSheetComplete.apply(aiScoreSheet))) {

        if (!ScoreSheetComplete.apply(userScoreSheet)) {

            GameRound.apply(userScoreSheet, true)

        }

        if (!ScoreSheetComplete.apply(aiScoreSheet)) {

            GameRound.apply(aiScoreSheet, false)

        }

    }

    if (userScoreSheet.total > aiScoreSheet.total) {

        println("You win! :)")

    }
    else {

        println("Oh noez you lost. :(")

    }

}

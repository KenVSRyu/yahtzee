package org.superluigi.yahtzee

import java.util.*

data class ScoreSheet(

    val upperSection: HashMap<String, Int?> =

        hashMapOf(
            Pair("Ones", null),
            Pair("Twos", null),
            Pair("Threes", null),
            Pair("Fours", null),
            Pair("Fives", null),
            Pair("Sixes", null)
        ),


    var sum: Int = 0,
    var bonus: Int = 0,

    val lowerSection: HashMap<String, Int?> =
        hashMapOf(
            Pair("Three of a kind", null),
            Pair("Four of a kind", null),
            Pair("Full House", null),
            Pair("Small straight", null),
            Pair("Large straight", null),
            Pair("Chance", null),
            Pair("Yahtzee", null)
    ),

    var total: Int = 0

)

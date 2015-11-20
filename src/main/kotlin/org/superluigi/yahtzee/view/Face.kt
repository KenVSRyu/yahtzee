package org.superluigi.yahtzee.view

enum class Face(val path: String) {

    ONE("src/main/resources/one.png"),
    TWO("src/main/resources/two.png"),
    THREE("src/main/resources/three.png"),
    FOUR("src/main/resources/four.png"),
    FIVE("src/main/resources/five.png"),
    SIX("src/main/resources/six.png");

    companion object mapping {
        fun fromInt(int: Int) =

            when (int) {

                1 -> ONE
                2 -> TWO
                3 -> THREE
                4 -> FOUR
                5 -> FIVE
                6 -> SIX
                else -> throw IllegalArgumentException("Die value must be between 1 and 6.")
            }

    }

}
package org.superluigi.yahtzee

import org.superluigi.yahtzee.view.Face

object Roll {

    fun apply(): Face {

        val rand = Math.random()

        if (rand < 1.0 / 6.0)
            return Face.ONE

        if (rand < 2.0 / 6.0)
            return Face.TWO

        if (rand < 3.0 / 6.0)
            return Face.THREE

        if (rand < 4.0 / 6.0)
            return Face.FOUR

        if (rand < 5.0 / 6.0)
            return Face.FIVE

        return Face.SIX

    }



}

package org.superluigi.yahtzee.model

import org.superluigi.yahtzee.view.Face

data class CurrentDice(
    var face1: Face,
    var face2: Face,
    var face3: Face,
    var face4: Face,
    var face5: Face
)
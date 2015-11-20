package org.superluigi.yahtzee.model

import org.superluigi.yahtzee.view.Face

data class Die(
    var face: Face,
    var locked: Boolean
)

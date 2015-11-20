package org.superluigi.yahtzee.view

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.layout.GridPane
import javafx.stage.Stage
import org.superluigi.yahtzee.model.Die

class View : Application() {

    override fun start(primaryStage: Stage) {

        val grid = GridPane()
        grid.gridLinesVisibleProperty().set(true)

        val dice =
            listOf(
                Die(Face.TWO, false),
                Die(Face.THREE, false),
                Die(Face.FOUR, false),
                Die(Face.FIVE, false),
                Die(Face.SIX, false)
            )

        val diceButtonAdder = DiceButtons(dice)

        val pair = diceButtonAdder.addToGrid(grid)

        val diceGrid = pair.first
        val diceButtons = pair.second

        RollButton(dice, diceGrid).addToGrid(grid)

        ScoreSheet.addToGrid(grid)

        Dialog.addToGrid(grid)

        val scene = Scene(grid, 750.0, 1000.0)

        primaryStage.title = "YAHTZEE!"

        primaryStage.scene = scene

        primaryStage.show()

    }

}
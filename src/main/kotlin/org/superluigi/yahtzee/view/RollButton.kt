package org.superluigi.yahtzee.view

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.geometry.Insets
import javafx.scene.control.Button
import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints
import javafx.scene.text.Font
import org.superluigi.yahtzee.Roll
import org.superluigi.yahtzee.model.Die

class RollButton(
    val dice: List<Die>,
    val diceGrid: GridPane
) {

    val rollPane = BorderPane()
    val rollPaneRow = RowConstraints()
    val rollButton = Button("ROLL!")

    fun addToGrid(grid: GridPane) {

        rollPaneRow.percentHeight = 5.0

        rollButton.padding = Insets(0.0, 0.0, 0.0, 0.0)

        rollButton.prefWidth = rollPane.width
        rollButton.prefHeight = rollPane.height
        rollButton.maxWidth = Double.MAX_VALUE
        rollButton.maxHeight = Double.MAX_VALUE

        rollButton.font = Font("Lucida Console", 45.0)

        rollButton.onAction =

            object: EventHandler<ActionEvent> {

                override fun handle(event: ActionEvent) {

                    val diceToRoll = dice.filter { !it.locked }

                    diceToRoll.forEach { die ->

                        die.face = Roll.apply()

                    }

                    val diceButtons = DiceToButtons.apply(dice)

                    diceButtons.forEachIndexed { index, button ->

                        diceGrid.add(button, index, 0)

                    }

                }

            }

        grid.rowConstraints.add(rollPaneRow)

        rollPane.center = rollButton

        grid.add(rollPane, 0, 1)

    }
}


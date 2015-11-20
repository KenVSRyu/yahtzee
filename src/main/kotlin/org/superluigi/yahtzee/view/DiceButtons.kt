package org.superluigi.yahtzee.view

import javafx.scene.control.Button
import javafx.scene.layout.ColumnConstraints
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints
import org.superluigi.yahtzee.model.Die

class DiceButtons(
    val dice: List<Die>
) {

    private val diceGrid = GridPane()
    private val diceGridColumn = ColumnConstraints()
    private val diceGridRow = RowConstraints()
    private val dieColumn = ColumnConstraints()
    private val diceRow = RowConstraints()

    fun addToGrid(grid: GridPane): Pair<GridPane, List<Button>> {

        val diceButtons = DiceToButtons.apply(dice)

        diceGrid.gridLinesVisibleProperty().set(true)

        diceGridColumn.percentWidth = 100.0

        diceGridRow.percentHeight = 15.0

        grid.columnConstraints.add(diceGridColumn)

        grid.rowConstraints.add(diceGridRow)

        dieColumn.percentWidth = 20.0

        diceRow.percentHeight = 100.0

        for (i in 1..5) {

            diceGrid.columnConstraints.add(dieColumn)

        }

        diceGrid.rowConstraints.add(diceRow)

        diceButtons.forEachIndexed { index, die ->

            diceGrid.add(die, index, 0)

        }

        grid.add(diceGrid, 0, 0)

        return Pair(diceGrid, diceButtons)

    }

}
package org.superluigi.yahtzee.view

import javafx.scene.control.Button
import javafx.scene.layout.ColumnConstraints
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints

object Dice {

    val diceGrid = GridPane()
    val diceGridColumn = ColumnConstraints()
    val diceGridRow = RowConstraints()
    val dieColumn = ColumnConstraints()
    val diceRow = RowConstraints()
    val dice = Array(5, { Button() })

    fun addToGrid(grid: GridPane) {

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

        dice.forEachIndexed { index, die ->

            diceGrid.add(die, index, 0)

        }

        grid.add(diceGrid, 0, 0)

    }
}


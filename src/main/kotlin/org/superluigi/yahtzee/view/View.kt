package org.protoworld.gui

import javafx.application.Application
import javafx.scene.Scene
import javafx.scene.control.Button
import javafx.scene.layout.ColumnConstraints
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints
import javafx.stage.Stage

class View : Application() {

    override fun start(primaryStage: Stage) {

        val grid = GridPane()
        grid.gridLinesVisibleProperty().set(true)

        val dieColumn = ColumnConstraints()
        dieColumn.percentWidth = 20.0

        val diceRow = RowConstraints()
        diceRow.percentHeight = 15.0

        grid.columnConstraints.add(dieColumn)
        grid.columnConstraints.add(dieColumn)
        grid.columnConstraints.add(dieColumn)
        grid.columnConstraints.add(dieColumn)
        grid.columnConstraints.add(dieColumn)
        grid.rowConstraints.add(diceRow)

        val scene = Scene(grid, 750.0, 1000.0)

        val die1 = Button("1")
        val die2 = Button("2")
        val die3 = Button("3")
        val die4 = Button("4")
        val die5 = Button("5")

        grid.add(die1, 0, 0)
        grid.add(die2, 1, 0)
        grid.add(die3, 2, 0)
        grid.add(die4, 3, 0)
        grid.add(die5, 4, 0)

        val rollButton = Button("ROLL!")

        GridPane.setColumnSpan(rollButton, 5)

        grid.add(rollButton, 0, 1)

        primaryStage.title = "YAHTZEE!"

        primaryStage.scene = scene

        primaryStage.show()

    }

}
package org.superluigi.yahtzee.view

import javafx.scene.control.ContentDisplay
import javafx.scene.control.Label
import javafx.scene.layout.BorderPane
import javafx.scene.layout.GridPane
import javafx.scene.layout.RowConstraints
import javafx.scene.text.Font

object Dialog {

    fun addToGrid(grid: GridPane) {

        val dialogRow = RowConstraints()
        dialogRow.percentHeight = 5.0

        grid.rowConstraints.add(dialogRow)

        val dialogLabel = Label("YAHTZEE")

        dialogLabel.contentDisplay = ContentDisplay.CENTER

        dialogLabel.font = Font("Lucida Console", 30.0)

        val borderPane = BorderPane()

        borderPane.center = dialogLabel

        GridPane.setColumnSpan(borderPane, 10)

        grid.add(borderPane, 0, 3)

    }

}
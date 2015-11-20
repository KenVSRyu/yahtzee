package org.superluigi.yahtzee.view

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.image.Image
import javafx.scene.layout.*
import org.superluigi.yahtzee.model.CurrentDice
import java.io.ByteArrayInputStream
import java.io.File

object DiceToButtons {

    fun apply(currentDice: CurrentDice): List<Button> {

        val dice = Array(5, { Button() })

        val faces =
            listOf(
                currentDice.face1,
                currentDice.face2,
                currentDice.face3,
                currentDice.face4,
                currentDice.face5
            )

        val buttons =

            faces.mapIndexed { index, face ->

                val imagePath = face.path

                val imageBytes = File(imagePath).readBytes()

                val inputStream = ByteArrayInputStream(imageBytes)

                val image = Image(inputStream)

                val backgroundImage =
                    BackgroundImage(
                        image,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundRepeat.NO_REPEAT,
                        BackgroundPosition.CENTER,
                        BackgroundSize(100.0, 100.0, true, true, true, true)
                    )

                val background = Background(backgroundImage)

                val button = dice[index]

                button.maxWidth = Double.MAX_VALUE
                button.maxHeight = Double.MAX_VALUE

                button.background = background

                button.onAction =
                    object : EventHandler<ActionEvent> {

                        override fun handle(event: ActionEvent) {

                            println("Six.")

                        }

                    }

                button

            }

        return buttons

    }

}
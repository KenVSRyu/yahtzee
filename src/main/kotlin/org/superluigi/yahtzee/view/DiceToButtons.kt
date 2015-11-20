package org.superluigi.yahtzee.view

import javafx.event.ActionEvent
import javafx.event.EventHandler
import javafx.scene.control.Button
import javafx.scene.image.Image
import javafx.scene.layout.*
import org.superluigi.yahtzee.model.Die
import java.io.ByteArrayInputStream
import java.io.File

object DiceToButtons {

    fun apply(dice: List<Die>): List<Button> {

        val newButtons = Array(5, { Button() })

        val buttons =

            dice.mapIndexed { index, die ->

                val face = die.face

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

                val button = newButtons[index]

                button.maxWidth = Double.MAX_VALUE
                button.maxHeight = Double.MAX_VALUE

                button.background = background

                button.onAction =
                    object : EventHandler<ActionEvent> {

                        override fun handle(event: ActionEvent) {

                            if (die.locked) {

                                die.locked = false

                            }
                            else {

                                die.locked = true

                            }

                        }

                    }

                button

            }

        return buttons

    }

}
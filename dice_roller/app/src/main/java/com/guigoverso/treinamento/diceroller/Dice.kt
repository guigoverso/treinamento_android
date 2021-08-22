package com.guigoverso.treinamento.diceroller

class Dice(private val sides: Int) {

    fun roll(): Int {
        return (1..sides).random()
    }
}
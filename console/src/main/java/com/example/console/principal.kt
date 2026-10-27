package com.example.console

data class carta(val valor: Valor, val naipe: Naipe)

fun main () {

    val baralho = Baralho()
    val jogador = Jogador(nome = "lindon")
    val jogador2 = Jogador(nome = "Rogerio")
    val jogador3 = Jogador(nome = "Rogerio")

    jogador.receber( carta = baralho.comprar())
    jogador.receber( carta = baralho.comprar())
    jogador.receber( carta = baralho.comprar())

    jogador2.receber (carta = baralho.comprar())

    jogador3.receber (carta = baralho.comprar())
    jogador3.receber (carta = baralho.comprar())
    jogador3.receber (carta = baralho.comprar())
}

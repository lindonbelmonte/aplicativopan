package com.example.console

class Jogador(val nome: String) {
    var pontos = 0
        private set
    fun ganhar(quantidade: Int) {
        if (quantidade > 0) {
            pontos += quantidade
        }
    }
}
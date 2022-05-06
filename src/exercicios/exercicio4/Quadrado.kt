package exercicios.exercicio4

import kotlin.math.pow

class Quadrado(private var lado: Double): Quadrilatero(lado, lado, lado, lado) {
    override fun calcularArea(): Double {
        return lado.pow(2)
    }
}
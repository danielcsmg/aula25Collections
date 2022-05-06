package exercicios.exercicio4

import kotlin.math.pow

class Quadrado(private var lado: Double): Quadrilatero(lado, lado, lado, lado) {
    override fun calcularArea(): Double {
        return lado.pow(2)
    }


    override fun mostrarInformacoes(forma: String) {
        println("${forma}:\n" +
                "Medida dos lados: $lado;\n" +
                "Área = ${calcularArea()};\n" +
                "Perímetro = ${calcularPerimetro()}")
        println("---###---###---###---###---")
        println()
    }
}
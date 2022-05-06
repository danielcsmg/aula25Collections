package exercicios.exercicio4

import kotlin.math.pow

class Circulo(private val raio: Double): FormaGeometrica {
    override fun calcularArea(): Double {
        return Math.PI * raio.pow(2)
    }

    override fun calcularPerimetro(): Double {
        return Math.PI * raio * 2
    }

    override fun mostrarInformacoes(forma: String){
        println("${forma}:\n" +
                "Medida do raio: $raio;\n"+
                "Área = ${calcularArea()};\n" +
                "Perímetro = ${calcularPerimetro()}")
        println("---###---###---###---###---")
        println()
    }
}
package exercicios.exercicio4

abstract class Quadrilatero(private var lado1: Double, private var lado2: Double, private var lado3: Double, private var lado4: Double): FormaGeometrica {
    override fun calcularPerimetro(): Double {
        return lado1 + lado2 + lado3 + lado4
    }
}
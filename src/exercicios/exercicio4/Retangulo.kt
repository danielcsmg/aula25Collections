package exercicios.exercicio4

class Retangulo(private val base: Double, private val altura: Double): Quadrilatero(base, altura, base, altura) {
    override fun calcularArea(): Double {
        return base * altura
    }
}
package exercicios.exercicio4

class Retangulo(private val base: Double, private val altura: Double): Quadrilatero(base, altura, base, altura) {
    override fun calcularArea(): Double {
        return base * altura
    }
    override fun mostrarInformacoes(forma: String){
        println("${forma}:\n" +
                "Medida da base: $base;\n" +
                "Medida da altura: $altura;\n" +
                "Área = ${calcularArea()};\n" +
                "Perímetro = ${calcularPerimetro()}")
        println("---###---###---###---###---")
        println()
    }
}
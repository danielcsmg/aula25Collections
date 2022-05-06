package exercicios.exercicio4

import kotlin.reflect.typeOf

fun main() {
    val circulo = "círculo"
    val quadrado = "quadrado"
    val retangulo = "retângulo"
    val mapFormas = mutableMapOf<FormaGeometrica, String>()
    val arrayFormas = ArrayList<FormaGeometrica>()


    println("Digite a quantidade de formas a calcular:")
    val qtdFormas = readln().toInt()

    for(i in 0 until qtdFormas){
        println("Digite o ${i+1}º tipo de forma a ser calculada:")
        var forma = readln()
        while (forma != circulo && forma != quadrado && forma != retangulo){
            println("Forma não encontrada ;\n Digite novamente:")
            forma = readln()
        }
        when(forma){
            circulo -> {
                println("Digite o raio:")
                val raio = readln().toDouble()
                arrayFormas.add(Circulo(raio))
                mapFormas[arrayFormas[i]] = circulo
            }
            quadrado -> {
                println("Digite o valor do lado:")
                 val lado = readln().toDouble()
                arrayFormas.add(Quadrado(lado))
                mapFormas[arrayFormas[i]] = quadrado
            }
            retangulo -> {
                println("Digite o valor da base:")
                val base = readln().toDouble()
                println("Digite o valor da altura:")
                val altura = readln().toDouble()
                arrayFormas.add(Retangulo(base, altura))
                mapFormas[arrayFormas[i]] = retangulo
            }
        }
    }

    println("#### Informações das Formas Geométricas ####")
    mapFormas.forEach{
        it.key.mostrarInformacoes(it.value)
    }
}
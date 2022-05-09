package exercicios.exercicio3

abstract class Peca(var marca: String, var modelo: String) {
    abstract fun retirada()


    fun mostrarPeca(){
        println("Marca: $marca")
        println("Modelo: $modelo")
        println("-------------------------------------")
        println()
    }
}
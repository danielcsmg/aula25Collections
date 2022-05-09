package exercicios.exercicio3

class GuardaVolumes {
    private var cont = 0
    private val pecasCadastradas: MutableMap<Int, ArrayList<Peca>> = mutableMapOf()


    fun guardaVolumes(){
        println("Cadastre uma coleção de peças:")
        var opc = "cadastrar"
        while (true){
            when(opc){
                "cadastrar", "c" -> {
                    val conjunto = guardarPecas(criarListaPecas())
                    println("Conjunto $conjunto criado com sucesso!")
                }
                "visualizar", "v" -> mostrarPecas()
                "conjunto" -> mostrarConjuntoIndividual()
                "remover", "r" -> retirarPecas()
                "sair" -> break
                else -> {
                    println("Opção inválida!")
                }
            }
            menu()
            opc = readln()
        }
    }

    private fun mostrarConjuntoIndividual(){
        try {
            if(pecasCadastradas.isNotEmpty()) {
                println("Digite o número associado ao conjunto de peças a ser tirado:")
                var numConjunto = readln().toInt()

                while (numConjunto !in pecasCadastradas.keys) {
                    println("Conjunto não encontrado!")
                    println("Digite uma opção válida:")
                    numConjunto = readln().toInt()
                }

                pecasCadastradas[numConjunto]?.forEach {
                    it.mostrarPeca()
                }
            }else{
                println("Não há conjuntos a serem mostrados!")
            }

        }catch (e: Exception){
            println("Digite um número:")
            mostrarConjuntoIndividual()
        }
    }

    private fun retirarPecas(){
        println("Digite o número associado ao conjunto de peças a ser tirado:")
        try {
            if(pecasCadastradas.isNotEmpty()) {
                var numConjunto = readln().toInt()
                while (numConjunto !in pecasCadastradas.keys) {
                    println("Conjunto não encontrado!")
                    println("Digite uma opção válida:")
                    numConjunto = readln().toInt()
                }

                pecasCadastradas.remove(numConjunto)
                println("Conjunto $numConjunto removido com sucesso!")

            }else{
                println("Não há peças cadastradas!")
            }


        }catch (e: Exception){
            println("Opção inválida!")
            retirarPecas()
        }
    }

     private fun guardarPecas(listaDePeca: ArrayList<Peca>): Int {
         cont += 1
         pecasCadastradas[cont] = listaDePeca
         return cont
     }


    private fun criarListaPecas(): ArrayList<Peca>{
        val pecas = ArrayList<Peca>()
        while (true){
            println("Digite a marca da peça:")
            val marca = readln()
            println("Digite o modelo da peça:")
            val modelo = readln()
            pecas.add(Roupa(marca, modelo))
            println()
            println("Novo cadastro?")
            var opcao = readln()
            while (opcao != "não" && opcao != "sim"){
                println("Opção inválida.")
                println("Digite novamente:")
                opcao = readln()
                println()
            }
            when(opcao){
                "não" -> break
                else -> continue
            }
        }
        return pecas
    }

    private fun mostrarPecas(){
        if (pecasCadastradas.isNotEmpty()){
            pecasCadastradas.forEach{(index, arrayPecas) ->
                println("Peças do Conjunto $index:")
                arrayPecas.forEach{
                    it.mostrarPeca()
                }
            }
        }else{
            println("Não há conjunto de peças cadastrado!")
        }
    }

    companion object Menu{
        fun menu(){
            println("Menu:")
            println("Para cadastrar: 'c' ou 'cadastrar';")
            println("Para visualizar as peças: 'v' ou 'visualizar';")
            println("Para visualizar um conjunto de peças: 'conjunto';")
            println("Para retirar um conjunto de peças: 'r' ou 'retirar';")
            println("Para sair: 'sair';")
        }
    }
}
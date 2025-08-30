fun main() {
    val frutas = mutableListOf("Maça","Banana", "Laranja", "Manga", "Uva")

    while (frutas.isNotEmpty()) {
        println("\nLista atual de frutas: $frutas")
        print("Digite o nome de uma fruta para remover:")
        val escolha = readLine()!!.trim()

        if(frutas.contains(escolha)){
            frutas.remove(escolha)
            println("Fruta '$escolha' foi retirada da lista.")
        } else {
            println("Fruta indisponivel no nosso mercado.")
        }
    }

    println("\nLista de compras finalizada!")
}
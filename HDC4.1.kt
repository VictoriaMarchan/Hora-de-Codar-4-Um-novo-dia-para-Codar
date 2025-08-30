fun main (){
    val estudantes = mutableListOf<String>()

    while (true){
        print("Digite o nome do estudante (ou 'PARE' para encerrar): ")
        val nome = readLine() !!.trim()
        if (nome.uppercase() == "PARE") break
        estudantes.add(nome)
    }

    println("\nQuantidade de estudantes cadastrados: ${estudantes.size}")
    println("Lista de estudantes:")
    estudantes.forEach { println(it) }
}
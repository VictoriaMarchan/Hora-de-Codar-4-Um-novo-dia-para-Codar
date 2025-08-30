fun main () {
    val planetas = listOf("Terra", "Marte", "Plutão", "Vênus", "Júpiter", "Saturno")
    print("Digite o nome de um planeta:")
    val nome = readLine()!!.trim()

    if (nome in  planetas){
        println("O planeta $nome está na lista!")
    } else {
        println("O planeta $nome não foi encontrado.")
    }
}
fun main () {
    print("Digite o primeíro número: ")
    val a = readLine()!!.toInt()
    print("Digite o segundo número: ")
    val b = readLine()!!.toInt()

    println("O  maior número é: ${if (a > b ) a else b}")
}
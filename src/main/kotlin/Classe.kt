class Casa {
    var cor: String = ""
    var tamanho: String = ""
    var quartos: String = ""
}

fun main(args: Array<String>) {

    val casa = Casa()
    casa.cor = "Azul"
    casa.tamanho = "Grande"
    casa.quartos = "3"
    println("Casa 1: " + casa.cor + ", " + casa.tamanho + ", " + casa.quartos + " quartos.")

    val casa2 = Casa()
    casa2.cor = "Branca"
    casa2.tamanho = "Media"
    casa2.quartos = "2"
    println("Casa 2: " + casa2.cor + ", " + casa2.tamanho + ", " + casa2.quartos + " quartos.")
}


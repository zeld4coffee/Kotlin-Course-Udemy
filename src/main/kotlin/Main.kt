fun main(args: Array<String>) {

    /* TREINANDO LINGUAGEM KOTLIN */

    // valores numéricos
    var numDouble = 2450
    var bonus = 100
    var total = numDouble + bonus

    println(total)

    // pequena recursão que verifica se é par ou não
    when (numDouble) {
        2450 -> println("Numero par")
        2433 -> println("Numero é impar")
        else -> {
            println("undefinied")
        }
    }

    // caracteres
    var name = "Ailton"
    var charactere = 'b'

    println(name)
    println(charactere)

    // arrays
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println(numbers[1])

    // outra função que de alerta
    exibirMensagem()
}

fun exibirMensagem() {
    val alerta = "apenas um alerta"
    println(alerta)
}


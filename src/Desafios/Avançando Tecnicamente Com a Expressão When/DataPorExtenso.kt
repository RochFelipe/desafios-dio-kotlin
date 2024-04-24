fun main() {
    // Lê a entrada do usuário como uma string
    val entrada: String? = readLine()

    // Verifica se a entrada está vazia ou nula
    if (entrada.isNullOrEmpty()) {
        println("Entrada inválida. Por favor, digite uma data no formato DD/MM/AAAA.")
        return
    }

    // Utiliza o conceito de "destructuring" para separar a data em dia, mês e ano
    val (dia, mesString, anoString) = entrada.split("/")

    // Converte o mês e ano para inteiros
    val mes = mesString.toIntOrNull()
    val ano = anoString.toIntOrNull()

    // Valida se o mês e ano são números válidos
    if (mes == null || ano == null || mes !in 1..12) {
        println("Data inválida. Por favor, digite uma data no formato DD/MM/AAAA.")
        return
    }

    // Obtém o nome do mês por extenso
    val mesPorExtenso = when (mes) {
        1 -> "Janeiro"
        2 -> "Fevereiro"
        3 -> "Marco"
        4 -> "Abril"
        5 -> "Maio"
        6 -> "Junho"
        7 -> "Julho"
        8 -> "Agosto"
        9 -> "Setembro"
        10 -> "Outubro"
        11 -> "Novembro"
        else -> "Dezembro"
    }

    // Imprime a data formatada
    println("$dia de $mesPorExtenso de $ano")
}

fun main() {
    // Lê o número romano da entrada do usuário
    val numeroRomano: String? = readLine()

    // Verifica se a entrada está vazia ou nula
    if (numeroRomano.isNullOrEmpty()) {
        println("Entrada inválida. Por favor, digite um número romano válido.")
        return
    }

    // Dicionário que mapeia símbolos romanos para valores decimais
    val numerosRomanos = mapOf(
        'I' to 1,
        'V' to 5,
        'X' to 10,
        'L' to 50,
        'C' to 100,
        'D' to 500,
        'M' to 1000
    )

    // Variável para armazenar o resultado final (valor decimal)
    var resultado = 0

    // Percorre cada caractere do número romano
    for (i in numeroRomano.indices) {
        // Obtém o valor decimal do caractere romano atual
        val atual = numerosRomanos.getValue(numeroRomano[i])

        // Obtém o valor decimal do próximo caractere romano (se existir)
        val proximo = if (i + 1 < numeroRomano.length) {
            numerosRomanos.getValue(numeroRomano[i + 1])
        } else {
            0
        }

        // Aplica a regra de subtração romana (se necessário)
        if (atual < proximo) {
            resultado -= atual
        } else {
            resultado += atual
        }
    }

    // Imprime o resultado final (valor decimal)
    println(resultado)
}

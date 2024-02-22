// Enumeração para representar os níveis de formação
enum class Nivel { INICIAL, AVANCADO }

// Classe para representar um usuário
class Usuario

// Classe para representar o conteúdo educacional
data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

// Classe para representar uma formação
data class Formacao(
    val nome: String,
    val nivel: Nivel,
    var conteudos: List<ConteudoEducacional>
) {

    val inscritos = mutableListOf<Usuario>()

    // Função para matricular um usuário na formação
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("Usuário matriculado na formação $nome")
    }
}

fun main() {
    // Criando alguns conteúdos educacionais
    val conteudosJavaScript = listOf(
        ConteudoEducacional("Aprenda a Programar do Zero com JavaScript"),
        ConteudoEducacional("JavaScript para Web: Fundamentos de HTML, CSS e APIs na Prática"),
        ConteudoEducacional("Dominando Conceitos Avançados em JavaScript"),
        ConteudoEducacional("Currículo Online com HTML, CSS e JavaScript: Da Prototipação ao Deploy")
    )

    val conteudosMachineLearning = listOf(
        ConteudoEducacional("Introdução ao Machine Learning"),
        ConteudoEducacional("Programação para Machine Learning"),
        ConteudoEducacional("Algoritmos de Treinamento em Machine Learning"),
        ConteudoEducacional("Teoria do Aprendizado Estatístico"),
        ConteudoEducacional("Fundamentos e Práticas de Deep Learning"),
        ConteudoEducacional("Frameworks de Deep Learning"),
        ConteudoEducacional("Processamento de Imagens com Machine Learning"),
        ConteudoEducacional("Visão Computacional com Machine Learning")
    )

    // Criando formações
    val formacaoJavaScript = Formacao("Formação JavaScript Developer", Nivel.INICIAL, conteudosJavaScript)
    val formacaoMachineLearning = Formacao("Formação Machine Learning Specialist", Nivel.AVANCADO, conteudosMachineLearning)

    // Criando um usuário
    val usuario = Usuario()

    // Matriculando o usuário em algumas formações
    formacaoJavaScript.matricular(usuario)
    formacaoMachineLearning.matricular(usuario)
}

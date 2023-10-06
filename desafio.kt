// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario (val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String, val nivel: Nivel, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
        println("${usuario.nome} foi matriculado no curso $nome")
    }
}

fun main() {
    val conteudo1 = ConteudoEducacional("Introdução ao Kotlin", 90)
    val conteudo2 = ConteudoEducacional("Programação Orientada a Objetos", 120)
    val conteudo3 = ConteudoEducacional("Estruturas de Dados", 150)
    val conteudo4 = ConteudoEducacional("Modelagem de Dados", 90)
    val conteudo5 = ConteudoEducacional("Algoritimos", 120)
    val conteudo6 = ConteudoEducacional("CyberSecurity", 60)
    
    val formacao1 = Formacao("Desenvolvimento de Software", Nivel.INTERMEDIARIO, listOf(conteudo1, conteudo2, conteudo3))
    val formacao2 = Formacao("Engenharia de Software", Nivel.AVANCADO, listOf(conteudo1, conteudo2, conteudo3, conteudo4, conteudo5, conteudo6))
    
    val usuario1 = Usuario("Alice")
    val usuario2 = Usuario("Janio")
    val usuario3 = Usuario("Bento")
    val usuario4 = Usuario("Ubirajara")

    formacao1.matricular(usuario1)
    formacao1.matricular(usuario2)

    println("Inscritos na formação ${formacao1.nome}:")
    for (usuario in formacao1.inscritos) {
        println(usuario.nome)
    }
    
    formacao2.matricular(usuario3)
    formacao2.matricular(usuario4)
    
    println("Inscritos na formação ${formacao2.nome} :")
    for (usuario in formacao2.inscritos) {
        println(usuario.nome)
    }
}
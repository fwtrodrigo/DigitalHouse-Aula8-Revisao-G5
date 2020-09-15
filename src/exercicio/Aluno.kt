package exercicio

class Aluno (nome: String, sobrenome: String, val ra: Int) : Pessoa(nome, sobrenome) {
    fun assistirAula(aula: Aula): String {

    }

    fun fazerLicao() {
        println("Fazendo lição")
    }
}
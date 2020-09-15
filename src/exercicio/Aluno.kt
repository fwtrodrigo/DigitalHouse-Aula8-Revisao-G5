package exercicio

class Aluno (nome: String, sobrenome: String, val ra: Int) : Pessoa(nome, sobrenome) {
    fun assistirAula(aula: Aula) {
        println("Aluno $nome $sobrenome assistindo aula ${aula.materia.nomeMateria}")
    }

    fun fazerLicao(aula :Aula) {
        println("$nome Fazendo lição da aula ${aula.materia.nomeMateria}")
    }
}
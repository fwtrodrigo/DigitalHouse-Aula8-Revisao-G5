package exercicio

class Aluno (nome: String, sobrenome: String, val ra: Int) : Pessoa(nome, sobrenome) {
    fun assistirAula(aula: Aula) {
        println("Aluno $nome $sobrenome assistindo aula $aula.materia.nomeMateria")
    }

    fun fazerLicao() {
        println("Fazendo lição")
    }
}
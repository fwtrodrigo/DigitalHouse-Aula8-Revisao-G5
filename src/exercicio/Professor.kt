package exercicio

class Professor(nome: String, sobrenome: String, val rd: Int) : Pessoa(nome, sobrenome), Docente {
    override fun darAula(aula: Aula) {
        println("Dando a aula ${aula.materia.nomeMateria}")
    }

    override fun fazerChamada(turma: Turma) {
        for (i in turma.curso.listaAluno) {
            println("aluno ${i.nome} presente!!")
        }
    }

}

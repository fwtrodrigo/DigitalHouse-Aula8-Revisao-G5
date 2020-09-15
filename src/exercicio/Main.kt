package exercicio

fun main(){
    val aluno1 = Aluno("João","Silva",12345)
    val aluno2 = Aluno("José","Souza",67890)
    val professor1 = Professor("José","Souza",67890)
    val materia1 = Materia("Estatistica")
    val materia2 = Materia("Calculo 1")
    val aula1 = Aula(materia1, 1000,1800)
    val aula2 = Aula(materia2, 1800,2300)
    var listaAlunos = mutableListOf<Aluno>()
    listaAlunos.add(aluno1)
    listaAlunos.add(aluno2)
    var listaAulas = mutableListOf<Aula>()
    listaAulas.add(aula1)
    listaAulas.add(aula2)
    val curso1 = Curso("Matemática",listaAlunos,listaAulas,professor1)
    val turma1 = Turma("TURMA 01",curso1)
    professor1.fazerChamada(turma1)
    professor1.darAula(aula1)
    aluno1.assistirAula(aula1)
    aluno2.assistirAula(aula1)
    aluno1.fazerLicao(aula1)
    aluno2.fazerLicao(aula1)
    professor1.fazerChamada(turma1)
    professor1.darAula(aula2)
    aluno1.assistirAula(aula2)
    aluno2.assistirAula(aula2)
    aluno1.fazerLicao(aula2)
    aluno2.fazerLicao(aula2)


}
package sistemaEscola;

import java.util.Date;

public class Matricula {

    private Curso curso;
    private Aluno aluno;
    Date dataMatricula = new Date();

    public Matricula(){};

    public Matricula(Curso curso, Aluno aluno) {
        this.curso = curso;
        this.aluno = aluno;
        this.dataMatricula = new Date();
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Date getDataMatricula() {
        return dataMatricula;
    }

    public void setDataMatricula(Date dataMatricula) {
        this.dataMatricula = dataMatricula;
    }
}

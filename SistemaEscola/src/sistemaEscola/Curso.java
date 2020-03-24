package sistemaEscola;

import java.util.ArrayList;
import java.util.List;

public class Curso {

    private String nomeCurso;
    private int codCurso;
    private int vagasAula;
    ProfessorTitular professorTitular;
    ProfessorAdjunto professorAdjunto;
    List<Aluno> listaDealunos;

    public Curso(){};
    public Curso(String nomeCurso, int codCurso, int vagasAula, ProfessorTitular professorTitular, ProfessorAdjunto professorAdjunto, List<Aluno> aluno) {
        this.nomeCurso = nomeCurso;
        this.codCurso = codCurso;
        this.vagasAula = vagasAula;
        this.professorTitular = professorTitular;
        this.professorAdjunto = professorAdjunto;
        this.listaDealunos = aluno;
    }



    public List<Aluno> getAluno() {
        return listaDealunos;
    }

    public void setListaDealunos(List<Aluno> aluno) {
        this.listaDealunos = aluno;
    }

    public int getVagasAula() {
        return vagasAula;
    }

    public void setVagasAula(int vagasAula) {
        this.vagasAula = vagasAula;
    }

    public String getNomeCurso() {
        return nomeCurso;
    }

    public void setNomeCurso(String nomeCurso) {
        this.nomeCurso = nomeCurso;
    }

    public int getCodCurso() {
        return codCurso;
    }

    public void setCodCurso(int codCurso) {
        this.codCurso = codCurso;
    }

    public ProfessorTitular getProfessorTitular() {
        return professorTitular;
    }

    public void setProfessorTitular(ProfessorTitular professorTitular) {
        this.professorTitular = professorTitular;
    }

    public ProfessorAdjunto getProfessorAdjunto() {
        return professorAdjunto;
    }

    public void setProfessorAdjunto(ProfessorAdjunto professorAdjunto) {
        this.professorAdjunto = professorAdjunto;
    }

    public void verificarCurso(int procurarCurso){
        if(this.getCodCurso() == procurarCurso){
            System.out.println("Curso encontrado");
        }else{
            System.out.println("Curso não encontrado");
        }
    }


    public boolean adicionarAluno(Aluno umAluno){
        int vagasOcupadas = this.listaDealunos.size();
        if(this.getVagasAula() > vagasOcupadas){
            this.listaDealunos.add(umAluno);
            return true;
        }else{
            return false;
        }
    }

    public void excluirAluno(Aluno umAluno){
        for(Aluno index: this.listaDealunos){
            if(index == umAluno){
                this.listaDealunos.remove(umAluno);
            }
        }
    }


}


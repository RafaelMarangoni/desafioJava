package sistemaEscola;

import java.util.ArrayList;
import java.util.List;

public class DigitalHouseManager {

    private List<Aluno> listaAluno = new ArrayList<>();
    private List<Curso> listaCurso = new ArrayList<>();
    private List<Matricula> listaMatricula = new ArrayList<>();
    private List<Professor> listaProfessor = new ArrayList<>();

    public List<Aluno> getListaAluno() {
        return listaAluno;
    }

    public void setListaAluno(List<Aluno> listaAluno) {
        this.listaAluno = listaAluno;
    }

    public List<Curso> getListaCurso() {
        return listaCurso;
    }

    public void setListaCurso(List<Curso> listaCurso) {
        this.listaCurso = listaCurso;
    }

    public List<Matricula> getListaMatricula() {
        return listaMatricula;
    }

    public void setListaMatricula(List<Matricula> listaMatricula) {
        this.listaMatricula = listaMatricula;
    }

    public List<Professor> getListaProfessor() {
        return listaProfessor;
    }

    public void setListaProfessor(List<Professor> listaProfessor) {
        this.listaProfessor = listaProfessor;
    }

    public void registrarCurso(String nomeCurso, int codCurso,int quantidadeMaximaDeAlunos){
        Curso novoCurso = new Curso ();
        novoCurso.setNomeCurso(nomeCurso);
        novoCurso.setCodCurso(codCurso);
        novoCurso.setVagasAula(quantidadeMaximaDeAlunos);

        this.listaCurso.add(novoCurso);
        System.out.println("curso adicionado com sucesso");

    }

    public void excluirCurso(int codigoCurso){
        for (Curso index: this.listaCurso) {
            if(index.getCodCurso() == codigoCurso){
                this.listaCurso.remove(index);
                System.out.println("curso" + index.getNomeCurso() + " excluido com sucesso");
            }else{
                System.out.println("curso nao encontraado");
            }
        }
    }

    public void registrarProfessorAdjunto(String nome, String sobrenome, int codigoProfessor, int quantidadeDeHoras){
        ProfessorAdjunto novoProfessorAdjunto = new ProfessorAdjunto();
        novoProfessorAdjunto.setNome(nome);
        novoProfessorAdjunto.setSobreNome(sobrenome);
        novoProfessorAdjunto.setCodProfessor(codigoProfessor);
        novoProfessorAdjunto.setQuantDeHoras(quantidadeDeHoras);

        this.listaProfessor.add(novoProfessorAdjunto);
        System.out.println("professor " + novoProfessorAdjunto.getNome() + "cadastrado com sucesso");
    }

    public void registrarProfessorTitular(String nome, String sobrenome, int codigoProfessor, String especialidade){
        ProfessorTitular novoProfessorTitular = new ProfessorTitular();
        novoProfessorTitular.setNome(nome);
        novoProfessorTitular.setSobreNome(sobrenome);
        novoProfessorTitular.setCodProfessor(codigoProfessor);
        novoProfessorTitular.setEspecialidade(especialidade);

        this.listaProfessor.add(novoProfessorTitular);
        System.out.println("professor cadastrado com sucesso " + novoProfessorTitular.getNome());
    }

    public void excluirProfessor(int codigoProfessor){
        this.listaProfessor.removeIf(index -> index.getCodProfessor() == codigoProfessor);
        System.out.println("professor excluido com sucesso");
    }

    public void matricularAluno(String nome, String sobrenome, int codigoAluno){
        Aluno novoAluno = new Aluno(nome,sobrenome,codigoAluno);
        listaAluno.add(novoAluno);
        System.out.println("aluno adicionado com sucesso");
    }

    public void matricularAluno(Integer codigoAluno, Integer codigoCurso) {

        Curso cursoEncontrado = null;
        Aluno alunoEncontrado = null;
        Matricula matricula;

        for (Curso indexCurso : this.listaCurso) {
            if (indexCurso.getCodCurso() == codigoCurso) {
                cursoEncontrado = indexCurso;

            }
        }

        for (Aluno indexAluno : this.listaAluno) {
            if (indexAluno.getCodAluno()== codigoAluno){
                alunoEncontrado = indexAluno;
            }
        } if(cursoEncontrado != null && alunoEncontrado !=null){
            if (cursoEncontrado.adicionarAluno(alunoEncontrado)){
                matricula = new Matricula(cursoEncontrado, alunoEncontrado);
                listaMatricula.add(matricula);
                System.out.println("matricula realizada com sucesso !!!");
            }else{
                System.out.println("deu ruim irmao");
            }


        //if (this.listaCurso.get(CursoEncontrado).adicionarAluno(alunoEncontrado)) {
//            Curso cursoDesejado = listaCurso.get(CursoEncontrado);
//            this.listaMatricula.add(new Matricula(cursoDesejado, alunoEncontrado));
//        }else{
//            System.out.println("Infelizmente nao pode ser realizada.");
//        }
        }
    }

    public void alocarProfessores(Integer codigoCurso, Integer codigoProfessorTitular, Integer codigoProfessorAdjunto){
        int cursoEncontrado = 0;
        Professor profTitular = null;
        Professor profAdjunto = null;


        for (Curso indexCurso: this.listaCurso) {
            if(indexCurso.getCodCurso() == codigoCurso){
                cursoEncontrado = this.listaCurso.indexOf(indexCurso);
                break;
            }
        }

        for (Professor indexProfessor : listaProfessor) {
            if(indexProfessor.getCodProfessor() == codigoProfessorTitular){
                profTitular =  indexProfessor;
                this.listaCurso.get(cursoEncontrado).setProfessorTitular((ProfessorTitular)profTitular);
                System.out.println("professor adjunto inserido com sucesso");
            }else if(indexProfessor.getCodProfessor() == codigoProfessorAdjunto){
                profAdjunto = indexProfessor;
                this.listaCurso.get(cursoEncontrado).setProfessorAdjunto((ProfessorAdjunto)profAdjunto);
                System.out.println("professor adjunto inserido com sucesso");
            }
        }

    }




}

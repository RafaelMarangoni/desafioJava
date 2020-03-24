package sistemaEscola;

public class ProfessorTitular extends Professor {

    private String especialidade;

    public ProfessorTitular(){};
    public ProfessorTitular(String nome, String sobreNome, int tempoCasa, int codProfessor, String especialidade) {
        super(nome, sobreNome, tempoCasa, codProfessor);
        this.especialidade = especialidade;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

}

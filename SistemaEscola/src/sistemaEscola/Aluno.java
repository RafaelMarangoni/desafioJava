package sistemaEscola;

public class Aluno {

    private String nome;
    private String sobreNome;
    private int codAluno;

    public Aluno(String nome, String sobreNome, int codAluno) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        this.sobreNome = sobreNome;
    }

    public int getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(int codAluno) {
        this.codAluno = codAluno;
    }

    public void verificarAluno(int procurarCodAluno){
        if(this.getCodAluno() == procurarCodAluno){
            System.out.println("Aluno encontrado");
        }else{
            System.out.println("Aluno não encontrado");
        }
    }
}

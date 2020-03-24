package sistemaEscola;

public class Professor {

    private String nome, sobreNome;
    private int tempoCasa, codProfessor;

    public Professor(){};
    public Professor(String nome, String sobreNome, int tempoCasa, int codProfessor) {
        this.nome = nome;
        this.sobreNome = sobreNome;
        this.tempoCasa = tempoCasa;
        this.codProfessor = codProfessor;
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

    public int getTempoCasa() {
        return tempoCasa;
    }

    public void setTempoCasa(int tempoCasa) {
        this.tempoCasa = tempoCasa;
    }

    public int getCodProfessor() {
        return codProfessor;
    }

    public void setCodProfessor(int codProfessor) {
        this.codProfessor = codProfessor;
    }

    public void verificarProfessor(int procurarCodProfessor){
        if(this.getCodProfessor() == procurarCodProfessor){
            System.out.println("professor encontrado");
        }else{
            System.out.println("professor encontrado");
        }
    }
}

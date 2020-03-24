package sistemaEscola;

public class ProfessorAdjunto extends Professor {


    private double quantDeHoras;

    public ProfessorAdjunto(){};
    public ProfessorAdjunto(String nome, String sobreNome, int tempoCasa, int codProfessor, double quantDeHoras) {
        super(nome, sobreNome, tempoCasa, codProfessor);
        this.quantDeHoras = quantDeHoras;
    }

    public double getQuantDeHoras() {
        return quantDeHoras;
    }

    public void setQuantDeHoras(double quantDeHoras) {
        this.quantDeHoras = quantDeHoras;
    }
}

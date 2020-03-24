package sistemaEscola;

public class Main {

    public static void main(String[] args) {
        ProfessorTitular novoProfTit = new ProfessorTitular("Lindalvo", "Astrogildo", 2, 0001,"full stack" );
        ProfessorAdjunto novoProfAdj = new ProfessorAdjunto("Sem nome", "Ninguem", 3,0002,12);

        ProfessorTitular novoProfTit2 = new ProfessorTitular("Lindalvozildo", "Astroginopolis", 4, 0003,"Android" );
        ProfessorAdjunto novoProfAdj2 = new ProfessorAdjunto("Francisco", "Filho", 5,0004,10);

        Aluno novoaluno = new Aluno("Astolfo", "Girondio",0010);
        Aluno novoaluno2 = new Aluno("Astolfo2", "Girondio1",0011);

        Curso novoCurso = new Curso();
        novoCurso.setNomeCurso("Full Stack");
        novoCurso.setCodCurso(2001);
        novoCurso.setVagasAula(3);

        Curso novoCurso2 = new Curso();
        novoCurso.setNomeCurso("Android");
        novoCurso.setCodCurso(2002);
        novoCurso.setVagasAula(2);

        DigitalHouseManager sistema = new DigitalHouseManager();

        sistema.alocarProfessores(2001,0001,0002);
        sistema.alocarProfessores(2002,0003,0004);

        sistema.matricularAluno("Astolfo", "lindoso",1010);
        sistema.matricularAluno("Reginaldo","Junior",1111);
        sistema.matricularAluno("Maria", "lindoso",1011);
        sistema.matricularAluno("Jose","Junior",1112);
        sistema.matricularAluno("Gumercindo", "lindoso",1013);
        sistema.matricularAluno("Josenildo","Junior",1114);

        sistema.matricularAluno(1010,2002);
        sistema.matricularAluno(1111,2002);
        sistema.matricularAluno(1011,2001);
        sistema.matricularAluno(1112,2001);

    }
}
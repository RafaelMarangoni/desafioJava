package sistemaEscola;

public class Main {

    public static void main(String[] args) {

        DigitalHouseManager sistema = new DigitalHouseManager();

        sistema.registrarProfessorTitular("Lindalvo","Astrogildo",0001,"fullstack");
        sistema.registrarProfessorAdjunto("teste1","teste2",002,12);

        sistema.registrarCurso("Full Stack", 2001,3);
        sistema.registrarCurso("Android",2002,2);

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
public class testeAluno{

    public static void main(String[] args){

    Aluno a1 = new Aluno("Felipe", "ADS", 22207931, "Noturno");
    Prova p1 = new Prova(9, 10, "Estudos1");
    Prova p2 = new Prova(7, 10, "Estudos2");
    Trabalho t1 = new Trabalho("os alagoenses", "matemática", "Eletrônica", 10, 12);

    a1.mostraNota(p1.getNota(), p2.getNota(), t1.getNota(), a1.calcNota(p1.getNota(), p2.getNota(), t1.getNota()));
    }
}
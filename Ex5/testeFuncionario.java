//import java.util.Scanner; 

public class testeFuncionario{
    public static void main(String[] args){

        //Scanner scan = new Scanner(System.in);

        Funcionario f1 = new Funcionario("Roberto");
        Funcionario f2 = new Funcionario("Ronaldo", "Jogador de Futebol");
        Funcionario f3 = new Funcionario("Pedro", "Pedreiro", 15);

        f1.mostrarInfo();
        f2.mostrarInfo();
        f3.mostrarInfo();

        f1.setCargo("professor");
        f1.setSalario(30);

        f2.setSalario(50);

        f1.mostrarInfo();
        f2.mostrarInfo();
        f3.mostrarInfo();

    }
}

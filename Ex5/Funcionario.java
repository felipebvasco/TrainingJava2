import java.util.Scanner; 
public class Funcionario{

    Scanner scan = new Scanner(System.in);

    private String nome;
    private String cargo;
    private double salario;

    Funcionario(String nome){
        this.nome = nome;
    }

    Funcionario(String nome, String cargo) {
        this.nome = nome;
        this.cargo = cargo;
    }

    Funcionario(String nome, String cargo, double salario){
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    String getNome(){
        return nome;
    }

    String getCargo(){
        return cargo;
    }

    double getSalario(){
        return salario;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setCargo(String cargo){
        this.cargo = cargo;
    }

    void setSalario(double salario){
        this.salario = salario;
    }

    void reajusteSalario(dobule salario){
        this.salario = salario;
    }

    double calcMensal(){
        int horas;
        double salariomensal;
        System.out.println("Quantas horas o funcionário trabalhou no mês? ");
        horas = scan.nextInt();
        salariomensal = salario * horas;
        return salariomensal;
    }

    void mostrarInfo(){
        System.out.println("Nome do funcionário: " + getNome());
        System.out.println("Cargo do funcionário: " + getCargo());
        System.out.println("Salário por hora do funcionário: " + getSalario());
        System.out.println("Salário mensal: " + calcMensal());
    }

}
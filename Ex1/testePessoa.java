public class testePessoa{
    public static void main(String[] args){

        Pessoa p1 = new Pessoa("Claudio Evandro", 12);
        Pessoa p2 = new Pessoa("Linguini Leite", 16);

        System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos de idade");
        System.out.println(p2.getNome() + " tem" + p2.getIdade() + " anos de idade");

        p1.setIdade(30);
        p2.setIdade(45);

        System.out.println("Novas idade settadas");

        System.out.println(p1.getNome() + " tem " + p1.getIdade() + " anos de idade");
        System.out.println(p2.getNome() + " tem " + p2.getIdade() + " anos de idade");
    
    }
}
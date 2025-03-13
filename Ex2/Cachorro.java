public class Cachorro{

    private String nome;
    private String raca;
    private int idade;

    Cachorro(String nome, String raca, int idade){
        this.nome = nome;
        this.raca = raca;
        this.idade = idade;
    }

    String getNome(){
        return nome;
    }

    String getRaca(){
        return raca;
    }

    int getIdade(){
        return idade;
    }

    void setNome(String nome){
        System.out.println("o nome do seu cachorro foi alterado");
        this.nome = nome;
    }
    
    void setRaca(String raca){
        System.out.println("A raça do seu cachorro foi alterada");
        this.raca = raca;
    }

    void setIdade(int idade){
        System.out.println("A idade do seu cachorro foi alterada");
        this.idade = idade;
    }
}
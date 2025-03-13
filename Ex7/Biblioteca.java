import java.util.ArrayList;
public class Biblioteca{

    private String endereco;
    private String nome;
    private int anoinaug;
    private ArrayList<Livro> colecao = new ArrayList<Livro>();

    Biblioteca(String endereco, String nome, int anoinaug){
        this.endereco = endereco;
        this.nome = nome;
        this.anoinaug = anoinaug;
    }

    String getEndereco(){
        return endereco;
    }

    void setEndereco(String endereco){
        this.endereco = endereco;
    }
    
    String getNome(){
        return nome;
    }
    
    void setNome(String nome){
        this.nome = nome;
    }

    int getAnoinaug(){
        return anoinaug;
    }

    void setAnoinaug(int anoinaug){
        this.anoinaug = anoinaug;
    }

    void removeLivro(Livro livro){
        colecao.remove(livro);
        System.out.println("Livro Removido da Coleção!\n");
    }

    void addLivro(Livro livro){
        colecao.add(livro);
        System.out.println("Livro Adicionado à Coleção!\n");

    }

    ArrayList<Livro> getColecao(){
        System.out.println(colecao);
        return colecao;
    }

}
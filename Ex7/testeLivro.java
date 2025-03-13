public class testeLivro{

    public static void main(String[] args){

        Livro l1 = new Livro(2008, "Carlos", 233);
        Livro l2 = new Livro(2005, "Roberto", 422);
        Livro l3 = new Livro(2001, "Cariani Renato", 666);
        Livro l4 = new Livro(1995, "Shawshank redemption", 1020);
        Livro l5 = new Livro(1930, "Andy Dufresne", 250);

        Biblioteca b1 = new Biblioteca("Rua Olavo de Carvalho 32", "Biblioteca São João", 1963);
        Biblioteca b2 = new Biblioteca("Antoninho Marmo 280", "Biblioteca municipal", 1914);

        b1.addLivro(l1);
        b1.addLivro(l3);
        b1.addLivro(l5);
        b2.addLivro(l2);
        b2.addLivro(l4);

        b1.getColecao();
        b2.getColecao();

        b1.removeLivro(l1);
        b2.removeLivro(l2);

        b1.getColecao();
        b2.getColecao();


    }
}
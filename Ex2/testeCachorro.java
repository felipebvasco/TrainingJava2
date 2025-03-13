public class testeCachorro{
    public static void main(String[] args){
        Cachorro c1 = new Cachorro("lukinhas", "dobberman", 11);
        Cachorro c2 = new Cachorro("Esterco", "Golden", 14);
        Cachorro c3 = new Cachorro("Ryumen", "Sukuna", 4);

        System.out.println("Eu tenho um cachorro e o nome dele é " + c1.getNome() + " a raça dele é " + c1.getRaca() + " e ele já tem " + c1.getIdade() + " anos de idade");

        System.out.println("Eu tenho um cachorro e o nome dele é " + c2.getNome() + " a raça dele é " + c2.getRaca() + " e ele já tem " + c2.getIdade() + " anos de idade");

        System.out.println("Eu tenho um cachorro e o nome dele é " + c3.getNome() + " a raça dele é " + c3.getRaca() + " e ele já tem " + c3.getIdade() + " anos de idade");

        c1.setNome("Rubens");
        c1.setRaca("Pimenta");
        c1.setIdade(21);

        c2.setNome("alameda");
        c2.setRaca("picadura");
        c2.setIdade(24);

        c3.setNome("avenida");
        c3.setRaca("mananciais");
        c3.setIdade(14);

        System.out.println("Eu tenho um cachorro e o nome dele é " + c1.getNome() + " a raça dele é " + c1.getRaca() + " e ele já tem " + c1.getIdade() + " anos de idade");

        System.out.println("Eu tenho um cachorro e o nome dele é " + c2.getNome() + " a raça dele é " + c2.getRaca() + " e ele já tem " + c2.getIdade() + " anos de idade");

        System.out.println("Eu tenho um cachorro e o nome dele é " + c3.getNome() + " a raça dele é " + c3.getRaca() + " e ele já tem " + c3.getIdade() + " anos de idade");
    }
}

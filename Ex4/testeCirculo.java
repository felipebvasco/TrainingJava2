public class testeCirculo{

    public static void main(String[] args){

        Circulo c1 = new Circulo(5.6);
        Circulo c2 = new Circulo(7.0);

        System.out.println("Área: " + c1.getArea() + "\nPerímetro: " + c1.getVolta());
        System.out.println("Área: " + c2.getArea() + "\nPerímetro: " + c2.getVolta());

        c1.setRaio(10.0);
        c2.setRaio(30.0);

        System.out.println("Área: " + c1.getArea() + "\nPerímetro: " + c1.getVolta());
        System.out.println("Área: " + c2.getArea() + "\nPerímetro: " + c2.getVolta());
    }
}
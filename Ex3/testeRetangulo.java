public class testeRetangulo{
    public static void main(String[] args){
        
        Retangulo r1 = new Retangulo(5.5);
        Retangulo r2 = new Retangulo(6, 9);

        System.out.println("retângulo de lados " + r1.getAltura() + " e " + r1.getBase() + " tem\nPerímetro: " + r1.getPeri() + "\nÁrea: " + r1.getArea());
        System.out.println("retângulo de lados " + r2.getAltura() + " e " + r2.getBase() + " tem\nPerímetro: " + r2.getPeri() + "\nÁrea: " + r2.getArea());

        r2.setAltura(3);
        r2.setBase(5);

        System.out.println("retângulo de lados " + r2.getAltura() + " e " + r2.getBase() + " tem\nPerímetro: " + r2.getPeri() + "\nÁrea: " + r2.getArea());
    }
}
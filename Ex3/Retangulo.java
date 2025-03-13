public class Retangulo{

    private double base;
    private double altura;

    Retangulo(double base){
        this.base = base;
        this.altura = base;
    }

    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }
    
    public double getBase(){
        return base;
    }

    public double getArea(){
        return (base * altura);
    }

    public double getPeri(){
        return 2* (base + altura);
    }
    
    public void setAltura(double altura){
        this.altura = altura;
        System.out.println("Altura alterada com sucesso!");
    }

    public void setBase(double base){
        this.base = base;
        System.out.println("Base alterada com sucesso!");
    }
}

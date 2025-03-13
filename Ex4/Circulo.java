public class Circulo{

    private Double raio;

    Circulo(Double raio){
        this.raio = raio;
    }

    Double getRaio(){
        return raio;
    }

    void setRaio(Double raio){
        this.raio = raio;
        System.out.println("Raio alterado com sucesso");
    }

    Double getDiametro(){
        return 2 * raio;
    }

    Double getVolta(){
        return 2 * 3.14 * raio;
    }

    Double getArea(){
        return raio * raio * 3.14;
    }

}
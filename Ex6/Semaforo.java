public class Semaforo{

    private String cor;
    private int segundos;
    private boolean estado;

    Semaforo(String cor, int segundos, boolean estado){
        this.cor = cor;
        this.segundos = segundos;
        this.estado = estado;
    }

    int getTempo(){
        return segundos;
    }

    void setTempo(int segundos) {
        this.segundos = segundos;
    }

    String getCor(){
        return cor;
    }

    void setCor(String cor){
        this.cor = cor;
    }

    boolean getEstado(){
    //    if(estado == true) {
    //        System.out.println("O farol está verde!\n");
            return estado;
    //    }
    //    else {
    //       System.out.println("O farol está vermelho!\n");
    //        return estado;
    //    }
    }

    void setEstado(boolean estado){
        this.estado = estado;
        if (estado == true) {
            cor = "Verde";
        }
        else {
            cor = "Vermelho";
        }
    }

    void mostrarInfo(){
        System.out.println("Mostrando informações do farol!\nCor: " + getCor() + "\nTempo: " + getTempo() + " Segundos\nEstado: " + getEstado() + "\n\n");
    }
}



public class testeSemaforo{

    public static void main(String[] args){

        Semaforo s1 = new Semaforo("Verde", 5, true);
        Semaforo s2 = new Semaforo("Vermelho", 3, false);

        s1.mostrarInfo();
        s2.mostrarInfo();

        s1.setEstado(false);
        s1.setTempo(10);

        s2.setEstado(true);
        s2.setTempo(15);

        s1.mostrarInfo();
        s2.mostrarInfo();
    }
}
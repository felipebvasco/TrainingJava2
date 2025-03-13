public class Prova{

    private float nota;
    private int nq;
    private String materia;

    Prova(float nota, int nq, String materia){
        this.nota = nota;
        this.nq = nq;
        this.materia = materia;
    }

    float getNota(){
        return nota;
    }

    int getNq(){
        return nq;
    }

    String getMateria(){
        return materia;
    }

    void setNota(float nota){
        this.nota = nota;
    }

    void setNq(int nq){
        this.nq = nq;
    }

    void setMateria(String materia){
        this.materia = materia;
    }
}
public class Trabalho{

    private String titulo;
    private String tema;
    private String materia;
    private float nota;
    private int np;

    Trabalho(String titulo, String tema, String materia, float nota, int np){
        this.titulo = titulo;
        this.tema = tema;
        this.materia = materia;
        this.nota = nota;
        this.np = np;
    }

    String getTitulo(){
        return titulo;
    }

    String getTema(){
        return tema;
    }

    String getMateria(){
        return materia;
    }

    float getNota(){
        return nota;
    }

    int getNp(){
        return np;
    }

    void setTitulo(String titulo){
        this.titulo = titulo;
    }

    void setTema(String tema){
        this.tema = tema;
    }

    void setMateria(String materia){
        this.materia = materia;
    }

    void setNota(float nota){
        this.nota = nota;
    }

    void setNp(int np){
        this.np = np;
    }
}
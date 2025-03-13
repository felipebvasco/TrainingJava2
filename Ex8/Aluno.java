public class Aluno{

    private String nome;
    private String curso;
    private float nota;
    private int matricula;
    private String periodo;

    Aluno(String nome, String curso, int matricula, String periodo){
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.periodo = periodo;
    }


    String getNome(){
        return nome;
    }
    
    String getCurso(){
        return curso;
    }

    int getMatricula(){
        return matricula;
    }

    String getPeriodo(){
        return periodo;
    }

    float calcNota(float n1, float n2, float t1){
        return (n1 + n2 + t1) / 3;
    }

    void setNome(String nome){
        this.nome = nome;
    }

    void setCurso(String curso){
        this.curso = curso;
    }

    void setMatricula(int matricula){
        this.matricula = matricula;
    }

    void setPeriodo(String periodo){
        this.periodo = periodo;
    }

    void mostraNota(float n1, float n2, float t1, float media){
        System.out.println("notas:\nP1: " + n1 + "\nP2: " + n2 + "\nT1: " + t1 + "\nMédia: " + media);
    }
}


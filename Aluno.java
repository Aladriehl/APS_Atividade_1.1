public class Aluno {

    // atributos
    String nome;
    String matricula;
    Curso curso;

    // construtores
    public Aluno(String matricula) {
        this.matricula = matricula;
    }

    public Aluno(String nome, String matricula, Curso curso) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
    }

    // gets sets e metodos
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public Curso getCurso() {
        return this.curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }
}
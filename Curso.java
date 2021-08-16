import java.util.HashMap;
public Class Curso{
    //atributos
    String nome;
    String desc;
    int codigo;
    HashMap<Integer,String> matriculados =new HashMap<Integer,String>();
    
    //construtores    
    public Curso(int codigo,String nome){
        this.codigo=codigo;
        this.nome=nome;
    }
    
    public Curso(int codigo,String nome,String desc){
        this.codigo=codigo;
        this.nome=nome;
        this.desc=desc;
    }

    //get sets e metodos

    public void matricularAluno(Aluno aluno){
        this.matriculados.put(aluno.getMatricula(),aluno);
    }

    public int getCodigo(){
        return this.codigo;
    }

    public String getNome(){
        return this.nome;
    }

    public vois setNome(String nome){
        this.nome=nome;
    }

    public String getDescricao(){
        return this.desc;
    }

    public void setDescricao(String desc){
        this.desc=desc;
    }

    public Aluno getAluno(String matricula){
        return matriculados.get(matricula);
    }
}
public class Funcionarios {
    private String nome;
    private String matricula;

    //Criação do construtor
    public Funcionarios(String nome, String matricula){
        this.setNome(nome);
        this.setMatricula(matricula);
    }

    //Criação dos metodos get
    public String getNome(){
        return this.nome;
    }

    public String getMatricula(){
        return this.matricula;
    }

    //Criação dos metodos set
    public void setNome(String nome){
        if(nome == null || nome.length() == 0){
            return;
        }
        this.nome = nome;
    }

    public void setMatricula(String matricula){
        if(matricula == null || matricula.length() == 0){
            return;
        }
        this.matricula = matricula;
    }
}

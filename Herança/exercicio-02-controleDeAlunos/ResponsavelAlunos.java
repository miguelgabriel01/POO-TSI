public class ResponsavelAlunos extends DadosPessoaisBasicos{
    protected Integer telefone;

    //criamos o construtor da classe
    public ResponsavelAlunos(String nomeCompleto, String dataDeNascimento, String endereco, Integer rg, String cpf, String email, Integer telefone){
        super(nomeCompleto,dataDeNascimento,endereco,rg,cpf,email);
        this.setTelefone(telefone);
    }

    //criamos os metodos get
    public Integer getTelefone(){
        return this.telefone;
    }

    //criamos os metodos set
    public void setTelefone(Integer telefone){
        if(telefone <= 0){
            return;
        }
        this.telefone = telefone;
    }
}



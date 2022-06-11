public class DadosPessoaisBasicos {
    protected String nomeCompleto;
    protected String dataDeNascimento;
    protected String endereco;
    protected Integer rg;
    protected String cpf;
    protected String email;

    //criamos o construtor da classe
    public DadosPessoaisBasicos(String nomeCompleto, String dataDeNascimento, String endereco, Integer rg, String cpf, String email){
        this.setNomeCompleto(nomeCompleto);
        this.setDataDeNascimento(dataDeNascimento);
        this.setEndereco(endereco);
        this.setRg(rg);
        this.setCpf(cpf);
        this.setEmail(email);
    }

    //criamos os metodos get
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    public String getDataDeNascimento(){
        return this.dataDeNascimento;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public Integer getRg(){
        return this.rg;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEmail(){
        return this.email;
    }

    //criamos os metodos set
    public void setNomeCompleto(String nomeCompleto){
        if(nomeCompleto == null || nomeCompleto.length() == 0){
            return;
        }
        this.nomeCompleto = nomeCompleto;
    }

    public void setDataDeNascimento(String dataDeNascimento){
        if(dataDeNascimento == null || dataDeNascimento.length() == 0){
           return; 
        }
        this.dataDeNascimento = dataDeNascimento;
    }

    public void setEndereco(String endereco){
        if(endereco ==  null || endereco.length() == 0){
            return;
        }
        this.endereco = endereco;
    }

    public void setRg(Integer rg){
        if(rg <= 0){
            return;
        }
        this.rg = rg;
    }

    public void setCpf(String cpf){
        if(cpf ==  null || cpf.length() == 0){
            return;
        }
        this.cpf = cpf;
    }

    public void setEmail(String email){
        if(email == null || email.length() == 0){
            return;
        }
        this.email = email;
    }
}


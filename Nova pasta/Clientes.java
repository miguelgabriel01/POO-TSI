public class Clientes {
    private String nome;
    private String endereco;
    private Integer cpf;
    private Interger numeroDaCarteira;

    //Criamos o construtor
    public Clientes(String nome, String endereco, Integer cpf, Integer numeroDaCarteira){
        this.setNome(nome);
        this.setEndereco(endereco);
        this.setCpf(cpf);
        this.setNumeroDaCarteira(numeroDaCarteira);
    }

    //Criamos os metodos get
    public String getNome(){
        return this.nome;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public Integer getCpf(){
        return this.cpf;
    }

    public Integer getNumeroDaCarteira(){
        return this.numeroDaCarteira;
    }

    //criamos os metodos set
    public void setNome(String nome){
        if(nome == null || nome.length() == 0){
            return;
        }
        this.nome = nome;
    }

    public void setEndereco(String endereco){
        if(endereco == null || endereco.length() == 0){
            return;
        }
        this.endereco = endereco;
    }

    public void setCpf(Integer cpf){
        if(cpf < 0){
            return;
        }
        this.cpf = cpf;
    }

    public void setNumeroDaCarteira(Integer numerodaCarteira){
        if(numerodaCarteira < 0){
            return;
        }
        this.numeroDaCarteira = numerodaCarteira;
    }
}

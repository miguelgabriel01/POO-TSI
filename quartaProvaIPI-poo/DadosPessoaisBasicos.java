public class DadosPessoaisBasicos {

    //dados que pertecem exclusivamente ao cliente
    protected String nomeCompleto;
    protected String cpf;
    protected String endereco;
    protected String telefoneDeContato;
    protected String email;

    //criamos o construtor da class
    public DadosPessoaisBasicos(  String nomeCompleto, String cpf, String endereco, String telefoneDeContato, String email){
        this.setNomeCompleto(nomeCompleto);
        this.setCpf(cpf);
        this.setEndereco(endereco);
        this.setTelefoneDeContato(telefoneDeContato);
        this.setEmail(email);
        this.setMatriculaFuncional(matriculaFuncional);
    }

    //criamos os metodos get
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    public String getCpf(){
        return this.cpf;
    }

    public String getEndereco(){
        return this.endereco;
    }

    public String getTelefoneDeContato(){
        return this.telefoneDeContato;
    }

    public String getEmail(){
        return this.email;
    }

    public String getMatriculaFuncional(){
        return this.matriculaFuncional;
    }

    public void setNomeCompleto(String nomeCompleto){
        if(nomeCompleto == null || nomeCompleto.length() == 0){
            return;
        }
        this.nomeCompleto = nomeCompleto;
    }

    public void setCpf(String cpf){
        if(cpf == null || cpf.length() == 0){
            return;
        }
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        if(endereco == null || endereco.length() == 0){
            return;
        }
        this.endereco = endereco;
    }

    public void setTelefoneDeContato(String telefoneDeContato){
        if(telefoneDeContato == null || telefoneDeContato.length() == 0){
            return;
        }
        this.telefoneDeContato = telefoneDeContato;
    }

    public void setEmail(String email){
        if(email == null || email.length() == 0){
            return;
        }
        this.email = email;
    }

    public void setMatriculaFuncional(String matriculaFuncional){
        if(matriculaFuncional == null || matriculaFuncional.length() == 0){
            return;
        }
        this.matriculaFuncional = matriculaFuncional;
    }
}
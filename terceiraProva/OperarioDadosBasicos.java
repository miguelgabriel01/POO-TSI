public class OperarioDadosBasicos {
    protected Integer idNumber;
    protected String nomeDoFuncionario;
    protected String[] habilidades;
    protected String[] funcaoAtual;
    protected String[] areasDeAtuacao;

    //criamos o construtor da classe
    public OperarioDadosBasicos(Integer idNumber, String nomeDoFuncionario, String[] habilidades, String[] funcaoAtual, String[] areasDeAtuacao ){
        this.setIdNumber(idNumber);
        this.setNomeDoFuncionario(nomeDoFuncionario);
        this.setHabilidades(habilidades);
        this.setFuncaoAtual(funcaoAtual);
        this.setAreaDeAtuacao(areasDeAtuacao);
    }

    //criamos os metodos get
    public Integer getIdNumber(){
        return this.idNumber
    }

    public String getNomeDoFuncionario(){
        return this.nomeDoFuncionario;
    }

    public String[] getHabilidades(){
        return this.habilidades;
    }

    public String[] getFuncaoAtual(){
        return this.funcaoAtual;
    }

    public String[] getAreaDeAtuacao(){
        return this.areasDeAtuacao;
    }

    //criamos os metodos set
    public void setIdNumber(Integer idNumber){
        if(idNumber <= 0){
            return;
        }
        this.idNumber = idNumber;
    }

    public void setNomeDoFuncionario(String nomeDoFuncionario){
        if(nomeCompleto == null || nomeDoFuncionario.length() == 0){
            return;
        }
        this.nomeDoFuncionario =nomeDoFuncionario;
    }

    public void setHabilidades(String[] habilidades){
        if(habilidades.length <= 0){
            return;
        }
        this.habilidades = habilidades;
    }

    public void setFuncaoAtual(String[] funcaoAtual){
        if(funcaoAtual.length <= 0){
            return;
        }
        this.funcaoAtual = funcaoAtual;
    }

    public void setAreaDeAtuacao(String[] areasDeAtuacao){
        if(areasDeAtuacao.length <= 0){
            return;
        }
        this.funcaoAtual = funcaoAtual;
    }
    
}

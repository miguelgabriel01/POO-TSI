public class DadosPessoaisBasicos {
    protected static String nomeCompleto;

    //criamos o construtor da class
    public DadosPessoaisBasicos(String nomeCompleto){
        this.setNomeCompleto(nomeCompleto);
    }

    //criamos os metodos get
    public String getNomeCompleto(){
        return this.nomeCompleto;
    }

    //criamos os metodos set
    public void setNomeCompleto(String nomeCompleto){
        if(nomeCompleto.length() < 0){
            return;
        }
        this.nomeCompleto = nomeCompleto;
    }
}

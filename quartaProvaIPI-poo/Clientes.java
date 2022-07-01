public class Clientes extends DadosPessoaisBasicos{
    protected String modeloEscolhido;
    protected Boolean primeiroDaFila;

    public Clientes(String nomeCompleto, String cpf, String endereco, String telefoneDeContato, String email, String modeloEscolhido, Boolean primeiroDaFila){
        super(nomeCompleto,cpf,endereco,telefoneDeContato,email);
        this.setModeloEscolhido(modeloEscolhido);
        this.setPrimeiroDaFila(primeiroDaFila);
    }

    //criamos os metodos get
    public String getModeloEscolhido(){
        return this.modeloEscolhido;
    }

    public Boolean getPrimeiroDaFila(){
        return this.primeiroDaFila();
    }

    //criamos os metodos set
    public void setModeloEscolhido(String modeloEscolhido){
        if(modeloEscolhido == null || modeloEscolhido.length() == 0){
            return;
        }
        this.modeloEscolhido = modeloEscolhido;
    }

    public void setPrimeiroDaFila(boolean primeiroDaFila){
        this.primeiroDaFila = primeiroDaFila;
    }

    //instanciamos a class
    public static Funcionarios dadosClientes(){
        Clientes clientesDadosBasicos = new Clientes("paulo jose da silva", "44455588827", "Rua sem saida", "81554785854", "meajuda@poo.com.br","HB20",true);
        return clientesDadosBasicos;
    }
    
}

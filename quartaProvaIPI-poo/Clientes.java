public class Clientes extends DadosPessoaisBasicos{
    public Clientes(String nomeCompleto, String cpf, String endereco, String telefoneDeContato, String email){
        super(nomeCompleto,cpf,endereco,telefoneDeContato,email);
    }

        //instanciamos a class
        public static Funcionarios dadosClientes(){
            Clientes clientesDadosBasicos = new Clientes("paulo jose da silva", "44455588827", "Rua sem saida", "81554785854", "meajuda@poo.com.br");
            return clientesDadosBasicos;
        }
}

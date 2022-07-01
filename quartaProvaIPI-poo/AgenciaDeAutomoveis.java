public class AgenciaDeAutomoveis  implements SistemaDeVendasInterface{
    
    public Clientes dadosClientesInfo = clientesDadosBasicos.dadosClientes();
    public Funcionarios dadosFuncionariosInfo = funcionarioDadosBasicos.dadosFuncionarios();
    public Clientes dadosVeiculosInfo = veiculosdados.veiculosInfo();


    //usamos os metodos criados na interface
    public static boolean verificarSeoClienteEODaVez(){
        boolean clienteDaVez = false;
        if(primeiroDaFila == true){
            clienteDaVez = true;
        }
        return clienteDaVez;
    }

    public static boolean verificarSeNovoVeiculoEstaDisponivel(){
        Boolean veiculoDisponivel = false;
        for(String i : modelo){
            if(i == modeloEscolhido){
                veiculoDisponivel = true;
            }
        }
    }

    public static boolean getAcionarClienteSobreVeiculo(){
        boolean possivelCompra = false;
        if(verificarSeoClienteEODaVez() == true && verificarSeNovoVeiculoEstaDisponivel() == true){
            possivelCompra = true;
            return "cliente foi informado sobre disponibilidade do veiculo";
        }
    }

    public static boolean getRespostaDoClienteSobreOVeiculo(){
        if(getAcionarClienteSobreVeiculo() == true){
            primeiroDaFila = false;
            return "compra efetuada com sucesso";
        }
    }

    public static void main(String[] args){
        verificarSeoClienteEODaVez();
        verificarSeNovoVeiculoEstaDisponivel();
        getAcionarClienteSobreVeiculo();
        getRespostaDoClienteSobreOVeiculo();
    }
}
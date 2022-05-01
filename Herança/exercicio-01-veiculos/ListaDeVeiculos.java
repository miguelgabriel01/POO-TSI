public class ListaDeVeiculos {
    public static void main(String[] args){
        VeiculosDeCarga veiculosDeCargaInfo = VeiculosDeCarga.listarVeiculosDeCarga();
        VeiculosDePasseio veiculosDePasseioInfo = VeiculosDePasseio.listarVeiculosDePasseio();
        System.out.println("VEICULOS DE CARGA");
        System.out.println(" ");
        System.out.println("FABRICANTE: " + veiculosDeCargaInfo.getFabricante());
        System.out.println("MODELO: " + veiculosDeCargaInfo.getModelo());
        System.out.println("PLACA: " + veiculosDeCargaInfo.getPlaca());
        System.out.println("ANO: " + veiculosDeCargaInfo.getAno());
        System.out.println("CHASSIS: " + veiculosDeCargaInfo.getChassis());
        System.out.println("CAPACIDADE DE CARGA: " + veiculosDeCargaInfo.getCapacidadeDeCarga() + "KG");
        System.out.println("-------------------------------");
        System.out.println(" ");

        System.out.println("VEICULOS DE PASSEIO");
        System.out.println(" ");
        System.out.println("FABRICANTE: " + veiculosDePasseioInfo.getFabricante());
        System.out.println("CHASSIS: " + veiculosDePasseioInfo.getChassis());
        System.out.println("MODELO: " + veiculosDePasseioInfo.getModelo());
        System.out.println("PLACA: " + veiculosDePasseioInfo.getPlaca());
        System.out.println("ANO: " + veiculosDePasseioInfo.getAno());
        System.out.println("CHASSIS: " + veiculosDePasseioInfo.getChassis());
        System.out.println("NUMERO DE PORTAS: " + veiculosDePasseioInfo.getQuantidadeDePortas());
        if(veiculosDePasseioInfo.getArcondicionado() == true){
            System.out.println("POSSUIE ARCONDICIONADO? SIM!!!");
        }else{
            System.out.println("POSSUIE ARCONDICIONADO? NAO!!!");            
        }
        System.out.println("-------------------------------");
    }
    
}

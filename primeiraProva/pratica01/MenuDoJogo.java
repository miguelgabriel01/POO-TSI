public class MenuDoJogo {
    public static void main(String[] args) {

        Humanos humanosInfo = Humanos.listarHumano();
        Robos robosInfo = Robos.listarRobo();
        Alienigenas alienigenasInfo = Alienigenas.listarAlienigenas();
        Armas[] armasInfo = Armas.listaDeArmas();

        System.out.println("ESCOLHA SEU PERSONAGEM");
        System.out.println("");
        System.out.println("Humanos:");
        System.out.println("Nacionalidade: " + humanosInfo.getNacionalidade());
        System.out.println("Cor Da Pele: " + humanosInfo.getCorDaPele());
        System.out.println("Genero: " + humanosInfo.getGenero());
        System.out.println("Arma Padrao: " + humanosInfo.getArmaPadrao());
        System.out.println("----------------------");
        System.out.println("");

        System.out.println("Robos: ");
        System.out.println("Modelo: " + robosInfo.getModelo());
        System.out.println("Fabricante: " + robosInfo.getFabricante());
        System.out.println("Arma Padrão: " + humanosInfo.getArmaPadrao());
        System.out.println("----------------------");
        System.out.println("");

        System.out.println("Alienigena: ");
        System.out.println("Planeta De Origem: " + alienigenasInfo.getPlanetaDeOrigem());
        System.out.println("Raca: " + alienigenasInfo.getRaca());
        System.out.println("Arma Padrao: " + alienigenasInfo.getArmaPadrao());
        System.out.println("----------------------");

        System.out.println("ARMAS DISPONIVEIS:");
        System.out.println("Tipo: " + armasInfo[0].getTipo());
        System.out.println("Potencia: " + armasInfo[0].getPotencia());
        System.out.println("Capacidade: " + armasInfo[0].getCapacidadeDeTiros());
        System.out.println("");
        System.out.println("******************");

        System.out.println("Tipo: " + armasInfo[1].getTipo());
        System.out.println("Potencia: " + armasInfo[1].getPotencia());
        System.out.println("Capacidade: " + armasInfo[1].getCapacidadeDeTiros());
        System.out.println("");
        System.out.println("******************");

        System.out.println("Tipo: " + armasInfo[2].getTipo());
        System.out.println("Potencia: " + armasInfo[2].getPotencia());
        System.out.println("Capacidade: " + armasInfo[2].getCapacidadeDeTiros());
        System.out.println("");
        System.out.println("******************");
        System.out.println(" ");
        System.out.println("----------------------");

    }
}

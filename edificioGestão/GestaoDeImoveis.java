public class GestaoDeImoveis {
    public static void main( String[] args){
        Edificio edificioInfo = new Edificio("Edificio Miguel Gabriel", "Terceira travessa elizeu Bispo");
        Andar andarInfo = new Andar(20,40);
        Apartamento apartamentoInfo = new Apartamento(2,22.5f,4,3,1,2.000f);
        //String[] areas = new String[3]{"Piscina", "Salão", "jogos"};
        // areas[0] = "Piscina";
        AreaComum areaComumInfo = new AreaComum(new String[]{"Piscina","Salao de festas","Sala de jogos","Quadra esportiva","Pista de SK8","Trilha MTB"});
        // AreaComum areaComumInfo = new AreaComum(areas);

        System.out.println("DADOS DO IMOVEL");
        System.out.println("");
        System.out.println("Informacoes sobre o edificio: ");
        System.out.println("Nome do edificio: " + edificioInfo.getNomeEdificio());
        System.out.println("Endereco: " + edificioInfo.getEnderecoEdificio());
        System.out.println("");
        System.out.println("Informacoes sobre o andar: ");
        System.out.println("Numero de andares: " + andarInfo.getNumeroDeAndares());
        System.out.println("Quantidade de apartamentos por andar: " + andarInfo.getQuantidadeDeApartamentosPOrAndar());
        System.out.println(" ");
        System.out.println("Informacoes sobre apartamento: ");
        System.out.println("Vagas de estacionamento disponiveis: " + apartamentoInfo.getVagasDeEstacionamentosDisponiveis());
        System.out.println("Area total do apartamento: " + apartamentoInfo.getAreaTotalDoApartamento() + " Metros Quadrados");
        System.out.println("Quantidade de quartos: " + apartamentoInfo.getQuantidaDeDeQuartos());
        System.out.println("Quantidade de banheiros: " + apartamentoInfo.getQuantidadeDeBanheiros());
        System.out.println("Quantidade de suites: " + apartamentoInfo.getQuantidadeDeSuites());
        System.out.println("valor do apartamento: " + apartamentoInfo.getValorDoApartamento());
        System.out.println("");
        System.out.println("Informacoes sobre areas comuns: ");

        AreaComum.dadosSobreAreasComum();
    }
}

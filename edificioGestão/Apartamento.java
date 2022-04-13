public class Apartamento {
    private Integer vagasDeEstacionamentosDisponiveis;
    private float areaTotalDoApartamento;
    private Integer quantidadeDeQuartos;
    private Integer quantidadeDeBanheiros;
    private Integer quantidadeDeSuites;
    private float valorDoApartamento;

    public Apartamento(Integer vagasDeEstacionamentosDisponiveis,  float areaTotalDoApartamento, Integer quantidadeDeQuartos,Integer quantidadeDeBanheiros, Integer quantidadeDeSuites, float valorDoApartamento ){
        this.setVagasDeEstacionamentosDisponiveis(vagasDeEstacionamentosDisponiveis);
        this.setAreaTotalDoApartamento(areaTotalDoApartamento);
        this.setQuantidaDeDeQuartos(quantidadeDeQuartos);
        this.setQuantidadeDeBanheiros(quantidadeDeBanheiros);
        this.setQuantidadeDeSuites(quantidadeDeSuites);
        this.setValorDoApartamento(valorDoApartamento);
    }

    public Integer getVagasDeEstacionamentosDisponiveis(){
        return this.vagasDeEstacionamentosDisponiveis;
    }
    
    public float getAreaTotalDoApartamento(){
        return this.areaTotalDoApartamento;
    }

    public  Integer getQuantidaDeDeQuartos(){
        return this.quantidadeDeQuartos;
    }

    public Integer getQuantidadeDeBanheiros(){
        return this.quantidadeDeBanheiros;
    }

    public Integer getQuantidadeDeSuites(){
        return this.quantidadeDeSuites;
    }

    public float getValorDoApartamento(){
        return this.valorDoApartamento;
    }

    public void setVagasDeEstacionamentosDisponiveis( Integer vagasDeEstacionamentosDisponiveis ){
        if(vagasDeEstacionamentosDisponiveis < 0){
            return;
        }
        this.vagasDeEstacionamentosDisponiveis = vagasDeEstacionamentosDisponiveis;
    }

    public void setAreaTotalDoApartamento( Float areaTotalDoApartamento ){
        if(areaTotalDoApartamento <0 ){
            return;
        }
        this.areaTotalDoApartamento = areaTotalDoApartamento;
    }

    public void setQuantidaDeDeQuartos( Integer quantidadeDeQuartos ){
        if(quantidadeDeQuartos <0 ){
            return;
        }
        this.quantidadeDeQuartos = quantidadeDeQuartos;
    }

    public void setQuantidadeDeBanheiros( Integer quantidadeDeBanheiros ){
        if(quantidadeDeBanheiros <0 ){
            return;
        }
        this.quantidadeDeBanheiros = quantidadeDeBanheiros;
    }

    public void setQuantidadeDeSuites( Integer quantidadeDeSuites ){
        if(quantidadeDeSuites <0 ){
            return;
        }
        this.quantidadeDeSuites = quantidadeDeSuites;
    }

    public void setValorDoApartamento( float valorDoApartamento ){
        if( valorDoApartamento <0.0f ){
            return;
        }
        this.valorDoApartamento = valorDoApartamento;
    }
}

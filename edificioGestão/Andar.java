public class Andar {
   private Integer numeroDeAndares;
   private Integer quantidadeDeApartamentosPorAndar;
   
    public Andar(Integer numeroDeAndares, Integer quantidadeDeApartamentosPorAndar){
        this.setNumeroDeAndares(numeroDeAndares);
        this.setQuantidadeDeApartamentosPorAndar(quantidadeDeApartamentosPorAndar);
    }

    public Integer getNumeroDeAndares(){
        return this.numeroDeAndares;
    }

    public Integer getQuantidadeDeApartamentosPOrAndar(){
        return this.quantidadeDeApartamentosPorAndar;
    }

    public void setNumeroDeAndares(Integer numeroDeAndares){
        if(numeroDeAndares <0){
            return;
        }
        this.numeroDeAndares = numeroDeAndares;
    }

    public void setQuantidadeDeApartamentosPorAndar(Integer quantidadeDeApartamentosPorAndar){
        if(quantidadeDeApartamentosPorAndar <0){
            return;
        }
        this.quantidadeDeApartamentosPorAndar = quantidadeDeApartamentosPorAndar;
    }

}

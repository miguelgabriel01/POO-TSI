public class VeiculosDePasseio extends Veiculos{
    private Integer quantidadeDePortas;
    private boolean arcondicionado;

    public VeiculosDePasseio(String fabricante, String modelo, String placa, Integer ano, String chassis, Integer quantidadeDePortas, boolean arcondicionado){
        super(fabricante,modelo,placa,ano,chassis);
        this.setQuantidadeDePortas(quantidadeDePortas);
        this.setArcondicionado(arcondicionado);
    }

    //criamos os metodos get
    public Integer getQuantidadeDePortas(){
        return this.quantidadeDePortas;
    }

    public boolean getArcondicionado(){
        return this.arcondicionado;
    }

    //criamos os metodos set
    public void setQuantidadeDePortas(Integer quantidadeDePortas){
        if(quantidadeDePortas <= 0){
            return;
        }
        this.quantidadeDePortas = quantidadeDePortas;
    }

    public void setArcondicionado(boolean arcondicionado){
        if(!arcondicionado){
            return;
        }
        this.arcondicionado = arcondicionado;
    }

    public static VeiculosDePasseio listarVeiculosDePasseio(){
        VeiculosDePasseio veiculosDePasseioInfo = new VeiculosDePasseio("FERRARI","BR-1999","MGL1999",1999,"GAB26011999",2,false);

        return veiculosDePasseioInfo;
    }
}

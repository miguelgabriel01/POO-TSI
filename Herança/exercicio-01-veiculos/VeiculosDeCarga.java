public class VeiculosDeCarga extends Veiculos{
    private Float capacidadeDeCarga;

    public VeiculosDeCarga(String fabricante, String modelo, String placa, Integer ano, String chassis,Float capacidadeDeCarga){
        super(fabricante,modelo,placa,ano,chassis);
        this.setCapacidadeDeCarga(capacidadeDeCarga);
    }

    //criamos o metodo get
    public Float getCapacidadeDeCarga(){
        return this.capacidadeDeCarga;
    }

    //criamos o metodo set
    public void setCapacidadeDeCarga(Float capacidadeDeCarga){
        if(capacidadeDeCarga <= 0.0f){
            return;
        }
        this.capacidadeDeCarga = capacidadeDeCarga;
    }

    //instanciamos a class
    public static VeiculosDeCarga listarVeiculosDeCarga(){
        VeiculosDeCarga veiculosDeCargaInfo = new VeiculosDeCarga("BMW", "BMW-2022-eco", "MGBL2022", 2023, "MGBLtsi26011999", 1000.00F);

        return veiculosDeCargaInfo;
    }
}

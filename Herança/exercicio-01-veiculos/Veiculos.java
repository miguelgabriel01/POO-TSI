public class Veiculos {
    private String fabricante;
    private String modelo;
    private String placa;
    private Integer ano;
    private String chassis;

    //criamos o construtor da aplicação
    public Veiculos(String fabricante, String modelo, String placa, Integer ano, String chassis){
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setPlaca(placa);
        this.setAno(ano);
        this.setChassis(chassis);
    }

    //criamos os metodos get
    public String getFabricante(){
        return this.fabricante;
    }

    public String getModelo(){
        return this.modelo;
    }

    public String getPlaca(){
        return this.placa;
    }

    public Integer getAno(){
        return this.ano;
    }

    public String getChassis(){
        return this.chassis;
    }

    //criamos os metodos set
    public void setFabricante(String fabricante){
        if(fabricante == null || fabricante.length() == 0){
            return;
        }
        this.fabricante = fabricante;
    }

    public void setModelo(String modelo){
        if(modelo == null || modelo.length() == 0){
            return;
        }
        this.modelo = modelo;
    }

    public void setPlaca(String placa){
        if(placa == null || placa.length() == 0){
            return;
        }
        this.placa = placa;
    }

    public void setAno(Integer ano){
        if(ano <= 0){
            return;
        }
        this.ano = ano;
    }

    public void setChassis(String chassis){
        if(chassis == null || chassis.length() == 0){
            return;
        }
        this.chassis = chassis;
    }
}

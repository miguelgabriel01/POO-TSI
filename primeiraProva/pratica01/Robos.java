public class Robos {
    private String modelo;
    private String fabricante;
    private String armaPadrao;

    // criamos o construtor
    public Robos(String modelo, String fabricante, String armaPadrao) {
        this.setModelo(modelo);
        this.setFabricante(fabricante);
        this.setArmaPadrao(armaPadrao);
    }

    // criamos os metodos get
    public String getModelo() {
        return this.modelo;
    }

    public String getFabricante() {
        return this.fabricante;
    }

    public String getArmaPadrao() {
        return this.armaPadrao;
    }

    // criamos os metodos set
    public void setModelo(String modelo) {
        if (modelo == null || modelo.length() == 0) {
            return;
        }
        this.modelo = modelo;
    }

    public void setFabricante(String fabricante) {
        if (fabricante == null || fabricante.length() == 0) {
            return;
        }
        this.fabricante = fabricante;
    }

    public void setArmaPadrao(String armaPadrao) {
        if (armaPadrao == null || armaPadrao.length() == 0) {
            return;
        }
        this.armaPadrao = armaPadrao;
    }

    public static Robos listarRobo() {
        Robos robosInfo = new Robos("RT259-FALCOM", "New Divide Corporate", "Raio lase");

        return robosInfo;
    }
}

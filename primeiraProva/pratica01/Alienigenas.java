public class Alienigenas {
    private String planetaDeOrigem;
    private String raca;
    private String armaPadrao;

    // criamos o construtor
    public Alienigenas(String planetaDeOrigem, String raca, String armaPadrao) {
        this.setPlanetaDeOrigem(planetaDeOrigem);
        this.setRaca(raca);
        this.setArmaPadrao(armaPadrao);
    }

    // criamos os metodos get
    public String getPlanetaDeOrigem() {
        return this.planetaDeOrigem;
    }

    public String getRaca() {
        return this.raca;
    }

    public String getArmaPadrao() {
        return this.armaPadrao;
    }

    // criamos os metodos set
    public void setPlanetaDeOrigem(String planetaDeOrigem) {
        if (planetaDeOrigem == null || planetaDeOrigem.length() == 0) {
            return;
        }
        this.planetaDeOrigem = planetaDeOrigem;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.length() == 0) {
            return;
        }
        this.raca = raca;
    }

    public void setArmaPadrao(String armaPadrao) {
        if (armaPadrao == null || armaPadrao.length() == 0) {
            return;
        }
        this.armaPadrao = armaPadrao;
    }

    public static Alienigenas listarAlienigenas() {
        Alienigenas alienigenasInfo = new Alienigenas("Reptlians", "Reptilion", "Canhao");

        return alienigenasInfo;
    }
}

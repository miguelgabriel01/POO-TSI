public class Armas {
    private String tipo;
    private String potencia;
    private String capacidadeDeTiros;

    // criamos o construtor
    public Armas(String tipo, String potencia, String capacidadeDeTiros) {
        this.setTipo(tipo);
        this.setPotencia(potencia);
        this.setCapacidadeDeTiros(capacidadeDeTiros);
    }

    // criamos os metodos get
    public String getTipo() {
        return this.tipo;
    }

    public String getPotencia() {
        return this.potencia;
    }

    public String getCapacidadeDeTiros() {
        return this.capacidadeDeTiros;
    }

    // criamos os metodos set
    public void setTipo(String tipo) {
        if (tipo == null || tipo.length() == 0) {
            return;
        }
        this.tipo = tipo;
    }

    public void setPotencia(String potencia) {
        if (potencia == null || potencia.length() == 0) {
            return;
        }
        this.potencia = potencia;
    }

    public void setCapacidadeDeTiros(String capacidadeDeTiros) {
        if (capacidadeDeTiros == null || capacidadeDeTiros.length() == 0) {
            return;
        }
        this.capacidadeDeTiros = capacidadeDeTiros;
    }

    // metodo para criar as armas
    public static Armas[] listaDeArmas() {
        Armas armaMetralhadora = new Armas("Metralhadora", "70% de dano", "45 tiros");
        Armas armaCanhao = new Armas("Canhão", "34% de dano", "55 tiros");
        Armas armaLase = new Armas("laser", "45% de dano", "120 segundos");

        Armas[] armasInfo = new Armas[3];

        armasInfo[0] = armaMetralhadora;
        armasInfo[1] = armaCanhao;
        armasInfo[2] = armaLase;

        return armasInfo;
    }

}

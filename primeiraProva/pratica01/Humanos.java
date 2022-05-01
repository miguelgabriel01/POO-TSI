public class Humanos {
    private String nacionalidade;
    private String corDaPele;
    private String genero;
    private String armaPadrao;

    // criamos o construtor
    public Humanos(String nacionalidade, String corDaPele, String genero, String armaPadrao) {
        this.setNacionalidade(nacionalidade);
        this.setCorDaPele(corDaPele);
        this.setGenero(genero);
        this.setArmaPadrao(armaPadrao);
    }

    // criamos os metodos get
    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public String getCorDaPele() {
        return this.corDaPele;
    }

    public String getGenero() {
        return this.genero;
    }

    public String getArmaPadrao() {
        return this.armaPadrao;
    }

    // criamos os metodos set
    public void setNacionalidade(String nacionalidade) {
        if (nacionalidade == null || nacionalidade.length() == 0) {
            return;
        }
        this.nacionalidade = nacionalidade;
    }

    public void setCorDaPele(String corDaPele) {
        if (corDaPele == null || corDaPele.length() == 0) {
            return;
        }
        this.corDaPele = corDaPele;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.length() == 0) {
            return;
        }
        this.genero = genero;
    }

    public void setArmaPadrao(String armaPadrao) {
        if (armaPadrao == null || armaPadrao.length() == 0) {
            return;
        }
        this.armaPadrao = armaPadrao;
    }

    public static Humanos listarHumano() {
        Humanos humanosInfo = new Humanos("Brasileiro", "Pardo", "Masculino", "Metralhadora");

        return humanosInfo;
    }
}

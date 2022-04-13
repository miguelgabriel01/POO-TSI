public class Edificio {
    private String nomeEdificio;
    private String enderecoEdificio;

    public Edificio(String nomeEdificio, String enderecoEdificio){
        this.setNomeEdificio(nomeEdificio);
        this.setEnderecoEdificio(enderecoEdificio);
    }

    public String getNomeEdificio() {
        return this.nomeEdificio;
    }

    public String getEnderecoEdificio() {
        return this.enderecoEdificio;
    }

    public void setNomeEdificio(String nomeEdificio) {
        if (nomeEdificio == null || nomeEdificio.length() == 0) {
            return;
        }
        this.nomeEdificio = nomeEdificio;
    }

    public void setEnderecoEdificio(String enderecoEdificio) {
        if (enderecoEdificio == null || enderecoEdificio.length() == 0) {
            return;
        }
        this.enderecoEdificio = enderecoEdificio;
    }
}

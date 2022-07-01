public class Veiculos {
    protected String[] fabricante;
    protected String[] modelo;
    protected Integer[] ano;
    protected Float[] valor;

    public Veiculos(String[] fabricante, String[] modelo, Integer[] ano, Float[] valor){
        this.setFabricante(fabricante);
        this.setModelo(modelo);
        this.setAno(ano);
        this.setValor(valor);
    }

    public static Veiculos veiculosInfo(){
        Veiculos veiculosdados = new Veiculos(new String[]{"BMX","GOL","FERRARI"},new String[]{"202DG","HJU774","BR44574"}, new String[]{2022,2011,2023}, new String[]{222.666f,888.66f,454.66f});
        return veiculosdados;
    }
}

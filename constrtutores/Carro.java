public class Carro {
    private String marca;
    private float valor;

    //modo recomendavel
    private Carro(String marca, float valor){
        this.setMarca(marca);
        this.setValor(valor);
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        if (marca == null || marca.length() == 0) {
            return;
        }
        this.marca = marca;
    }

    public float getValor() {
        return this.valor;
    }

    public void setValor(float valor) {
        if (valor < 0.0f) {
            return;
        }
        this.valor = valor;
    }

    public void MudarMarca(String novaMarca){
        this.marca = novaMarca;
    }

    public static void main(String[] args) {

        Carro carroUm = new Carro("BMW",222.8f);

       /*  // modo fazendo a instancia de forma normal
        Carro carroUm = new Carro();
        carroUm.setMarca("BMW");
        carroUm.setValor(222.6f);*/

        System.out.println("marca: ");
        System.out.println(carroUm.getMarca());
        System.out.println("       ");
        System.out.println("valor do veiculo");
        System.out.println(carroUm.getValor()); 

        System.out.println(" ");
        System.out.println("----------------");
        carroUm.MudarMarca("Fearrari");
        System.out.println("nova marca do veiculo");
        System.out.println(carroUm.getMarca());
    }
}

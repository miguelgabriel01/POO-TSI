public class Filme {
    private String nome;
    private Integer ano;

    private Filme(String nome, Integer ano){
        this.setNome(nome);
        this.setAno(ano);
    }

    public String getNome(){
        return this.nome;
    }

    public Integer getAno(){
        return this.ano;
    }

    public void setNome(String nome){
        if(nome == null || nome.length() == 0){
            return;
        }

        this.nome = nome;
    }

    public void setAno(Integer ano){
        if(ano <= 0){
            return;
        }

        this.ano = ano;
    }

    public static void main(String[] args){

        Filme filmeUm = new Filme("Batman vs Superman",2016);

        System.out.println("---------------");
        System.out.println("Nome do Filme: " + filmeUm.getNome());
        System.out.println("Ano de lançamento: " + filmeUm.getAno());
        System.out.println("---------------");
    }
}

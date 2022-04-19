public class Musica {
    private String nome;
    private float duracao;
    private Integer ano;

    private Musica(String nome, float duracao, Integer ano){
        this.setNome(nome);
        this.setDuracao(duracao);
        this.setAno(ano);
    }

    public String getNome(){
        return this.nome;
    }

    public float getDuracao(){
        return this.duracao;
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

    public void setDuracao(float duracao){
        if(duracao <= 0.0f){
            return;
        }

        this.duracao = duracao;
    }

    public void setAno(Integer ano){
        if( ano <= 0){
            return;
        }
        this.ano = ano;
    }

    public static void main(String[] args){
        Musica musicaUm = new Musica("Chop suey",22.4f,2004);

        System.out.println("---------------------");
        System.out.println("Nome da Musica: " + musicaUm.getNome());
        System.out.println("Duração da Musica: " + musicaUm.getDuracao());
        System.out.println("Ano de lançamento: " + musicaUm.getAno());
        System.out.println("---------------------");
    }
}

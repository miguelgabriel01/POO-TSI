public class Cursos {
    protected String nomeDoCurso;
    protected Float mensalidade;

    //criamos o construtor da classe
    public Cursos(String nomeDoCurso, Float mensalidade){
        this.setNomeDoCurso(nomeDoCurso);
        this.setMensalidade(mensalidade);
    }

    //criamos os metodos get
    public String getNomeDoCurso(){
        return this.nomeDoCurso;
    }

    public Float getMensalidade(){
        return this.mensalidade;
    }

    //criamos os metodos set
    public void setNomeDoCurso(String nomeDoCurso){
        if(nomeDoCurso ==  null || nomeDoCurso.length() == 0){
            return;
        }
        this.nomeDoCurso = nomeDoCurso;
    }

    public void setMensalidade(Float mensalidade){
        if(mensalidade <= 0){
            return;
        }
        this.mensalidade = mensalidade;
    }

    //instanciamos a class
    //refrente ao curso de TSI
    public static Cursos listarCursoTsi(){
        Cursos tsi = new Cursos("TSI", 456.77f);

        return tsi;
    }

    //referente ao curso de IPI
    public static Cursos listarCursoIpi(){
        Cursos ipi = new Cursos("IPI", 276.77f);

        return ipi;
    }

    //referente ao curso de LOGISTICA
    public static Cursos listarCursoLogistica(){
        Cursos logistica = new Cursos("LOGISTICA", 196.77f);

        return logistica;
    }
}

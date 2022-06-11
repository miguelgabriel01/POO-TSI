public class Alunos extends DadosPessoaisBasicos{
    protected static Integer descontoMensalidadePorcentagem;
    protected static boolean bolsista;
    protected static String cursoAtual;

    //criamos o construtor da classe
    public Alunos(String nomeCompleto, String dataDeNascimento, String endereco, Integer rg, String cpf, String email, Integer descontoMensalidadePorcentagem, boolean bolsista, String cursoAtual){
        super(nomeCompleto,dataDeNascimento,endereco,rg,cpf,email);
        this.setDescontoMensalidadePorcentagem(descontoMensalidadePorcentagem);
        this.setBolsista(bolsista);
        this.setCursoAtual(cursoAtual);
    }

    //criamos os metodos get
    public Integer getDescontoMensalidadePorcentagem(){
        return this.descontoMensalidadePorcentagem;
    }

    public boolean getBolsista(){
        return this.bolsista;
    }

    public String getCursoAtual(){
        return this.cursoAtual;
    }

    //criamos os metodos set
    public void setDescontoMensalidadePorcentagem(Integer descontoMensalidadePorcentagem){
        this.descontoMensalidadePorcentagem = descontoMensalidadePorcentagem;
    }

    public void setBolsista(boolean bolsista){
        this.bolsista = bolsista;
    }

    public void setCursoAtual(String cursoAtual){
        if(cursoAtual == null || cursoAtual.length() == 0){
            return;
        }
        this.cursoAtual = cursoAtual;
    }

    public static Alunos listarAlunos(){
        Alunos alunos = new Alunos("Miguel Gabriel B. Dos Santos", "26-01-1999", "Terceira Travessa Elizeu Bispo", 9227331, "13435829460", "gabrielogabriel10@gmail.com", 30, false,"TSI");

        return alunos;
    }

    //Buscamos os construtores da Class cursos
    static Cursos cursosInfoTsi = Cursos.listarCursoTsi();
    Cursos cursosInfoLogistica = Cursos.listarCursoLogistica();
    Cursos cursosInfoIpi = Cursos.listarCursoIpi();

    public static void verificarDescontoMatricula(){
        if(cursoAtual == "TSI"){
            Float valorMatriculaComDesconto = (descontoMensalidadePorcentagem *  cursosInfoTsi.getMensalidade())/100;  
            
            if(bolsista == false){
                System.out.println("Valor mensal do curso: " + "R$" + valorMatriculaComDesconto);  
            }else{
                System.out.println("Valor mensal do curso: Aluno Bolsista");  
            }

        }else if(cursoAtual == "IPI"){
            Float valorMatriculaComDesconto = (descontoMensalidadePorcentagem *  cursosInfoTsi.getMensalidade())/100;  
            
            if(bolsista == false){
                System.out.println("Valor mensal do curso: " + "R$" + valorMatriculaComDesconto);  
            }else{
                System.out.println("Valor mensal do curso: Aluno Bolsista");  
            }
        }else if(cursoAtual == "LOGISTICA"){
            Float valorMatriculaComDesconto = (descontoMensalidadePorcentagem *  cursosInfoTsi.getMensalidade())/100;  
            
            if(bolsista == false){
                System.out.println("Valor mensal do curso: " + "R$" + valorMatriculaComDesconto);  
            }else{
                System.out.println("Valor mensal do curso: Aluno Bolsista");  
            }
        }else{
            System.out.println("Curso nao encontrado.");
        }
    }
}

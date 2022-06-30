public class Funcionarios extends DadosPessoaisBasicos{
    protected String matriculaFuncional;

    //criamos o construtor da class
    public Funcionarios(String nomeCompleto, String cpf, String endereco, String telefoneDeContato, String email, String matriculaFuncional){
        super(nomeCompleto,cpf,endereco,telefoneDeContato,email);
        this.setMatriculaFuncional(matriculaFuncional);
    }

    //instanciamos a class
    public static Funcionarios dadosFuncionarios(){
        Funcionarios funcionarioDadosBasicos = new Funcionarios("paulo jose da silva", "44455588827", "Rua sem saida", "81554785854", "meajuda@poo.com.br", "jpds4457");
        return funcionarioDadosBasicos;
    }

    //criamos os metodos get
    public String getMatriculaFuncional(){
        return this.matriculaFuncional;
    }

    //criamos os metodos set
    public void setMatriculaFuncional(String matriculaFuncional){
        if(matriculaFuncional == null || matriculaFuncional.length() == 0){
            return;
        }
        this.matriculaFuncional = matriculaFuncional;
    }
}

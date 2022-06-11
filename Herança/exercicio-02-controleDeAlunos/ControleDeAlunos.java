public class ControleDeAlunos {
    public static void main(String[] args){
        Alunos alunosInfo = Alunos.listarAlunos();
        System.out.println("GESTÃO ACADEMICA");
        System.out.println(" ");
        System.out.println("DADOS SOBRE OS ALUNOS");
        System.out.println("Nome completo: " + alunosInfo.getNomeCompleto());
        System.out.println("Data de nascimento: " + alunosInfo.getDataDeNascimento());
        System.out.println("Endereco: " + alunosInfo.getEndereco());
        System.out.println("RG: " + alunosInfo.getRg());
        System.out.println("CPF: " + alunosInfo.getCpf());
        System.out.println("Email: " + alunosInfo.getEmail());
        System.out.println(" ");
        System.out.println("INFORMACOES SOBRE MATRICULA");
        System.out.println(" ");
        System.out.println("Curso Atual: " + alunosInfo.getCursoAtual());

        Alunos.verificarDescontoMatricula();


    }
}

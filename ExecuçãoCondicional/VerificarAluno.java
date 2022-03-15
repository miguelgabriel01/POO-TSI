public class VerificarAluno{

    //Classificar o valor da media de um alino como aprovado > 6. reprovado <4 e recuperação caso contrario
    public static void main(String[] args){
        float unidadeUm = 7.6f;
        float unidadeDois = 6.3f;

        float media = (unidadeDois+unidadeUm)/2;
        
        if(media >=6.0){
            System.out.println(media + " Aluno Aprovado!!!");
        }else if(media < 4.0){
            System.out.println(media + " Aluno Reprovado.");
        }else{
            System.out.println(media + " Aluno em Recuperação...");
        }
    }
}
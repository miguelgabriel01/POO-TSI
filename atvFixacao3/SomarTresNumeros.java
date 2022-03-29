public class SomarTresNumeros {
    
    //Exercicio - execução condicional
    //slide pag 11, exercicio 6

    public static void main(String[] args){
        int numeroA = 10;
        int numeroB = 77;
        int numeroC = 15;

        int soma = numeroA + numeroB + numeroC;

        if(soma > 100){
            System.out.println("Valor da soma: " + soma);
            System.out.println("Maior que 100..");
        }else{
            System.out.println("Valor da soma: " + soma);
            System.out.println("Menor que 100.."); 
        }

    }
}

public class OrdemCrescente{

    //Comparar dois valores e imprimeir em ordem crescente
    public static void main(String[] args){
        int valorA = 10;
        int valorB = 10;

        if(valorA > valorB){
            System.out.println(valorA + "," + valorB);
        }else if(valorA < valorB){
            System.out.println(valorB + "," + valorA);
        }else{
            System.out.println("Numeros são iguais..");
        }
    }
}
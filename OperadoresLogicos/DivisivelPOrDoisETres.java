public class DivisivelPOrDoisETres{

    //Identificar se um numero é divisivel por 2 e 3 ao mesmo tempo
    public static void main(String[] args){
        int numero = 6;

        if(numero %2==0 && numero %3==0){
            System.out.println("Os dois Numeros são divisiveis por 2 e 3");
        }else{
            System.out.print("Os numeros não são divisiveis por 2 e 3 ao mesmo tempo..");
        }
    }
}
public class ImprimirOsDezPrimeirosNumerosImpares {

    // Exercicio - laços
    // slide pag 13, exercicio 16

    public static void main(String[] args){
        for(int contador = 0; contador < 20; contador = contador + 1){
            if(contador %2 != 0){
                System.out.println("... " + contador);
            }
        }
    }
}

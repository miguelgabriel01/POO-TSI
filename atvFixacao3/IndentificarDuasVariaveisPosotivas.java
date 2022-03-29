public class IndentificarDuasVariaveisPosotivas {

    // Exercicio - operadores logicos
    // slide pag 12, exercicio 16

    public static void main(String[] args) {
        int numeroA = -10;
        int numeroB = -20;

        if (numeroA >= 0 && numeroB >= 0) {
            System.out.println("Os dois numeros sao positivos: " + numeroA + " e " + numeroB);
        } else if (numeroA <= 0 && numeroB >= 0) {
            System.out.println("Apenas o numero: " + numeroB + " é positivo.");
        } else if (numeroA >= 0 && numeroB <= 0) {
            System.out.println("Apenas o numero: " + numeroA + " é positivo.");
        } else {
            System.out.println("Os dois numeros sao negativos: " + numeroA + " e " + numeroB);
        }
    }
}

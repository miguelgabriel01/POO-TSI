public class SomarTodosOsElementosDeUmArray {
    public static void main(String[] args){
        int[] array = {1,2,3};
        int total = 0;

        for(int i : array){
            total +=i;
        }
        System.out.println("Valor da soma: ");
        System.out.println(total);


    }
}

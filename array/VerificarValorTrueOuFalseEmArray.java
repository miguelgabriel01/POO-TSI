public class VerificarValorTrueOuFalseEmArray {
    public static void main(String[] args){
        int[] array = {-1,-2,-3};
        int total = 0;

        for(int i : array){
            total +=i;
        }

        if(total >= 0){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }    
}

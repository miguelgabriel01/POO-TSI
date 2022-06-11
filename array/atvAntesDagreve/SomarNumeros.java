import java.util.Arrays;

public class SomarNumeros {
   protected Integer[] numeros;
   
   //criamos o construtor da class
   public SomarNumeros(Integer[] numeros){
       this.setNumeros(numeros);
   }

   //criamos o metodo get
   public Integer[] getNumeros(){
       return this.numeros;
   }

   //criamos o metodo set
   public void setNumeros(Integer[] numeros){
       if( numeros.length < 0){
           return;
       }
       this.numeros = numeros;
   }

   public static void main(String[] args) throws ExcecaoAcimaDeCem{

    SomarNumeros somarNumerosArray = new SomarNumeros(new Integer[]{1,2,3,4,5,6,7,8,9,10,20,30,40});
    Integer[] valorDoArray = somarNumerosArray.getNumeros();
    Integer somar = 0;

    for(int i = 0; i< valorDoArray.length; i++){
        somar = somar + valorDoArray[i];

        if(somar < 100){
            System.out.println("Total de numeros fornecidos para soma: " + i);
            System.out.println("Valor da soma: " + somar); 
            System.out.println("Media dos numeros: " + (somar/valorDoArray.length));

        }if(somar > 100){
            System.out.print("entrou no if");
            throw new ExcecaoAcimaDeCem();
        }
        
    }
   }
}

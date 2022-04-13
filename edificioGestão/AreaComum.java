public class AreaComum {
    private static String[] areaComum;

    public AreaComum( String[] areaComum){
        this.setAreaComum(areaComum);
    }

    public String[] getAreaComum(){
        return this.areaComum;
    }

    public void setAreaComum( String[] areaComum){
        if(areaComum.length < 0){
            return;
        }
        this.areaComum = areaComum;
    }

    public static void dadosSobreAreasComum(){
         for(String i : areaComum){
            System.out.println(i);
        } 
    }
}

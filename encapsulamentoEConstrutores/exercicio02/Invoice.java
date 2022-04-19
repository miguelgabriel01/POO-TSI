public class Invoice {
    //declaramos os atributos
    private String numeroDoItem;
    private String descricaoDoItem;
    private static Integer quantidadeDoItem;
    private static Float precoUnitarioDoItem;

    //criamos o construtor da nossa class( new )
    public Invoice( String numeroDoItem,String descricaoDoItem,Integer quantidadeDoItem,Float precoUnitarioDoItem ){
        this.setNumeroDoItem(numeroDoItem);
        this.setDescricaoDoItem(descricaoDoItem);
        this.setQuantidadeDoItem(quantidadeDoItem);
        this.setPrecoUnitarioDoItem(precoUnitarioDoItem);
    }

    //criamos os metodos get
    public String getNumeroDoItem(){
        return this.numeroDoItem;
    }

    public String getDescricaoDoItem(){
        return this.descricaoDoItem;
    }

    public Integer getQuantidadeDoItem(){
        return this.quantidadeDoItem;
    }

    public Float getPrecoUnitarioDoItem(){
        return this.precoUnitarioDoItem;
    }

    //criamos os metodos set
    public void setNumeroDoItem( String numeroDoItem ){
        if( numeroDoItem == null || numeroDoItem.length() == 0 ){
            return;
        }
        this.numeroDoItem = numeroDoItem;
    }

    public void setDescricaoDoItem( String descricaoDoItem ){
        if( descricaoDoItem == null || descricaoDoItem.length() == 0 ){
            return;
        }
        this.descricaoDoItem = descricaoDoItem;
    }

    public void setQuantidadeDoItem( Integer quantidadeDoItem ){
        if( quantidadeDoItem < 0 ){
            return;
        }
        this.quantidadeDoItem = quantidadeDoItem;
    }

    public void setPrecoUnitarioDoItem( Float precoUnitarioDoItem ){
        if( precoUnitarioDoItem < 0.0f ){
            return;
        }
        this.precoUnitarioDoItem = precoUnitarioDoItem;
    }

    //metodo para calcular fatura
    public static void getInvoiceAmount(){
        float valorFatura = 0;
        
        if( quantidadeDoItem == 0 && precoUnitarioDoItem == 0 ){
            System.out.println("A fatura não apresenya nenhuma venda este mes.");
        }else{
            valorFatura = quantidadeDoItem * precoUnitarioDoItem;
            System.out.println("Valor mensal da fatura: " + "R$" + valorFatura);
        }
    }
}

public class LojaDeInformatica {
    public static void main(String[] args){
        Invoice faturaInfo = new Invoice("2601mgbl","SSD 240GB notebook",3,243.5f);

        System.out.println("DADOS SOBRE FATURA MENSAL");
        System.out.println(" ");
        System.out.println("Numero do item: " + faturaInfo.getNumeroDoItem());
        System.out.println("Descricao: " + faturaInfo.getDescricaoDoItem());
        System.out.println("Quantidade: " + faturaInfo.getQuantidadeDoItem());
        System.out.println("Valor unitario: " + faturaInfo.getPrecoUnitarioDoItem());
        System.out.println("-------------------------");
        System.out.println("RESULTADO DAS VENDAS");

        Invoice.getInvoiceAmount();

        System.out.println("-------------------------");

    }
}

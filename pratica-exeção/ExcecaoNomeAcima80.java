public class ExcecaoNomeAcima80 extends Exception{
    public String getMessage(){
        return "Nome possui mais de 80 caracteres.";
    }
}

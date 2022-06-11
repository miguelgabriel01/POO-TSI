public class Cadastrados extends DadosPessoaisBasicos implements VerificarNome{
    
    //criamos o construtor da classe
    public Cadastrados(String nomeCompleto){
        super(nomeCompleto);
    }

    //instanciamos a class
    public static Cadastrados cadastradosInfo(){
        Cadastrados cadastradosInfo = new Cadastrados("Miguel Israel barbosa 4Dos Santos");
        return cadastradosInfo;
    }

    //usamos o contrato
    public Boolean getVerificarTotalDeCaracteresNoNome(){
        Boolean limiteUltrapassado = false;
        if(nomeCompleto.length() > 100){
            limiteUltrapassado = true;
        }
        return limiteUltrapassado;
    }

    public Boolean getVerificarNumerosNoNome(){
        Boolean numerosNoNome = nomeCompleto.matches("[A-Z a-z Çç]{"+nomeCompleto.length()+"}");
        
        return numerosNoNome;
    }

     public static void main(String[] args) throws ExcecaoNomeAcima80, ExcecaoCaracterIndevidoDigitado{
        Cadastrados classIntance = Cadastrados.cadastradosInfo();

        if(classIntance.getVerificarTotalDeCaracteresNoNome() == true){
            throw new ExcecaoNomeAcima80();
        }

        if(classIntance.getVerificarNumerosNoNome() == false){
            //System.out.println("Não possui numeros");
            throw new ExcecaoCaracterIndevidoDigitado();
        }
        
    }
}

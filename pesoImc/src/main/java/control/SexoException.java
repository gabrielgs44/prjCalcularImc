package control;

public class SexoException extends Exception{
    
    public SexoException(char sexo) {
        
        super("Sexo Inválido " + sexo);
    }
    
}

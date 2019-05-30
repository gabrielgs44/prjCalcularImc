package control;

public class PesoInvalidoException extends Exception{
    
    public PesoInvalidoException(double peso) {
        
        super("O peso não pode ser menor ou igual a 0 - " + peso);
    }
}

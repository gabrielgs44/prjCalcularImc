package control;

public class AlturaInvalidaException extends Exception{

    public AlturaInvalidaException(double altura) {
        super("O peso não pode ser menor ou igual a 0 - " + altura);
    }
}

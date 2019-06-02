package control;

public class IdadeInvalidaException extends Exception{
    
    public IdadeInvalidaException(int idade) {
        super("Idade não pode ser menor ou igual a 0!" + idade);
    }
}

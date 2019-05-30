package control;

public class IdadeInvalidaException extends Exception{
	
	public IdadeInvalidaException(int idade) {
		super("A idade não pode ser menor ou igual a 0!");
	}
}

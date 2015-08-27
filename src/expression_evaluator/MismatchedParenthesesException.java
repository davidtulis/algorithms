package expression_evaluator;

public class MismatchedParenthesesException extends RuntimeException {
	  public MismatchedParenthesesException(String err)
	  {
	    super(err);
	  }
}
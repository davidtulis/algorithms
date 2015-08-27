package expression_evaluator;

/**
 * Tester class for our ExpressionEvaluator
 * @author david tulis
 *
 */

public class ExpressionsTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String expression= " 5 + 4 + 1 $ "; //10
		ExpressionEvaluator eval = new ExpressionEvaluator(expression);
		System.out.println(eval.EvalExp());
	}

}

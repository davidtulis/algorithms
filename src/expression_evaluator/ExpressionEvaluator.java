package expression_evaluator;

/**
 * Used for evaluating expressions
 * @author David Tulis
 */

import java.util.StringTokenizer;


public class ExpressionEvaluator {
	
	String expression;
	StringTokenizer t;
	NodeStack<Integer> valStk;
	NodeStack<String> opsStk;
	
	/**
	 * Default constructor
	 * @param exp
	 */
	public ExpressionEvaluator(String exp) {
		expression=exp;
		
		t = new StringTokenizer(expression, " "); 
		valStk = new NodeStack<Integer>();
		opsStk = new NodeStack<String>();
	}
	
	/**
	 * Evaluates the expression
	 * @return the final value of the exression
	 */
	public int EvalExp() {
		String character = (String) t.nextToken();

		while(t.hasMoreTokens() && !(character.equals("$"))) { 
			if (isNumber(character)) {
				valStk.push(Integer.parseInt(character));
			} else {
				repeatOps(character);
				opsStk.push(character);
			}
			character= (String) t.nextToken();
		}
		repeatOps("$");
		return valStk.top();
		
	}
	
	/**
	 * performs the operation if there are enough values in the value stack and if the operator has precedence
	 * @param s2 the operator
	 */
	private void repeatOps(String s2) {
		while(valStk.size()>1 && prec(s2) <= prec(opsStk.top())) {
			doOp();
		}
	}

	/**
	 * performs the operation and puts the new value in the stack
	 */
	private void doOp() {
		int x=valStk.pop();
		int y=valStk.pop();
		int newVal=0;
		String op = opsStk.pop();
		switch(op) {
		case "+": 
			newVal=y+x;
			break;
		case "-": 
			newVal=y-x;
			break;
		case "*": 
			newVal=y*x;
			break;
		case "/": 
			newVal=y/x;
			break;
		}
		valStk.push(newVal);

	}
	
	/**
	 * method for determining operator precedence
	 * @param s2 the operator
	 * @return the precedence
	 */
	private int prec(String s2) {
		int prec=0;
		switch (s2) {
		case "$": prec=0;
		case "+": prec=1;
		case "-": prec=1;
		case "*": prec=2;
		case "/": prec=2;
		
		}
		return prec;
	}

	/**
	 * helper method for determining if the string is a number
	 * @param t2 the string we want to rest
	 * @return true if it is a number, false if it is not a number
	 */
	private boolean isNumber(String t2) {
		if (t2.equals("0") || t2.equals("1") || t2.equals("2") || t2.equals("3") || t2.equals("4")
				|| t2.equals("5") || t2.equals("6") || t2.equals("7") || t2.equals("8") || t2.equals("9"))
			return true;
		else
			return false;
	}
}

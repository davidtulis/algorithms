package expression_evaluator;

import java.util.StringTokenizer;

public class ParenthesesEvaluator {
	NodeStack<String> parenStk;
	String parenString="";
	
	public ParenthesesEvaluator(String expression) {
		StringTokenizer t=new StringTokenizer(expression, " "); 
		String character=(String) t.nextToken();
		while (t.hasMoreTokens()) {
			if (isParen(character)) {
				parenString+=character;
				parenString+=" ";
			}
			character=t.nextToken();
		}
	}
	
	public boolean parenMatch() {
		StringTokenizer t = new StringTokenizer(parenString, " ");
		String character=t.nextToken();
		
		while(t.hasMoreElements()) {
			if (character.equals("(") || character.equals("[")) {
				parenStk.push(character);
			}
			else {
				if (parenStk.isEmpty())
					return false;
				if (parenStk.pop().equals("(") && character.equals(")")) 
					return true;
				if (parenStk.pop().equals("[") && character.equals("]")) 
					return true;
			}
			character=t.nextToken();
		}
		if (parenStk.isEmpty())
			return false;
		else
			return true;
	}
		

	private boolean isParen(String character) {
		if (character.equals("(") || character.equals(")") || character.equals("[") || character.equals("]"))
			return true;
		else
			return false;	}

}

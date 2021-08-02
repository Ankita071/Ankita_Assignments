package assignment7.Test;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Test {
	public static void main(String[] args) {
		ExpressionParser parser = new SpelExpressionParser();

		Expression expression = parser.parseExpression("'Hello World!!'");
		String message = (String) expression.getValue();
		System.out.println(message);
//OR  
//System.out.println(parser.parseExpression("'Hello SPEL'").getValue());  
	}
}
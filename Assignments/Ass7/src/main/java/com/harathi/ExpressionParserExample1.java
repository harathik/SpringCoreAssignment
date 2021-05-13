package com.harathi;
import java.beans.Expression;

public class ExpressionParserExample1 {
	public static void main(String[] args) {
		ExpressionParser expressionParser = new SpelExpressionParser();

		Expression expression = expressionParser.parseExpression("'Hello SpEL'");
		String strVal = (String) expression.getValue();
		System.out.println("1. Literal expression value:\n" + strVal);

		expression = expressionParser.parseExpression("'Hello SpEL'.concat('!')");
		Object strVal1 = expression.getValue();
		System.out.println("2. Method invocation value:\n" + strVal1);

		expression = expressionParser.parseExpression("16 * 5");
		Object intVal = expression.getValue();
		System.out.println("3. Mathematical operator value:\n" + intVal);

		expression = expressionParser.parseExpression("5 < 9");
		Object boolVal = expression.getValue();
		System.out.println("4. Mathematical operator value:\n" + boolVal);

		expression = expressionParser.parseExpression("400 > 200 && 200 < 500");
		boolVal = expression.getValue();
		System.out.println("5. Logical operator value:\n" + boolVal);

		expression = expressionParser.parseExpression("'some value' != null ? 'some value' : 'default'");
		strVal1 = expression.getValue();
		System.out.println("6. Ternary operator value:\n" + strVal1);

		expression = expressionParser.parseExpression("'some value' ?: 'default'");
		strVal1 = expression.getValue();
		System.out.println("7. Elvis operator value:\n" + strVal1);

		expression = expressionParser.parseExpression("'UPPERCASE STRING' matches '[A-Z\\s]+'");
		boolVal = expression.getValue(Boolean.class);
		System.out.println("8. Regex/matches operator value:\n" + boolVal);
	}
}
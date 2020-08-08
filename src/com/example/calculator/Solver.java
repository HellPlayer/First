package com.example.calculator;

public class Solver {

    public String solve(Expression expression) {
        Calculator calculator = new Calculator();

        if (expression.getOperator().equals("+")) {
            calculator.add(expression);
        }
        if (expression.getOperator().equals("-")) {
            calculator.subtract(expression);
        }
        if (expression.getOperator().equals("*")) {
            calculator.multiply(expression);
        }
        if (expression.getOperator().equals("/")) {
            calculator.divide(expression);
        }
        if (expression.getType().equals(Type.ROMAN)) {
            Converter converter = new Converter();
            String result = converter.arabToRomanConvert(Integer.parseInt(expression.getResult()));
            expression.setResult(result);
        }
        return String.valueOf(expression.getResult());
    }
}

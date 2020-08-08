package com.example.calculator;

public class Calculator {

    public Expression add(Expression expression) {
        expression.setResult(String.valueOf(expression.getFirstNumber() + expression.getSecondNumber()));
        return expression;
    }

    public Expression subtract(Expression expression) {
        expression.setResult(String.valueOf(expression.getFirstNumber() - expression.getSecondNumber()));
        return expression;
    }

    public Expression multiply(Expression expression) {
        expression.setResult(String.valueOf(expression.getFirstNumber() * expression.getSecondNumber()));
        return expression;
    }

    public Expression divide(Expression expression) {
        expression.setResult(String.valueOf(expression.getFirstNumber() / expression.getSecondNumber()));
        return expression;
    }
}

package com.example.calculator;

public class Expression {

    private int firstNumber;
    private int secondNumber;

    private String operator;

    private String result;

    private Type type;

    public Type getType() {
        return type;
    }

    public Expression(int firstNumber, int secondNumber, String operator) {
        this.firstNumber = firstNumber;
        this.secondNumber = secondNumber;
        this.operator = operator;

    }

    public int getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(int firstNumber) {
        this.firstNumber = firstNumber;
    }

    public int getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(int secondNumber) {
        this.secondNumber = secondNumber;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Expression() {
    }

    @Override
    public String toString() {
        return "Expression{" +
                "firstNumber=" + firstNumber +
                ", secondNumber=" + secondNumber +
                ", operator='" + operator + '\'' +
                ", result='" + result + '\'' +
                ", type=" + type +
                '}';
    }
}

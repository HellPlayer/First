package com.example.calculator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StringEvaluator {

    public Expression evaluate(String s) {
        if (s == null) {
            throw new IllegalArgumentException("Argument can't be null");
        }
        List<String> stringList = split(s);
        if (stringList.size() != 3) {
            throw new IllegalArgumentException("Wrong input data");
        }
        Expression expression = new Expression();

        if (isRomanNums(stringList)) {
            Converter converter = new Converter();
            int firstNum = converter.romanToArabConvert(stringList.get(0));
            int secondNum = converter.romanToArabConvert(stringList.get(2));
            if (firstNum > 10 || secondNum > 10) {
                throw new IllegalArgumentException("Invalid roman numbers input");
            }
            expression.setFirstNumber(firstNum);
            expression.setSecondNumber(secondNum);
            expression.setOperator(stringList.get(1));
            expression.setType(Type.ROMAN);
            return expression;
        } else if (isArabNums(stringList)) {
            int firstNum = Integer.parseInt(stringList.get(0));
            int secondNum = Integer.parseInt(stringList.get(2));
            if (firstNum > 10 || secondNum > 10) {
                throw new IllegalArgumentException("Invalid arab numbers input");
            }
            expression.setFirstNumber(firstNum);
            expression.setSecondNumber(secondNum);
            expression.setOperator(stringList.get(1));
            expression.setType(Type.ARAB);
            return expression;
        }
        throw new IllegalArgumentException("Wrong input data");
    }

    private List<String> split(String s) {
        List<String> list = Arrays.asList(s.split("(?<=[-+*/])|(?=[-+*/])"));
        return list.stream().
                map(value -> value.replaceAll("\\s+", ""))
                .collect(Collectors.toList());
    }

    private boolean isArabNums(List<String> list) {
        if (list == null || list.isEmpty()) {
            return false;
        }
        try {
            int num1 = Integer.parseInt(list.get(0));
            int num2 = Integer.parseInt(list.get(2));
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    private boolean isRomanNums(List<String> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Arguments can't be null");
        }
        List<String> romanNums = RomanNum.getReverseSortedValues().stream()
                .map(Enum::toString)
                .collect(Collectors.toList());
        char[] firstNum = list.get(0).toCharArray();
        for (char c : firstNum) {
            if (!romanNums.contains(String.valueOf(c))) {
                return false;
            }
        }
        char[] secondNum = list.get(2).toCharArray();

        for (char c : secondNum) {
            if (!romanNums.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }
}

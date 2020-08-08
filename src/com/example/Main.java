package com.example;

import com.example.calculator.Solver;
import com.example.calculator.StringEvaluator;

public class Main {

    public static void main(String[] args) {
        while (true) {
            StringReader reader = new StringReader();
            StringEvaluator evaluator = new StringEvaluator();
            Solver solver = new Solver();

            System.out.println(solver.solve(evaluator.evaluate(reader.input())));
        }
    }
}

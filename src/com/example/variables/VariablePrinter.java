package com.example.variables;

public class VariablePrinter {

    // instance variable

    int instancevar;

    public static void main(String[] args) {

        VariablePrinter variablePrinter;
        variablePrinter = new VariablePrinter();

        variablePrinter.instancevar = 100;

        System.out.println("the instance varible is:"+variablePrinter.instancevar);
    }
}

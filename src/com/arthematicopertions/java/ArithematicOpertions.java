package com.arthematicopertions.java;

import java.util.Scanner;

public class ArithematicOpertions {


    Scanner scanner = new Scanner(System.in);

    int a = scanner.nextInt();

    double b = scanner.nextDouble();


    public void add() {

        System.out.println("the add value is:" + (a + b));

    }

    public void multiply() {
        System.out.println("the multiply of two value is:" + (a * b));

    }

    public void sub() {
        System.out.println("the sub value is:" + (a - b));

    }

    public void div() {

        System.out.println("the div value:" + (a % b));
    }


    public static void main(String[] args) {


        ArithematicOpertions arithematicOpertions = new ArithematicOpertions();
        arithematicOpertions.add();
        arithematicOpertions.multiply();
        arithematicOpertions.sub();
        arithematicOpertions.div();


    }
}

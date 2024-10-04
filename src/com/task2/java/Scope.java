package com.task2.java;

public class Scope {


    // global variables(instance variables)

    String name;

    //static variable

    static  String department;

    public static void main(String[] args) {
        //local variables

        String institute ="Nri institute of technology";


        System.out.println("the institute name is:"+institute);

        Scope scopeOfVariables;
        scopeOfVariables = new Scope();

        scopeOfVariables.name="vasu";
        Scope.department="Electronics and communication Engineering";



        System.out.println("the name of a student:"+scopeOfVariables.name);
        System.out.println("the department is:"+Scope.department);


    }


}

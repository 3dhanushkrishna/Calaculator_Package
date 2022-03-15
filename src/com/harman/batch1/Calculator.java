package com.harman.batch1;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Addition addobj = new Addition();
        Subtraction subobj = new Subtraction();
        Multiply mulobj = new Multiply();
        Division divobj = new Division();
        Integer x,y,addresult,subresult,mulresult,divresult;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        x = input.nextInt();
        System.out.println("Enter the 2nd number: ");
        y = input.nextInt();
        addresult = addobj.Add2numbers(x,y);
        System.out.println(addresult);
        subresult = subobj.Sub2numbers(x,y);
        System.out.println(subresult);
        mulresult = mulobj.Mul2numbers(x,y);
        System.out.println(mulresult);
        divresult = divobj.Div2numbers(x,y);
        System.out.println(divresult);


    }
}

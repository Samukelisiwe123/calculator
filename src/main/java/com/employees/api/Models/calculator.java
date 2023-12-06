package com.employees.api.Models;

import java.util.Scanner;

public class calculator {

    String k="";

    public calculator(String cancel){
        this.k=cancel;
    }

public void calculate(){
    do {

        double total=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number- ");
        double firstnumber= input.nextInt();

        System.out.print("Enter first number- ");
        String sign= input.nextLine();

        System.out.print("Enter second number- ");
        double secondtnumber= input.nextInt();

        if (sign == "+"){
            total=firstnumber + secondtnumber;
            System.out.print(total);
        }else if (sign == "*"){
            total=firstnumber * secondtnumber;
            System.out.print(total);
        }else if (sign == "-"){
            total=firstnumber - secondtnumber;
            System.out.print(total);
        }else if (sign == "/"){
            total=firstnumber / secondtnumber;
            System.out.print(total);
        }

        total=0;
        firstnumber=0;
        secondtnumber=0;
        sign="";
        System.out.print("Enter any string to continue(or z to cancel) ");
         k= input.nextLine();

    }while (k != "z");
}
}

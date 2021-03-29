package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    byte byteVariable = 127;
    short mediumRangeDecimalVariable = 32767;
    int wholeNumbers = 122;
    long largeDecimalNumbers = -12;
    float numberWithDecimalPlaces = 8.3f ;
    double veryLargeNumberWithDecimalPlaces = 12312312.1232;
    char singleCharacter = '\u0041';
    boolean isTrueorFalse = true;

    System.out.println(byteVariable);
    System.out.println(mediumRangeDecimalVariable);
    System.out.println(wholeNumbers);
    System.out.println(largeDecimalNumbers);
    System.out.println(numberWithDecimalPlaces);
    System.out.println(veryLargeNumberWithDecimalPlaces);
    System.out.println(singleCharacter);
    System.out.println(isTrueorFalse);

    //switch
        int day = 7;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
        //for loops
        String[] colors = {"Red", "Blue", "Green", "Brown"};
        for (String w : colors) {
            System.out.println(w);
        }
        //while
        int r = 0;
        while (r < 20) {
            System.out.println(r);
            r++;
        }
        //do..while
        int h=1;
        do{
            System.out.println(h);
            h++;
        }while(h<=10);

        int a = 17;
        int b = 13;
        int c = a+b;
        int d = a-b;
        int e = a*b;
        int f = a/b;

        System.out.println("Addition result = "+ c);
        System.out.println("Subtraction result = "+ d);
        System.out.println("Multiplication result = "+ e);
        System.out.println("Division result = "+ f);

        //COMPARISON

        System.out.println(a>b);
        System.out.println(a<b);
        System.out.println(a>=b);
        System.out.println(a<=b);
        System.out.println(a==b);
        System.out.println(a!=b);

        // Compound Assignment Operators

        int number = 5;
        number += 3;
        System.out.println(number);
        number -= 3;
        System.out.println(number);
        number *= 3;
        System.out.println(number);
        number /= 3;
        System.out.println(number);
        number %= 7;
        System.out.println(number);

        //INCREMENT AND DECREMENT OPERATORS

        int numberApples = 5;
        numberApples++;

        System.out.println(numberApples);

        int numberOranges = 5;
        numberOranges--;

        System.out.println(numberOranges);

        int incrementOperatorA = 5;
        int incrementOperatorB = 6;

        int incrementOperatorC = incrementOperatorA * incrementOperatorB++;
        System.out.println(incrementOperatorC);

        int incrementOperatorD = incrementOperatorA * --incrementOperatorB;
        System.out.println(incrementOperatorD);

        byte b2 = 127;
        b2 %=7;
        System.out.println(b2);
        byte b3 = 120;
        b3 &=40;
        System.out.println(b3);
        short s1 = 300;
        s1 ^= 100;
        System.out.println(s1);
        byte b4 = 127;
        b4 >>=3;
        System.out.println(b4);

        byte number1 = 5;
        //  Widening Casting
        //      byte -> short -> char -> int -> long -> float -> double

        short myShort = 9;
        double myDouble = myShort;

        System.out.println(myShort);
        System.out.println(myDouble);

        //  Narrowing Casting

        double mySecondDouble = 9.78;
        short mySecondShort = (short) mySecondDouble;

        System.out.println(mySecondDouble);
        System.out.println(mySecondShort);




        //Scanner input = new Scanner( System.in );
        //System.out.print("Enter a decimal number : ");
        //int num =input.nextInt();

        //String str = Integer.toHexString(num);
        //System.out.println("Decimal to Hexadecimal: "+str);
    }
}

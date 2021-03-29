package com.company;

public class Main {

    public static void main(String[] args) {

    byte byteVariable = 127;
    short mediumRangeDecimalVariable = 32767;
    int wholeNumbers = 122;
    long largeDecimalNumbers = -12;
    float numberWithDecimalPlaces = 8.3f ;
    double verylargeNumberWithDecimalPlaces = 12312312.1232;
    char singleCharacter = '\u0041';
    boolean isTrueorFalse = true;

    System.out.println(byteVariable);
    System.out.println(mediumRangeDecimalVariable);
    System.out.println(wholeNumbers);
    System.out.println(largeDecimalNumbers);
    System.out.println(numberWithDecimalPlaces);
    System.out.println(verylargeNumberWithDecimalPlaces);
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

        //getters::setters

    }
}

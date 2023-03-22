package org.example.homework_nr_2;

public class HomeWork2 {

    public static void main(String[] args) {

        int month = 10;

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
        }
        for(int index = 100; index <= 1000; index++){
           if( index % 5 == 0 )
            System.out.println(index);
            }

        float total = 0;

        for(float nr1 = 1, nr2 = 3; nr1 <= 97 && nr2 <=99;nr1 += 2, nr2 += 2 ){
            /* Решение с одной переменной
            total += nr1 / (2 + nr1);
            */
            total += nr1 / nr2;
        }
        System.out.println(total);

        for(int a = 1; a <= 9; a++) {
            if(a==1) {
                System.out.println("*");
                continue;
            }
            System.out.print("*");
            for (int b = 1; b < a; b++) {
                if (a - b == 1)
                    System.out.println("*");
                else
                    System.out.print("*");
            }
        }
    }

}

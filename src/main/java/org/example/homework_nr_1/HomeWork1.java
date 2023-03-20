package org.example.homework_nr_1;

import org.omg.CORBA.WStringSeqHelper;

public class HomeWork1 {

    public static void main(String[] args) {

        System.out.println("Hello World!");
        // Current World Population
        long CWP = 7811080815L;
        //Cars Produced This Year
        int CP = 55235358;
        //First Letter In Alphabet
        char FL = 'A';
        //Java Is Amazing - bool
        boolean JIS = true;
        // Pi
        float PI = - 3.14159F;

        System.out.println(CWP);
        System.out.println(CP);
        System.out.println(FL);
        System.out.println(JIS);
        System.out.println(PI);

        double price = 12.5;
        double tax = 21.5;
        int quantity = 10;
        double sum = 0;

        System.out.println(price);
        System.out.println(tax);
        System.out.println(quantity);
        System.out.println(sum);

        double total = price + tax * quantity + sum;

        System.out.println(total);

    }
}

package org.example.homework_nr_6;

public class Main {

    public static void main(String[] args) {

        Invoice product1 = new Invoice("PC", "model i5", 1, 25000.75);
        Invoice product2 = new Invoice("Notebook", "Dell", 3, -20);
        Invoice product3 = new Invoice("Phone", "LG", 20, 120.5);

        System.out.println("For product " + product1.getModel() + " the amount : " + product1.getAmount());
        System.out.println("For product " + product2.getModel() + " the amount : " + product2.getAmount());
        System.out.println("For product " + product3.getModel() + " the amount : " + product3.getAmount());

        Date date1 = new Date(5,10,2000);
        Date date2 = new Date(20,5,2023);

        Date[] arraydate = new Date[]{date1,date2};

        for(int index = 0; index != arraydate.length; index++){
            arraydate[index].displayDate();
        }
    }

}

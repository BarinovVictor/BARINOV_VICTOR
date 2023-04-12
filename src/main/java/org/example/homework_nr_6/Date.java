package org.example.homework_nr_6;

public class Date {
    int date;
    int month;
    int year;

    public void setDate(int date) {
        if (date < 1 || date > 31) {
            System.out.println("Неверное значение даты!");
        } else
            this.date = date;
    }

    public void setMonth(int month) {
        if (month < 1 || month > 12) {
             System.out.println("Неверное значение месяца!");
        } else
             this.month = month;
     }

    public void setYear(int year) {
       if (year < 0) {
             System.out.println("Неверное значение года!");
       } else
             this.year = year;
    }

    public Date(int date, int month, int year) {
        setDate(date);
        setMonth(month);
        setYear(year);
    }

    public void displayDate(){
        System.out.println(date + "/" + month + "/" + year);
    }
}

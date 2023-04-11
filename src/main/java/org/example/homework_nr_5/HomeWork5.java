package org.example.homework_nr_5;

enum MonthOfTheYear{
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

enum Weekday{
    MONDAY,
    TUSDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

    public boolean isWeekDay(){
        return this != Weekday.SATURDAY || this != Weekday.SUNDAY;
    }

    public boolean isHoliday(){
        return this == Weekday.SATURDAY || this == Weekday.SUNDAY;
    }
}

public class HomeWork5 {

    public static void main(String[] args){
        MonthOfTheYear[] MonthArray = MonthOfTheYear.values();

        for(int index = 0; index != MonthArray.length; index++){
            System.out.println(MonthArray[index]);
        }

        System.out.println(Weekday.MONDAY.isWeekDay());
    }

    boolean valueBoolean = Boolean.parseBoolean("true");
    byte valueByte = Byte.parseByte("120");
    short valueShort = Short.parseShort("32000");
    int valueInteger = Integer.parseInt("147895632");
    long valueLong = Long.parseLong("987654321987654321");
    double valueDouble = Double.parseDouble("4444.5d");
    float valueFloat = Float.parseFloat("2354.56f");

}


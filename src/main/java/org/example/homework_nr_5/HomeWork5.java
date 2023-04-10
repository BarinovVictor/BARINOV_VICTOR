package org.example.homework_nr_5;

enum MonthOfTheYear{
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}

enum Weekday{
    Monday,
    Tuesday,
    Wednesday,
    Thursday,
    Friday,
    Saturday,
    Sunday;

    public boolean isWeekDay(){
      if (this != Weekday.Saturday || this != Weekday.Sunday){
          return true;
      }
      else
      {
          return false;
      }
    }

    public boolean isHoliday(){
        if (this == Weekday.Saturday || this == Weekday.Sunday){
            return true;
        }
        else
        {
            return false;
        }
    }
}

public class HomeWork5 {

    public static void main(String[] args){
        MonthOfTheYear[] MonthArray = MonthOfTheYear.values();

        for(int index = 0; index != MonthArray.length; index++){
            System.out.println(MonthArray[index]);
        }

        System.out.println(Weekday.Monday.isWeekDay());
    }

    boolean valueBolean = Boolean.parseBoolean("true");
    byte valueByte = Byte.parseByte("120");
    short valueShort = Short.parseShort("32000");
    int valueInteger = Integer.parseInt("147895632");
    long valueLong = Long.parseLong("987654321987654321");
    double valueDouble = Double.parseDouble("4444.5d");
    float valueFloat = Float.parseFloat("2354.56f");

}


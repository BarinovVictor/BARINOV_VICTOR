package org.example.homework_nr_4;

public class HomeWork4 {

    public static void main(String[] args){

        //Объявите массив типа int . Выделите память для этого массива и инициализируйте
        // его различными числовыми значениями. Вывести элементы массива на консоль

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[2] = 3;
        numbers[1] = 2;

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        //Объявите еще один массив типа int и двумерный массив типа int.
        // Вычислите сумму и среднее значение элементов одномерного массива
        // и количество четных и нечетных числел двумерного массива.

        int[] numbersArray = new int[]{5,12,27};

        int[][] numbersArray2 = new int[numbersArray.length][5];

        int sumNumbersArray = 0;
        int evenNumbersArray2 = 0;
        int oddNumbersArray2 = 0;

        for(int line = 0; line < numbersArray2.length; line++){
            for(int column = 0; column < 5; column++){
                numbersArray2[line][column] = (line + 1) * (column);
            }
        }

        for(int line = 0; line < numbersArray2.length ; line ++){
            sumNumbersArray = sumNumbersArray + numbersArray[line];
            for(int column = 0; column < numbersArray2[0].length; column++){
                if (numbersArray2[line][column] % 2 == 0){
                    evenNumbersArray2 = evenNumbersArray2 + 1;
                }
                    else {
                    oddNumbersArray2 = oddNumbersArray2 + 1;
                }
            }
        }

        System.out.println("Сумма всех чисел в массиве = " + sumNumbersArray);
        if(numbersArray.length != 0){
            System.out.println("Среднее значение = " + (double)sumNumbersArray / numbersArray.length);
        }
        else {
            System.out.println("Среднее значение = 0");
        }
        System.out.println("Четных чисел в массиве = " + evenNumbersArray2);
        System.out.println("Нечетных чисел в массиве = " + oddNumbersArray2);


        //Бонус: Создайте массив типа String и заполните его разными именами ваших коллег.
        // Объявите еще один массив типа String и скопируйте все содержимое первого массива в новый массив.

        String[] colleaguesNames = new String[]{"Паша", "Вова", "Миша"};
        String[] colleaguesNames2 = new String[colleaguesNames.length];

        for(int i = 0; i < colleaguesNames.length; i++){
            colleaguesNames2[i] = colleaguesNames[i];
        };


    }

}

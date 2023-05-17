package org.example.homework_nr_11;

import sun.text.normalizer.UCharacter;

import java.security.PublicKey;
import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/*
Используйте эти интерфейсы. Приведите пару примеров с каждым из них.
Создайте методы которые будут принимать эти интерфейсы в качестве параметров и реализуйте интересный функционал.
Кто приведет пример используя коллекции любого вида, тому жирный плюс)
 */
public class Main {

    public static void main(String[] args) {

        Function<String, Integer> consonantCount = s -> {
            int consonants = 0;
            for (char i : s.toLowerCase().toCharArray()) {
                if (i >= 'a' && i <= 'z' && !"aeuioy".contains(Character.toString(i))) {
                    consonants++;
                }
            }
            return consonants;
        };

        printFunctions(consonantCount,"dsajhkdsfl;kjfgdm,.vcbl;kjdfg");

        Function<String, Integer> vowelsCount = s -> {
            int vowels = 0;
            for (char i : s.toLowerCase().toCharArray()) {
                if (i >= 'a' && i <= 'z' && "aeuioy".contains(Character.toString(i))) {
                    vowels++;
                }
            }
            return vowels;
        };

        printFunctions(vowelsCount,"uirtydAeeOOvcbl;kjdfg");

        Function<String, Integer> numbersCount = s -> {
            int numbers = 0;
            for (char i : s.toCharArray()) {
                if (Character.isDigit(i)) {
                    numbers++;
                }
            }
            return numbers;
        };

        printFunctions(numbersCount,"dsaj36587sfl;kjfgdm,.vcbl;kjdfg");

        Function<String, Character> charOrNull = s -> {
            if (s.length() % 2 == 0){
                return null;
            }
            else{
                return s.charAt(0);
            }
        };

        printFunctions(charOrNull,"dsaj36587sfl;kjfgdm,.vcbl;kjdf");

        Predicate<String> palindrome = s -> {
            String reverseWord = new StringBuilder(s.toLowerCase()).reverse().toString();
            return s.toLowerCase().equals(reverseWord);
        };

        System.out.println(palindrome.test("Anna"));
        System.out.println(palindrome.test("Jana"));

        Predicate<Integer> someInteger = s -> {
            for (int i = 2; i < s; i++){
                if(s % i == 0) {
                    return false;
                }
            }
            return true;
        };

        System.out.println(someInteger.test(13));
        System.out.println(someInteger.test(21));

    }

    public static void printFunctions(Function nameOfFunctions, String inputText){
        System.out.println(nameOfFunctions.apply(inputText));
    }

}

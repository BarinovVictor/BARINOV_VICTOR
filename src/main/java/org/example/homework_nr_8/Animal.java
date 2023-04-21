package org.example.homework_nr_8;

//        Создайте Animal Interface, определите как минимум 4 метода,
//        один метод default, один static, необходимые переменные
//        Создайте класс Elephant, реализуйте интерфейс Animal
//        Создайте объект типа Elephant через интерфейс Animal
public interface Animal {

    default void produceSound() {
        System.out.println("Its not a fish");
    }

    void CanRun();
    void CanFly();

    static void canSwim() {
        System.out.println("Like a fish ");
    }

}

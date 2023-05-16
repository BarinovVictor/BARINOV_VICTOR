package org.example.homework_nr_12;

import javax.lang.model.util.ElementScanner6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>(
                Arrays.asList(
                        new Employee("Ivan", "Ivanov", 27, true, true),
                        new Employee("Serghei", "Sergheev", 37, false, false),
                        new Employee("Piotor", "Petrov", 25, false, true),
                        new Employee("Andrei", "Andreeev", 45, true, true),
                        new Employee("Radion", "Radionovschii", 33, true, false),
                        new Employee("Ecaterina", "Popa", 19, false, true),
                        new Employee("Victor", "Citorean", 39, true, false),
                        new Employee("Oleg", "Mamaligov", 20, false, true),
                        new Employee("Svetlana", "Semitsveticova", 25, true, false),
                        new Employee("Oliga", "Nemerenco", 41, true, true)
                )
        );

        List<Employee> canConductInterview = new ArrayList<>();
        employeeList.forEach(employee -> {
            if (employee.getCanConductInterview() && employee.getAge() > 25 && canConductInterview.size() <= 4)
                canConductInterview.add(employee);
        });

        System.out.println(canConductInterview);

        List<String> employeeOnlyNames = new ArrayList<>();
        employeeOnlyNames = employeeList.stream()
                .filter(employee -> employee.getAge() > 30 && !employee.getPayedByHour())
                .map(employee -> employee.getName())
                .sorted()
                .collect(Collectors.toList());

        System.out.println(employeeOnlyNames);

        Optional<Employee> firstEmployee = Optional.of(employeeList.stream()
                .filter(employee -> employee.getCanConductInterview() && employee.getPayedByHour())
                .findFirst().get());

        if (firstEmployee.isPresent()){
            System.out.println(firstEmployee);}
        else {System.out.println("Employee was not found!");};

        employeeList.stream()
                .sorted((o1, o2) -> {
                    return o1.getSurname().compareTo(o2.getSurname());
                })
                .forEach(employee -> System.out.println(employee.toString()));
    }
}

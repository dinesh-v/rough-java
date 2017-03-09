package com.example.rough;

import java.util.Comparator;
import java.util.TreeSet;

public class App {
    public static void main(String[] args) {

        // http://stackoverflow.com/questions/6478515/return-type-from-a-comparator


        // "d" character has larger value than "a" >1 will be returned. Here 3 is returned which is difference between a & d
        System.out.println("dinesh".compareTo("air"));

        // Equal will return 0
        System.out.println("dinesh".compareTo("dinesh"));

        // "a" character has larger value than "d" so <1 will be returned. Here -3 is returned which is difference between a & d
        System.out.println("air".compareTo("dinesh"));

        //By using name comparator (String comparison)
        TreeSet<Employee> nameComp = new TreeSet<>(new MyNameComp());
        nameComp.add(new Employee("Ram", 3000));
        nameComp.add(new Employee("John", 6000));
        nameComp.add(new Employee("Crish", 2000));
        nameComp.add(new Employee("Tom", 2400));

        nameComp.forEach(System.out::println);

        System.out.println("\nPrinting based on salary from lowest to highest\n");

        //By using salary comparator (int comparison)
        TreeSet<Employee> salComp = new TreeSet<>(new MySalaryComp());
        salComp.add(new Employee("Ram", 3000));
        salComp.add(new Employee("John", 6000));
        salComp.add(new Employee("Crish", 2000));
        salComp.add(new Employee("Tom", 2400));
        salComp.forEach(System.out::println);
    }
}

class MyNameComp implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        return e1.getName().compareTo(e2.getName());
    }
}

class MySalaryComp implements Comparator<Employee> {
    @Override
    public int compare(Employee e1, Employee e2) {
        if (e1.getSalary() > e2.getSalary()) {
            return 1;
        } else {
            return -1;
        }
    }
}

class Employee {

    private String name;
    private int salary;

    Employee(String n, int s) {
        this.name = n;
        this.salary = s;
    }

    String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Name: " + this.name + " - Salary: " + this.salary;
    }
}
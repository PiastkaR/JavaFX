package com.javafx.propertiesexcercise;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;

import java.util.Scanner;

public class ExcerciseMain {
    public static void main(String[] args) {
        IntegerProperty first = new SimpleIntegerProperty();
        IntegerProperty second = new SimpleIntegerProperty();

        Scanner sc = new Scanner(System.in);
        second.bind(first);
        System.out.println("Please write two numbers: ");
        first.set(sc.nextInt());
        sc.nextLine();
        System.out.println("First of two numbers (as second variable): " + second.get());
        first.set(sc.nextInt());
        sc.nextLine();
        System.out.println("Second of two numbers (as second variable): " + second.getValue());
        sc.close();
    }
}

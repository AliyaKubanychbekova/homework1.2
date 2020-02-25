package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(checking(10, 23));
        System.out.println(checking(11, 24));
        System.out.println(checking(12, 25));
        System.out.println(checking(13, 26));
        System.out.println(checking(14, 27));
    }

    public static String checking(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature > 0 && temperature < 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature < 25) {
            return "Можно идти гулять";
        } else {
            return " Оставайтесь дома";
        }
    }
}




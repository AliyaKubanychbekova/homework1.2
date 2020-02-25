package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int i = random();
        System.out.println(checking(i, 8));


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
    public static int random(){
        Random rand = new Random();
        int old = rand.nextInt(49) + 1;
        return old;
    }


}


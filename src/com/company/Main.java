package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println(fun1(20, 21));
        System.out.println(fun1(18, 23));
        System.out.println(fun1(34, 15));
        System.out.println(fun1(35, 15));
        System.out.println(fun1(27, 32));
    }

    public static String fun1(int age, int temp){
        String text1 = "Можно идти гулять";
        String text2 = "Оставайтесь дома";
        if (age > 20 && age < 45)
            if (temp > -20 && temp < 30){
                return text1;
            }
        if (age < 20)
            if (temp > 0 && temp < 28){
                return text1;
            }
        if (age > 45)
            if (temp > -10 && temp < 25){
                return  text1;
            }
        return text2;
    }
}


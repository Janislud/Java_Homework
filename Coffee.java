package Homework;

import java.util.Scanner;

public class Coffee {
    public static void main(String[] args) {
//        1 уровень сложности: Представьте, что вы находитесь
//        перед кофейным аппаратом, у него 4 кнопки, которые
//        соответствуют напиткам: эспрессо, американо, капучино, обычная вода.
//          Напишите алгоритм, который будет предлагать
//          клиенту выбрать напиток, нажатие кнопки (или считывания цифры, например)
//          и в консоль будет отображаться результат приготовления (например, "Ваш <напиток> готов").
//
//          Сделайте 2 метода, в одном из них будет реализован формат if-else, в другом - switch


        // IF/ELSE


        Scanner sc = new Scanner(System.in);
        System.out.print("Enter pls number:");
        int d = sc.nextInt();
        System.out.println(getQ(d));
        System.out.println("Ваш <напиток> готов");

        int Q = sc.nextInt();
        sc.nextLine();
       int coffee = 1;
        int latte = 2;
        int cappuccino = 3;
        int Water = 4;

//        if (Q == coffee) {
//            System.out.println("You are select:  Coffee");
//            System.out.println("Ваш <напиток> готов");
//        } else if (Q == latte) {
//            System.out.println("You are select: Latte");
//            System.out.println("Ваш <напиток> готов");
//        } else if (Q == cappuccino) {
//            System.out.println("You are select: Cappuccino");
//            System.out.println("Ваш <напиток> готов");
//        } else if (Q == Water) {
//            System.out.println("You are select: Water");
//            System.out.println("Ваш <напиток> готов");
//        } else {
//            System.out.println("No coin");
//        }

    }


    //SWITCH CASE
    public static String getQ(int d) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter pls number:");
//        int getQ = sc.nextInt();
//        sc.nextLine();
//        int coffee = 1;
//        int latte = 2;
//        int cappuccino = 3;
//        int Water = 4;
        String result;

        switch (d) {
            case 1:
                result = "Coffee";
                break;

            case 2:
                result = "Latte";
                break;

            case 3:
                result = "Cappuccino";
                break;

            case 4:
                result = "Water";
                break;

            default:
                result = "No coin";
        }

        return result;
    }
}
package Homework;

public class Random {
    public static void main(String[] args) {
//        //1 уровень сложности: Создать программу,
//        выводящую на экран случайно сгенерированное
//        трёхзначное целое число и его наибольшую цифру

                java.util.Random rand = new java.util.Random();
                int a = rand.nextInt(899) + 100;
                int first = a / 100;
                int secondBegin = a / 10;
                int second = secondBegin % 10;
                int third = a % 10;
                if (first > second && first > third) {
                    System.out.println (first);
                } else if (second > first && second > third) {
                    System.out.println (second);
                } else {
                    System.out.println (third);
                }
                System.out.println (a);
    }




}

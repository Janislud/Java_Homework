package Homework;

import java.util.Scanner;

public class Elevator {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Specify the number of floors in building: ");
        int H = scanner.nextInt();
        System.out.print("How many floors does the elevator go up: ");
        int N = scanner.nextInt();
        System.out.print("Specify the number of floors in building: ");
        int M = scanner.nextInt();

        int sum = 0;
        int count = 0;
//        int H = 2;
//        int N = 2;
//        int M = 2;
        while (sum < H) {
            if (N > M) {
                sum = sum + N - M;
            } else {
                System.out.println("Elevator can't move up");
                break;
            }
            count++;
        }
        System.out.println("To go up to the " + H + "the floor, you have to do " + count + "climbs");
        scanner.close();
    }
}

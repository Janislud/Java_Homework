import java.util.Scanner;

public class Device {
    public static void main(String[] args) {

        //Представим, что у нас есть устройство, в котором две колбы.
        //Прибор работает корректно, если температура первой колбы выше 100 градусов,
        // 100 градусов, а температура второй колбы меньше 100 градусов
        //Вы должны написать метод, который проверяет это устройство. Ваша программа должна иметь переменные
        //Temperature1 и Temperature2. В результате он выводит сообщение true или false.

       double temperature1 =110, temperature2 =90;

        double flask1 = 110;
        double flask2 = 90;


        boolean f1 = flask1 == flask2;
        boolean f2 = temperature1 > temperature2;


        System.out.println("flask first == flask second is " + f1);
        System.out.println("temperature1 > temperature2 is " + f2);


}
}



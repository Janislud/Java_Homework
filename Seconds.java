import java.util.Random;

public class Seconds {
    //1 уровень сложности: Задачки по логическим выражениям будут после того, как мы пройдём условные конструкции, а пока задачка такая:
    //
    //Есть устройство, на табло которого показывается количество секунд, оставшихся до конца рабочего дня. Когда рабочий день начинается ровно в 9 часов утра — табло отображает «28800» (т.е. остаётся 8 часов), когда 14:30 — на табло «9000» (т.е. остаётся два с половиной часа), а когда наступает 17 часов — на табло отображается «0» (т.е. рабочий день закончился).
    //Некоторые сотрудники не умеют оценивать остаток рабочего дня в секундах.
    //Итак: требуется написать программу, которая вместо секунд будет выводить на табло понятные фразы с информацией о том, сколько полных часов осталось до конца рабочего дня.
    //Например: «осталось 7 часов», «осталось 4 часа», «остался 1 час», «осталось менее часа».
    //Обьяснение: в переменную n должно записываться случайное (на время тестирования программы) целое число из диапазона от 0 до 28800, далее оно должно выводиться на экран (для тех сотрудников, кто понимает в секундах) и на следующей строке (для тех сотрудников, кто не понимает) должна выводиться фраза о количестве полных часов, содержащихся в n секундах.

    public static void main(String[] args) {

        // РАНДОМ от 0-28к

        String [] hours = {"0","28000","9000"};
        String [] hours2 = {"«осталось 7 часов»","«осталось 4 часа»", "«остался 1 час»","«осталось менее часа»"};
        Seconds a = new Seconds();
        a.selectSeconds1(hours);
        a.selectSeconds2(hours2);

    }

    public void selectSeconds1(String[] a){
        // в секундах
        Random random = new Random();
        int secondsIndex = random.nextInt(0,a.length);
        String seconds = a[secondsIndex];
        System.out.println("Time left = " + seconds);

    }

    public void selectSeconds2(String[] b){
        // полных часов
        int min = 0;
        int max = b.length; //8
        int secondsIndex = (int) (Math.random() * (max-min) + min);
        String seconds = b[secondsIndex];
        System.out.println("Time left = " + seconds);



    }

}

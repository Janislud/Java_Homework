
public class degree {
    public static void main(String[] args) {
        double celsius = 40;
        // Конвертирование из градусов Цельсия в Кельвины
        double kelvin = Convertor.celsiusToKelvin(celsius);
        System.out.println(celsius + " градусов Цельсия = " + kelvin + " Кельвин");
        // Конвертирование из градусов Цельсия в Фаренгейты
        double fahrenheit = Convertor.celsiusToFahrenheit(celsius);
        System.out.println(celsius + " градусов Цельсия = " + fahrenheit + " градусов Фаренгейта");
        // Обмен значениями двух переменных с помощью третьей переменной

    }
}


package HW08;

public class HW08 {

    public static void main(String[] args) {

        int temperature1 = 120;  // Пример значения температуры первой колбы
        int temperature2 = 80;   // Пример значения температуры второй колбы

        boolean deviceStatus = checkDevice(temperature1, temperature2);
        System.out.println("Device status: " + deviceStatus);
    }

    public static boolean checkDevice(int temperature1, int temperature2) {
        if (temperature1 > 100 && temperature2 < 100) {
            return true;  // Устройство работает корректно
        } else {
            return false;  // Устройство не работает корректно
        }
    }
}






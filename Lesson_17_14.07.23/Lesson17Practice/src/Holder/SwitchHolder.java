package Holder;

public class SwitchHolder {
    private static String owner = "Andrey";
    private static String[] saver = new String[10]; // размер массива 10, первый индекс - 0, полседний - 9.
    private static int index = 0;

    public static boolean hold(String password) {
        if (index > (saver.length - 1)) {
            return false;
        } else {
            saver[index] = password;
            index++;


            return true;
        }

    }

    public static String[] checkName(String inputName) {
        switch (inputName) {
            case "Andrey":
                return saver;
            case "Bad guy":
                String[] cancel = new String[1];
                cancel[0] = "Fuck off";
                return cancel;
            default:
                String[] wrong = new String[1];
                wrong[0] = "Cannot acces";
                return wrong;

        }

    }
}



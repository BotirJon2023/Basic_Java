package lesson8.Practice2;

public class RandomStudent {

    public static void main(String[] args) {
        System.out.println("Сгенерированный  номер студента = " + setStudentValue(25));
    }

    static int setStudentValue(int studentValue) {
        int max = studentValue;
        int min = 2;
        int randomStudentNumber = (int) (min + Math.random() * ((max - min) + 1));
        return randomStudentNumber;
    }
}

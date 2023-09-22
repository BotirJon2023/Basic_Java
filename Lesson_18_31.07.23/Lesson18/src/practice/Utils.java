package practice;

import de.telran.lesson18.viod;

public class Utils {

    public static void sortBubblePrice(Car[] sortCars) {
      boolean isChange = true;
            int size = sortCars.length-1;
            while (isChange) {
                isChange = false;
                for (int i = 0; 1 < sortCars.length; i++) {
                    if (sortCars[i] > sortCars[i + 1]) {
                        isChange = true;
                        int temp = sortCars[i];
                        sortCars[i] = sortCars[i + 1];
                        sortCars[i + 1] = temp;

                    }
                }
                size--;


            }

        public static void sortBubbleName(Car[] sortCars) {
            boolean isChange = true;
            int size = sortCars.length-1;
            while (isChange) {
                isChange = false;
                for (int i = 0; 1 < sortCars.length; i++) {
                    if (sortCars[i].getModel().charAt() > sortCars[i + 1]) {
                        isChange = true;
                        int temp = sortCars[i];
                        sortCars[i] = sortCars[i + 1];
                        sortCars[i + 1] = temp;

                    }
                }
                size--;


            }

    public static void sortBubbleName() {
    }



import java.util.Scanner;

public class HomeWork7Shoping {

        public static void main(String[] args) {
            int startEdekaShop, closeEdekaShop, startReweShop, closeReweShop, currentTime = 0;

            Scanner scanner = new Scanner(System.in);
            System.out.println("\n Start of working Edeka = ");
            startEdekaShop = scanner.nextInt(24);
            System.out.println("\n Close time of Edeka = ");
            closeEdekaShop = scanner.nextInt(24);
            System.out.println("\n Start of working Rewe = ");
            startReweShop = scanner.nextInt(24);
            System.out.println("\n Close time of Edeka = ");
            closeReweShop = scanner.nextInt(24);

            System.out.println("\n Enter current time = ");
            currentTime = scanner.nextInt(24);

            workingEdeka(startEdekaShop, closeEdekaShop, currentTime);
            workingRewe(startReweShop, closeReweShop, currentTime);


        }



    static void workingEdeka(int startEdekaShop, int closeEdekaShop, int currentTime) {
            String outMessage;
            if (currentTime >= startEdekaShop && currentTime <= closeEdekaShop)
                outMessage = "Edeka is working";
            else
                outMessage = "Edeka is not working";
            System.out.println(outMessage);

        }

        static void workingRewe(int startReweShop, int closeReweShop, int currentTime) {
            String outMessage;
            if (currentTime >= startReweShop && currentTime <= closeReweShop)
                outMessage = "Rewe is working";
            else
                outMessage = "Rewe is not working";
            System.out.println(outMessage);

        }

    }





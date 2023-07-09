public class HomeWork7CanBuy {
    public class Main {
        public static void main(String[] args) {
            boolean isEdekaOpen = true;
            boolean isReweOpen = false;

            boolean canBuy = canBuyFood(isEdekaOpen, isReweOpen);

            System.out.println("Я могу купить еду, это " + canBuy);
        }

        public static boolean canBuyFood(boolean isEdekaOpen, boolean isReweOpen) {
            return isEdekaOpen || isReweOpen;
        }
    }

}


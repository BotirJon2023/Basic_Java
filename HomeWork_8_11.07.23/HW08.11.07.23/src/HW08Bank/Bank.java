package HW08Bank;

public class Bank {

        public static int getDaysToWithdrawAll(int amount) {
                int days = 0;

                while (amount > 0) {
                    int maxWithdrawal = 1;

                    for (int i = 1; i <= amount; i++) {
                        if (amount % i == 0 && i < amount) {
                            maxWithdrawal = i;
                        }
                    }

                    amount -= maxWithdrawal;
                    days++;
                }

                return days;
            }

            public static void main(String[] args) {
                int N = 21;
                int days = getDaysToWithdrawAll(N);
                System.out.println("Дней для снятия всех денег: " + days);
            }
        }





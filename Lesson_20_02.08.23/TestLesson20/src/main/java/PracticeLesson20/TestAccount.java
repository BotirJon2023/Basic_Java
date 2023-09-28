package PracticeLesson20;

public class TestAccount {

    public static void main(String[] args) {

        String badAccount = "76576565465465465465";
        System.out.println("Account "+ badAccount +
                " is " + Accounts.isValidaAccountNumber(badAccount));


        String goodAccount = "32645325463472";
        System.out.println("Account "+ goodAccount +
                " is " + Accounts.isValidaAccountNumber(goodAccount));



    }

}

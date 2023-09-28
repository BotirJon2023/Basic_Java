package PracticeLesson20;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountsTest {


    @Test
    void isValidaAccountNumber_length14() {
        String badAccountLess14 = "7364873648244";
        String badAccountMore14 = "736487364826763";

        assertFalse(Accounts.isValidaAccountNumber(badAccountLess14));
        assertFalse(Accounts.isValidaAccountNumber(badAccountMore14));
    }

    @Test
    void isValidaAccountNumber_allNumberNotNull() {
        String badAccountAllNull = "00000000000000";

        assertFalse(Accounts.isValidaAccountNumber(badAccountAllNull));


    }

    @Test
    void isValidAccountNumber_notNull_notEmpty() {
        assertFalse(Accounts.isValidaAccountNumber(null));
        assertFalse(Accounts.isValidaAccountNumber(""));
    }

    @Test
    void isValidAccountNumber_correct() {
        String goodAccount = "76576765765765";
        assertTrue(Accounts.isValidaAccountNumber(goodAccount));
    }

}
package org.example;

public class HomeWork24 {

    static class WrongLoginException extends Exception {

        public WrongLoginException(String message) {
            super(message);
        }
    }

    static class WrongPasswordException extends Exception {

        public WrongPasswordException(String message) {
            super(message);
        }
    }

    public static class LoginAndPasswordValidator {
        public static boolean checkLoginAndPassword(String login, String password, String confirmPassword) {
            try {
                if (!login.matches("[a-zA-Z0-9_]+") || login.length() >= 20) {
                    throw new WrongLoginException("Login is invalid");
                }

                if (!password.matches("[a-zA-Z0-9_]+") || password.length() >= 20) {
                    throw new WrongPasswordException("Password is invalid");
                }

                if (!password.equals(confirmPassword)) {
                    throw new WrongPasswordException("Password does not match the confirm password");
                }

                return true;
            } catch (WrongLoginException | WrongPasswordException e) {
                System.out.println(e.getMessage());
                return false;
            }
        }

        public static void main(String[] args) {
            System.out.println(checkLoginAndPassword("john", "123", "123")); // true
            System.out.println(checkLoginAndPassword("john", "123", "1234")); // false
            System.out.println(checkLoginAndPassword("john", "123@", "123@")); // false
            System.out.println(checkLoginAndPassword("john@", "123", "123")); // false
        }
    }
}

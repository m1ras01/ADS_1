public class Task_8 {
    public static String CheckDigit(String str) {
        if (str.length() == 0) { // base case: the string is empty
            return "Yes"; // since the string is empty, it must contain only digits
        }
        if (Character.isDigit(str.charAt(0))) { // if the first character is a digit
            return CheckDigit(str.substring(1)); // check the rest of the string recursively
        } else { // if the first character is not a digit
            return "No"; // the string does not contain only digits
        }
    }
}

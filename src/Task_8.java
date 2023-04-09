public class Task_8 {
    public static String CheckDigit(String str) {
        if (str.length() == 0) {
            return "Yes";
        }
        if (Character.isDigit(str.charAt(0))) {
            return CheckDigit(str.substring(1)); // бырден бастап стрингын сонына дейын тексереды
        } else {
            return "No";   //егер де сан шыкпаса но шыгады
        }
    }

}

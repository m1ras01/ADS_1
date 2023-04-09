public class Task_3 {
    public static String checkNums(int n) {
        String p = "Prime";
        String C = "Composite";

        if (n == 2) {                                    // если 3 ке или 2 ге болынсе прайм намбер
            return p;
        } else if (n == 3) {
            return p;
        } else if (n % 3 != 0 && n % 2 != 0) {         // 3 ке де 2  ге де болынбесе Composite
            return p;
        } else {
            return C;
        }
    }
}

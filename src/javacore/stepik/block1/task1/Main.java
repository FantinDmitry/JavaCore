package javacore.stepik.block1.task1;

public class Main {
    public static void main(String[] args) {
        String a;
        a = sum(3, 5);
        System.out.println(a);

    }

    public static String sum(int a, int b) {
        int c = a + b;
        if (a + b == 7) {
            return "Result";
        }
        return "Fuck";
    }
}

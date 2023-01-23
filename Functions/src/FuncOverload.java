public class FuncOverload {
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(Double a, Double b) {
        return a + b;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 6));
        System.out.println(sum(4, 6, 9));
        System.out.println(sum(4.5, 6.8));
    }
}

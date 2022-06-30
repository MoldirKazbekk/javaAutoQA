public class Triangle {
    public static void main(String[] args) {
        System.out.println(computeArea(3, 4, 5));
    }

    public static double computeArea(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double s = Math.pow((p - a) * (p - b) * (p - c) * p, 0.5);
        return s;
    }
}

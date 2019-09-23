public class Multiplier {

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String args[]){
        System.out.println("3 x 4 = " + multiply(3, 4));
        System.out.println("3 x 4 X 2 = " + multiply(3, 4, 2));
        System.out.println("3.0 x 4.0 = " + multiply(3.0, 4.0));
    }
}
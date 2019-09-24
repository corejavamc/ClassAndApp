public class Multiplier {
    /*
     * multiply method which takes 2 integer parameters
     */
    public int multiply(int a, int b) {
        return a * b;
    }

    /*
     * multiply method which takes 3 integer parameters
     */
    public int multiply(int a, int b, int c) {
        return a * b * c;
    }

    /*
     * multiply method which takes 2 double parameters
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    public static void main(String args[]){
        Multiplier val = new Multiplier();

        System.out.println("3 x 4 = " + val.multiply(3, 4));
        System.out.println("3 x 4 X 2 = " + val.multiply(3, 4, 2));
        System.out.println("3.0 x 4.0 = " + val.multiply(3.0, 4.0));
    }
}
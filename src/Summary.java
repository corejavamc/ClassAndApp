public class Summary {
    public int sum(int x, int y) {
        int result = x + y;
        return result;
    }

    /*
     * Overloaded sum method to take 3 integer parameters
     */
    public int sum(int x, int y, int z) {
        int result = x + y + z;
        return result;
    }

    /*
     * Overloaded sum method to take 2 double parameters
     */
    public double sum(double x, double y) {
        double result = x + y;
        return result;
    }

    /*
     * Overloaded sum method to take 3 double parameters
     */
    public double sum(double x, double y, double z) {
        double result = x + y + z;
        return result;
    }

    /*
     * Overloaded sum method to take 2 string parameters
     */
    public static String sum(String x, String y) {
        String result = x + y;
        return result;
    }

    /*
     * Overloaded sum method to take 3 string parameters
     */
    public String sum(String x, String y, String z) {
        String result = x + y + z;
        return result;
    }

}


public class SummaryApp {
    public static void main(String args[]) {
        Summary val = new Summary();
        System.out.println("3 + 5 = " + val.sum(3,5)+ "\n");
        System.out.println("3 + 5 + 2 = " + val.sum(3,5, 2)+ "\n");

        System.out.println("3.0 + 5.0 = " + val.sum(3.0,5.0)+ "\n");
        System.out.println("3.0 + 5.0 + 2.0 = " + val.sum(3.0,5.0, 2.0)+ "\n");

        System.out.println("\"Java\" + \"Bootcamp\" = \"" + val.sum("Java","Bootcamp") + "\"\n");
        System.out.println("\"Java\" + \"8week\" + \"Bootcamp\" = \"" + val.sum("Java", "8week" + "Bootcamp") + "\"\n");

    }
}

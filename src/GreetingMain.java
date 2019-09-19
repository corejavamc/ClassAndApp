public class GreetingMain {
    public static void main(String args[]) {
        Greeting g = new Greeting();
        g.setSender("Dave");
        g.setGreeting("Hello");
        String message = g.displayMessage();
        System.out.println(message);

        Greeting g2 = new Greeting();
        g2.setSender("Melissa");
        g2.setGreeting("Hello from Melissa");
        System.out.println(g2.getSender());
        System.out.println(g2.getGreeting());

        Greeting g3 = new Greeting("Jennifer","I like Java");
        System.out.println(g3.displayMessage());

    }
}

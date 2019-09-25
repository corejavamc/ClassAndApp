import java.util.ArrayList;
import java.util.Scanner;

public class PersonApp {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        ArrayList<Person> people = new ArrayList<>();
        Person person;
        String inputStr;
        int inputInt;
        double inputDoub;

        while (true) {
            person = new Person();

            System.out.println("Enter name: ");
            inputStr = keybd.nextLine();
            person.setName(inputStr);

            System.out.println("Enter age: ");
            inputInt = keybd.nextInt();
            keybd.nextLine();
            person.setAge(inputInt);

            System.out.println("Enter height in nearest inches: ");
            inputInt = keybd.nextInt();
            keybd.nextLine();
            person.setHeight(inputInt);

            System.out.println("Enter weight: ");
            inputDoub = keybd.nextDouble();
            keybd.nextLine();
            person.setWeight(inputDoub);

            people.add(person);

            System.out.println("Want to add more? (y/n)");
            inputStr = keybd.nextLine();
            if (inputStr.equalsIgnoreCase("n"))
                break;

        }

        System.out.println("");
        for (Person one : people)
            System.out.println(one.getNameAge());
    }
}

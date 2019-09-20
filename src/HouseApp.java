import java.util.ArrayList;
import java.util.Scanner;

public class HouseApp {
    public static void main(String args[]) {
        Scanner keybd = new Scanner(System.in);
        House onehouse;
        String userstr;
        int userint;

        onehouse = new House();
        System.out.println("How many bedrooms does a house have?");
        userint = keybd.nextInt();
        keybd.nextLine();
        onehouse.setNobedrooms(userint);

        System.out.println("How many bathrooms does a house have?");
        userint = keybd.nextInt();
        keybd.nextLine();
        onehouse.setNobathrooms(userint);

        System.out.println("How many floors does a house have?");
        userint = keybd.nextInt();
        keybd.nextLine();
        onehouse.setNofloors(userint);

        System.out.println("What style of house is it?");
        userstr = keybd.nextLine();
        onehouse.setStyle(userstr);

        System.out.println("Does a house have any garage? (y/n)");
        userstr = keybd.nextLine();

        if (userstr.equalsIgnoreCase("y"))
            onehouse.setGarage(true);
        else
            onehouse.setGarage(false);


        System.out.println("House Information:");
        System.out.println(onehouse.getHouseInfo());
    }
}

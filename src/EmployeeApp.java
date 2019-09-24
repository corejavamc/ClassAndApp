public class EmployeeApp {
    public static void main(String args[]) {
        Employee staff = new Employee();
        int id = 987;
        String result = "", name = "John Doe";

        staff.setId(id++);
        staff.setName(name);
        staff.setDept("Accounting");

        if (staff.isEmployee(id)) {
            result = staff.display();
            System.out.println(result);
        }
        else {
            System.out.println("Id (" + id + ") is not our employee\n");
        }

        if (staff.isEmployee(name)) {
            result = staff.display();
            System.out.println(result);
        }
        else {
            System.out.println("Id (" + id + ") is not our employee");
        }
    }
}

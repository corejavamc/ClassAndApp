/*
 * Create an Employee class where it contains id, name, and department variables. 
 * Create its constructors, getters, setters, and methods named display and isEmployee. 
 * You should use display () method to print out employee's information and isEmployee()
 * method to check if given id or name is an employee.
 * Print out employee's information if given id or name is an employee.
 */

public class Employee {
    private long id;
    private String name;
    private String dept;

    public Employee() {
    }

    public Employee(long id, String name, String dept) {
        this.id = id;
        this.name = name;
        this.dept = dept;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public boolean isEmployee(long id) {
        boolean result;

        if (getId() == id)
            result = true;
        else
            result = false;

        return result;
    }

    public boolean isEmployee(String name) {
        boolean result;

        if (getName().equalsIgnoreCase(name))
            result = true;
        else
            result = false;

        return result;
    }

    public String display() {
        String result ="";

        result = "Id: " + getId() + "\n" +
                 "Name: " + getName() + "\n" +
                 "Dept: " + getDept();

        return result;
    }
}

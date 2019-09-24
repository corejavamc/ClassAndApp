public class Course {
    private String name;
    private int number;
    private int credit;
    private String grade;

    public Course() {
    }

    public Course(String name, int number, int credit, String grade) {
        this.name = name;
        this.number = number;
        this.credit = credit;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getCredit() {
        return credit;
    }

    public void setCredit(int credit) {
        this.credit = credit;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String displayText() {
        String result = "";
        result = getName() + "\t" + getNumber() + "\t" + getCredit() + "\t\t" + getGrade();
        return result;
    }

    public double convertGPA() {
        double gpa;

        switch (getGrade().toLowerCase()) {
            case "a+":
            case "a":
                gpa = 4.0;
                break;

            case "a-":
                gpa = 3.7;
                break;

            case "b+":
                gpa = 3.3;
                break;

            case "b":
                gpa = 3.0;
                break;

            case "b-":
                gpa = 2.7;
                break;

            case "c+":
                gpa = 2.3;
                break;

            case "c":
                gpa = 2.0;
                break;

            case "c-":
                gpa = 1.7;
                break;

            case "d+":
                gpa = 1.3;
                break;

            case "d":
                gpa = 1.0;
                break;

            default:
                gpa = 0;
                break;
        }

        return gpa;
    }

}

public class Person {
    private String name;
    private int age;
    private int height; // in nearest in inches
    private double weight;

    public Person() {
    }

    public Person(String name, int age, int height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getNameAge(){
        String retval = getName() + " is " + getAge() + " years old.";
        return retval;
    }
}

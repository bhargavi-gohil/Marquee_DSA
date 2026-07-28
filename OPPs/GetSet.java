public class GetSet {
    String name;
    int Class;
    int avg;
    String grade;

    // getter
    void getValues() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + Class);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }
    // setter
    void setValues(String name, int Class, int avg, String grade) {
        this.name = name;
        this.Class = Class;
        this.avg = avg;
        this.grade = grade;
    }

    public static void main(String[] args) {
        GetSet g = new GetSet();
        g.setValues("bhargavi", 10, 23, "B");
        g.getValues();

    }
}

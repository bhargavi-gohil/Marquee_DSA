public class GetSet {
     String name;
     int Class;
     int avg;
     String grade;

    // getter methods
    public String getName() {
        return name;
    }
    public int getStudentClass() {
        return Class;
    }
    public int getAvg() {
        return avg;
    }
    public String getGrade() {
        return grade;
    }

    // setter methods
    public void setName(String name) {
        this.name = name;
    }
    public void setStudentClass(int Class) {
        this.Class = Class;
    }
    public void setAvg(int avg) {
        this.avg = avg;
    }
    public void setGrade(String grade) {
        this.grade = grade;
    }

    // print all values
    public void printValues() {
        System.out.println("Name: " + name);
        System.out.println("Class: " + Class);
        System.out.println("Average: " + avg);
        System.out.println("Grade: " + grade);
    }

    public static void main(String[] args) {
        GetSet g = new GetSet();
        g.setName("Bhargavi");
        g.setStudentClass(10);
        g.setAvg(23);
        g.setGrade("B");

        g.printValues();
    }
}

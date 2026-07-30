public class Inheritance {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Piyali Sarkar", 25, "DSA");
        teacher.displayInfo();
        teacher.teach();
    }
}
// Parent class
class Person {
    String name;
    int age;
    
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}
// child class -> accessing parent class
class Teacher extends Person {
    String subject;

    Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void teach() {
        System.out.println(name + " is teaching " + subject + ".");
    }
}


class createClass {
    String name;
    int age;

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }

    static class update {
        String name;
        int age;
        // update(){  // default/No-args
        //     this.name ="saumya";
        //     this.age = 29;
        // }

        // parameterize
        update(String name, int age) {
            this.name = name;
            this.age = age;
        }
        // copy constructor
        update(update u) {
            this.name = u.name;
            this.age = u.age;
        }
        void update2() {
            System.out.println("update name: " + name);
            System.out.println("update age: " + age);
        }
    }

    public static void main(String[] args) {
        // obj for class1
        createClass c = new createClass();

        c.name = "Bhargavi";
        c.age = 19;
        c.display();

        // obj for class2
        update u = new update("Saumya", 29);
        // update u = new update(u); // copy constructor
        
        u.update2();
    }
}
// constructor types 
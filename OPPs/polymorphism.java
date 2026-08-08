class calculator {
    int add(int a, int b) { return a+b; }
    double add(double a,double b){return a+b;}
    long add(long a,long b) { return a+b; }
}

class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {
    void sound() {
        System.out.println("Dog barks: Woof! Woof!");
    }
}

class Cat extends Animal {
    void sound() {
        System.out.println("Cat meows: Meow!");
    }
}

class Animal2 {
    void showAnimalSound(Animal animal) {
        animal.sound();
    }
}

public class polymorphism {
    public static void main(String[] args) {
        calculator c = new calculator();
        int ans = c.add(3, 5);
        System.out.println(ans);

        double ans2 = c.add(3.656, 23.3232);
        System.out.println(ans2);

        Animal2 u = new Animal2();
        Animal dog = new Dog();
        Animal cat = new Cat();

        u.showAnimalSound(dog);
        u.showAnimalSound(cat);
    }
}

abstract class Appliances {
    abstract void run();
}

class washingMachine extends Appliances {
    void run() {
        System.out.println("running..");
    }
}

public class abstraction {
    public static void main(String[] args) {
        Appliances a = new washingMachine();
        a.run();
    }
}
public class FourPillar {
    // Encapsulation 
    private double balance;

    public void setBalance(double balance){
        this.balance = balance;
    }
    public double getBalance(){
        return balance;
    }
    public void deposite(double amount){
        balance = balance+amount;
    }
    public void withdraw(double amount){
        balance -= amount;
    }
}

class main {
    public static void main(String[] args) {
        FourPillar bank = new FourPillar();

        bank.setBalance(20000.00);

        System.out.println(bank.getBalance());
        bank.deposite(1000);
        System.out.println("After Deposit 1000 avl balance: " + bank.getBalance());
        bank.withdraw(200);
        System.out.println("After withdraw avl balance: "+bank.getBalance());
    }
}
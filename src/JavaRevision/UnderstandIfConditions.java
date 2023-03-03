package JavaRevision;

public class UnderstandIfConditions {
    public static void main(String[] args) {
        double balance = 600;
        double amount = 5000;
        if (balance <=0 || amount > balance){
            System.out.println("Withdrawal has failed");
        } else {
            balance -= amount;
            System.out.println("Withdrawal has succeeded");
        }
    }
}

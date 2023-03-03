package JavaRevision;

public class UnderstandIfElse {
    public static void main(String[] args) {
        double balance = 10000;
        double amount = 50000;
        if (amount <=0){
            System.out.println("withdrawal has failed as the amount is negative");
        } else if (amount > balance) {
            System.out.println("withdrawal has failed as the balance is low");
        }else {
            balance -= amount;
            System.out.println("Withdrawal has succeeded");
        }
    }
}

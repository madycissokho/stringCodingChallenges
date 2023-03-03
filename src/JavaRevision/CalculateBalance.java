package JavaRevision;

public class CalculateBalance {


    public static void main(String[] args) {
        double balance = 2600;
        double amount = 1500, limit = 10000, minBal = 500;
        if (!(amount < 0)) {
            if (amount <= limit && (balance - amount) > minBal) {
                balance -= amount;
                System.out.println("Withdrawal has succeeded");
            } else {
                System.out.println("Withdrawal failed");
            }
        }
    }
}

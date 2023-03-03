package JavaRevision;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        double balance =0, minBal = 5000, depositAmt = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter the amount to be deposit");
            depositAmt = sc.nextDouble();
        }while (depositAmt < minBal);
             balance = depositAmt;
            System.out.println("Your deposit was successful");

    }
}

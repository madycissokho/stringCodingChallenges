package problemStatement;

import java.util.Scanner;
import java.util.stream.Stream;

public class calculation {
    /*
    Given 2 numbers N1, N2, Write a Java program to print the following
Sum of N1 and N2
Difference of N1 and N2
Product of N1 and N2
Quotient obtained by dividing N1 by N2
    * */
    public int calculateSum(int N1,int N2){
        return N1 + N2;
    }
    public int calculateDiff(int N1, int N2){
        return N1 - N2;
    }
    public int calculateProduct(int N1, int N2){
        return N1 * N2;
    }
    public int calculateQuotient(int N1, int N2){
        return N1 / N2;
    }

    public static void main(String[] args) {
        calculation sum = new calculation();
        int output= sum.calculateSum(10,30);
        System.out.println("Sum is " + output);
        System.out.println("==============");

       int difference = sum.calculateDiff(50, 30);
        System.out.println("Difference is " + difference);
        System.out.println("==============");

        int product = sum.calculateProduct(10,10);
        System.out.println("Product is " + product);
        System.out.println("==============");

        int quotient = sum.calculateQuotient(60,15);
        System.out.println("Quotient is "+ quotient);
        System.out.println("===============");

        Scanner in = new Scanner(System.in);
        String customerName = in.next();
        long mobileNumber= in.nextLong();
        String address = in.next();
        int items = in.nextInt();
        float cost = in.nextFloat();

        System.out.println("Name  :" + customerName);
        System.out.println("Mobile :" + mobileNumber);
        System.out.println("Address :" + address);
        System.out.println("Items :" + items);
        System.out.println("Cost :" + cost );

        in.close();

    }
}

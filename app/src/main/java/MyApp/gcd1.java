package MyApp;

import java.util.Scanner;

public class gcd1 {
    public static int findGCD(int a , int b) {
        while(b != 0)
        {
            if(a > b) {
                a = a - b;
            }
            else {
                b = b - a; }
        }
        return a;
    } //option1.1
    public static void main(String[] args) {
        int a, b, gcd = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number: ");
        if (sc.hasNextInt()) {
            a = sc.nextInt();
            System.out.print("Enter the Second Number: ");
            if (sc.hasNextInt()) {
                b = sc.nextInt();
                gcd = findGCD(a, b);
                System.out.println("GCD of " + a + " and " + b + " =  " + gcd);
            } else {
                System.out.println("only numbers are allowed..");
                gcd1.main(null);
            }
        } else {
            System.out.println("only numbers are allowed..");
                gcd1.main(null);
        }
    }
}

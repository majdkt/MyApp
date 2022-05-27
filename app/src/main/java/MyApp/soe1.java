package MyApp;

import java.util.Scanner;

public class soe1 {
    public static void main(String[] args) {
        System.out.println("Sieve of Eratosthenes");
        Scanner sc = new Scanner(System.in);
        System.out.println("Till which number should the list go?..");

        int num = 0;

        if (sc.hasNextInt()) {
            num = sc.nextInt();
        } else {
            System.out.println("Only numbers are allowed..");
        }

        boolean[] bool = new boolean[num];

        for (int i = 0; i < bool.length; i++) {
            bool[i] = true;
        }
        for (int i = 2; i < Math.sqrt(num); i++) {
            if (bool[i] == true) {
                for (int j = (i * i); j < num; j = j + i) {
                    bool[j] = false;
                }
            }
        }
        if (num != 0) {
            System.out.println("List of available prime numbers: ");
        }
        for (int i = 2; i < bool.length; i++) {
            if (bool[i] == true) {
                System.out.println(i);
            }
        }
    }
}

package MyApp;
import java.util.Scanner;

import static MyApp.App.*;
import static MyApp.gcd1.*;
import static MyApp.soe1.*;
import static MyApp.match1.*;
import static java.lang.System.exit;

public class Console1 {
    public static void printMenu(String[] options){
        for (String option : options){
            System.out.println(option);
        }
        System.out.print("Please choose a number for an option : ");
    }
    public static void main(String[] args) {
        String[] options = {"1. Greatest Common Divisor (GCD).",
                "2. Sieve of Eratosthenes.",
                "3. Search for a specific string in Linus Torvald's joke (String-Matching-Algorithm).",
                "0. Exit.",
        };
        Scanner scanner = new Scanner(System.in);
        int option = 1;
        while (option!=4){
            printMenu(options);
            try {
                option = scanner.nextInt();
                switch (option){
                    case 1: option1(); break;
                    case 2: option2(); break;
                    case 3: option3(); break;
                    case 0: exit(0);
                }
            }
            catch (Exception ex){
                System.out.println("Please enter an integer value between 1 and " + options.length);
                scanner.next();
            }
        }
    }
    // Options
    private static void option1() {
        System.out.println(" ****the greatest common divisor of two integers**** ");
        gcd();

    }
    private static void option2() {
        System.out.println("Numbers that can be divided by only 1 and itself ");
        soe1.main(null);
    }
    private static void option3() {
        System.out.println("Let's test if the word you write exists in this joke line: ");
        match1.main(null);}
}

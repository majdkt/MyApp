package MyApp;

import java.util.Scanner;

public class match1 {
    public static void main(String[] args) {

        String joke = "I’m an egotistical bastard, and I name all my projects after myself. First ‘Linux’, now ‘Git’";
        System.out.println(joke);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word please: ");
        String input = sc.nextLine();
        while (!input.matches("[a-zA-Z]+")) {
            System.out.println("Only letters are allowed..");
            input = sc.nextLine();
        }
        System.out.println("Does the joke contain the word " + "*"+input+"*"+
                " ?.."
                + joke.contains(input));
    }
}

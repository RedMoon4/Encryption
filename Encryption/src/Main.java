
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to the encryption generator!");
        System.out.println("Please enter a word you'd like to encrypt!");

        Scanner scan = new Scanner(System.in);
        String userChoice = scan.nextLine();

        String s = userChoice.substring(userChoice.length()-2);
        String s1 = userChoice.substring(0,userChoice.length()-2);

        System.out.println("\n" + " a&f"+ s1 + "!7g" + s + "*K3");
        System.out.println("\n" + "Original input: " + userChoice);

    }
}
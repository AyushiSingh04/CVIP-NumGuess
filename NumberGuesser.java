import java.util.*;
import java.util.Scanner;
import java.util.Random;

class NumberGuesser {
    public static void main(String[] args) {
        int ranNum = (int)(Math.random()*100);
        int count = 0;
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        String str = " ";
        do {
            System.out.println("Guess a number between 1 and 100");
            int num = s.nextInt();
            if (num == ranNum) {
                System.out.println("Your Guess is correct");
                count++;
                System.out.println("You took total " + count + " tries to get correct answer");
                break;
            } else if (num > ranNum) {
                System.out.println("Your Guess is Incorrect");
                System.out.println("Keep trying. Your current guess is higher than the actual number");
                count++;
                System.out.println("Do you want to guess again?");
                str = sc.nextLine();
            } else {
                System.out.println("Your Guess is Incorrect");
                System.out.println("Keep trying. Your current guess is lower than the actual number");
                count++;
                System.out.println("Do you want to guess again?");
                str = sc.nextLine();
            }
        } while (str.equals("y") || str.equals("Y"));

    }
}
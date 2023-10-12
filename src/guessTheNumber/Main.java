package guessTheNumber;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Guess the correct number in 10 attempt");

        // Generating a Random Number between 1 and 100 (both inclusive)
        int random = (int) Math.floor(Math.random() * 100);

        for(int i = 1; i <= 10; i++) {
            System.out.print("Enter your number (Attempt " + i + "): ");
            int n = sc.nextInt();
            if(n < random){
                System.out.println("Your number is smaller than my number");
            } else if(n > random){
                System.out.println("Your number is greater than my number");
            } else{
                System.out.println("Congrats! You match my number in " + i + " attempts");
                break;
            }
        }
    }
}
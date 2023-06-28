

import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    int mysteryNumber = (int)
            (Math.random()*10) +1; //random number between 1 and ten
        //System.out.println(mysteryNumber);
        int numberOfGuesses = 0;
        // creating variable to track number of guesses
        int guess = 0;
        //creating variable to track guess

        Scanner in = new Scanner(System.in);
        //calls on the scanner allowing user input
        while (guess != mysteryNumber) {
            System.out.print("guess a number from 1 & 10? ");
            guess = in.nextInt();
            //prints out asking for a guess and allows input on same line
            numberOfGuesses = numberOfGuesses +1;
            // adds 1 every time you make a guess

            if (guess < mysteryNumber){
                System.out.println("Too Small");
            }// if guess is too small, prints 'Too Small' to the console
            else if (guess > mysteryNumber) {
                System.out.println("Too Big!");
            }// if guess is too small, prints 'Too Big' to the console
            else  {
                System.out.println("Correct!");
            }//if guess is not to correct, will print out Correct


        }

        System.out.println("Number of Guesses:" + numberOfGuesses);
        // prints out number of guesses as you go along, outside the last bracket keeps counter
        // from displaying until loop ends (correct guess is made)

    }
}



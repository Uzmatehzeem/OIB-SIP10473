import java.util.Scanner;
public class numberguessing{
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 6;
        int i,num;
        System.out.println("A number is choosen" + " range between 1 to 100." + "Guess the number"  + " within 5 trials.");
        for (i = 0; i < K; i++) {
            System.out.println("Guess the number:");
            num = sc.nextInt();
            if (number == num) {
                System.out.println( "Congratulations!"+ " You guessed the number.");
                break;
            }
            else if (number >num && i != K - 1) {
              System.out.println( "The number is "+ "greater than " + num);
            }
            else if (number <num && i != K - 1) {
                System.out.println( "The number is"+ " less than " + num);
            }
        }
        if (i == K) {
            System.out.println( "You have exhausted" + " K trials.");
            System.out.println( "The number was " + number);
        }
    }  

     public static void main(String args[])
    {
        guessingNumberGame();
    }
}

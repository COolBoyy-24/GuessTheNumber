import java.util.Random;
import java.util.Scanner;

class game{
    private int CompRand;
    private int UserIn;
    private int Tries;

    Random rand = new Random();
    Scanner sc = new Scanner(System.in);

    public  game(){
        CompRand = rand.nextInt(1,101);
        System.out.println("\n\n\n\nYou Have to Make A Guess For A Number Between \"1 and 100\" to WIN ......... ");
        System.out.print("A number has been generated  !\n\n");
        System.out.println("Here We go With the Guesses !!");
//        System.out.println(CompRand);
    }

    public void takeUserInput(){
        System.out.format("LetssGo With Your %d Tryyy ..........",Tries);
        System.out.println("What's Your Guess ??");
        UserIn = sc.nextInt();
        System.out.println(UserIn + " Is Your Guess Alrightt !!\n");
        Tries++;
    }

    public void isCorrectGuess(){
        while (UserIn != 0) {
            if (UserIn == CompRand && Tries == 1){
                System.out.println("Damnn !! You are UNBELIEVABLE   .............  You Guessed the Number In Your First Tryy !!");
                System.out.println("Damnn !! You are UNBELIEVABLE   .............  You Guessed the Number In Your First Tryy !!");
                break;
            }
            else if (UserIn == CompRand) {
                System.out.println("Damnn !! You are UNBELIEVABLE   .............  You Guessed the Number  !!");
                System.out.println("Damnn !! You are UNBELIEVABLE   .............  You Guessed the Number  !!");
                System.out.println(" ___________________________________________________________________");
                System.out.println("|                               Score                               |");
                System.out.println("|                            -    "+Tries+"    -                            |");
                System.out.println(" -------------------------------------------------------------------");

                break;
            }
            while (UserIn > CompRand) {
                System.out.println("You guessed tha number but its Greater than The generated Number !!   ");
                System.out.println("Try Again");
                takeUserInput();
            }
            while (UserIn < CompRand) {
                System.out.println("You guessed tha number but its Less than The generated Number !!   ");
                System.out.println("Try Again");
                takeUserInput();
            }
        }
    }
}

public class GuessTheNumber {
    public static void main(String[] args) {
        game g = new game();
        g.takeUserInput();
        g.isCorrectGuess();
    }
}

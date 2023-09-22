import java.util.Scanner;

public class NumberGuessGame {

    static Scanner sc = new Scanner(System.in);

    static int score = 1;
    public static void main(String[] args) {
        while(true){
          int result = game();
          if(result == -2){
            System.out.println("you are breaking the rules.");
            System.out.println("Try again.");
          }
          else if(result == -1){
            System.out.println("you crossed the guessing limit.");
            System.out.println("try again");
          }
          else{
            System.out.println("congratulation, you guessed it.");
            System.out.println("your score is:" + (11-score) +" (out of 10)");
          }
          System.out.println();
          System.out.println("play again(enter 1)");
          System.out.println("exit(enter 2)");

          int f = sc.nextInt();
          System.out.println();
            
            if(f == 1){
              continue;
            }
            else
            break;
        }
    }
      
        
        

    static int random(){
        int max = 100;
        int min = 1;
        int a = (int)(Math.random()*(max - min + 1) + min);
        return a;
    }
    static int game(){
        int a = random();
        int check = 0;
        System.out.println();
        System.out.println("I have a random number from 1 to 100 for you guess the number.");
        System.out.println("Enter your guessed number");

          while(score < 10){
            int input = sc.nextInt();
              if(input > 100){
                if(check < 3){
                  System.out.println("Please guess a valid number");
                  check++;
                  continue;
                }
                else
                return -2;
              }

              if(a == input){
                return score;
              }
              else if(a < input){
                System.out.println("your guess is too high, Guess again");
              }
              else
                System.out.println("your guess is too low, Guess again");
                score ++;
              
          }
        
        return -1;
    
   }
}
    


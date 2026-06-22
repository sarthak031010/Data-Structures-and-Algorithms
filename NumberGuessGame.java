import java.util.Scanner;
import java.util.Random;
class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    Random rand = new Random();
    int RandomNumber = rand.nextInt(50)+1;

    for(int i = 1 ; i <=3 ; i++){
      System.out.print("Guess" + i + ": ");
      int guess = sc.nextInt();

      if(guess == RandomNumber){
        System.out.println("You Win...!");
        return;
      }

      else if (guess < RandomNumber){
        System.out.println("Too Low");
      }
      else{
        System.out.println("Too High");
      }
    }
    System.out.println("You Lose");
    System.out.println("The Number was : " + RandomNumber);
  }
}

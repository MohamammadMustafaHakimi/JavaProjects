import java.util.Scanner;
public class GuessingGame {

  public static int random() {
    int randomNum = (int) (Math.random() * 100) + 1;
    return randomNum;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    boolean flag = true;

    int winnerNumber = random();
    while(flag) {
      System.out.println("Please enter your number");
      int userInput = input.nextInt();

      if (userInput == winnerNumber) {
        System.out.println("you have found it!!!");
        flag = false;
      } else if (userInput > winnerNumber){
        System.out.println("Too high");
      } else {
        System.out.println("too low");
      }
    }

  }


}

public class GuessGame {

/**

 */
public static void main(String[] args) {


     int randNum , guessNum ;
     //Generates a random number from 1 to 10
     randNum = new java.util.Random().nextInt(10) + 1;
     System.out.println("Im thinking of a number from 1 to 10");

  for (guessNum = 0; guessNum <= 10; guessNum ++){

      java.util.Scanner scan = new java.util.Scanner(System.in);
      guessNum = scan.nextInt();

      if (guessNum == randNum) {
           System.out.println("you guess" + guessNum );
    }
  } 
}
}
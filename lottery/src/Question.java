import java.util.Random;
import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        Random rand = new Random();
        int digitOne = rand.nextInt(10);
        int digitTwo = rand.nextInt(10);
        String sOne = String.valueOf(digitOne);
        String sTwo = String.valueOf(digitTwo);
        String lotterynum = sOne+sTwo;
        System.out.println(digitOne);
        System.out.println(digitTwo);
        System.out.println(lotterynum);

        Scanner sc = new Scanner(System.in);
        System.out.print("enter first number :");
        String guessOne = sc.next();
        System.out.print("enter second number :");
        String guessTwo = sc.next();
         String guessnum =guessOne+guessTwo;
        if(lotterynum.equals(guessnum)){
            System.out.println(" you won the lottery !!! , your price is $10000");
        }else if(((sOne.equals(guessOne))||(sOne.equals(guessTwo))) && ((sTwo.equals(guessOne))||(sTwo.equals(guessTwo)))){
            System.out.println(" you got the numbers correct , your price is $3000");
        }else if(((sOne.equals(guessOne))||(sOne.equals(guessTwo))) || ((sTwo.equals(guessOne))||(sTwo.equals(guessTwo)))){
            System.out.println(" you got one number correct , your price is $1000");
        }else{
            System.out.println(" Sorry !, you lost.");
        }

    }
}

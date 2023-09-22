import java.util.InputMismatchException;
import java.util.Scanner;

public class GuessRandomNumber {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("welcome to the guessing game! The computer is creating a random number and your mission is to guess the correct number! Good luck");
        int randomNum = printRandomNum();
        System.out.println(randomNum);

        while (true) {
            try {

                int exitProgram = 0;
                int number = scan.nextInt();

                if (number == exitProgram) {
                    System.out.println("you have chosen to exit the program");
                    break;

                } else if (number == randomNum) {
                    System.out.println("Congratulations you guessed the correct random number! you are a lucky person :)");
                    break;

                } else if (higher(number) < randomNum) {
                        System.out.println("the correct number are higher then your input, try again");

                } else if (lower(number) > randomNum) {
                    System.out.println("the correct number are lower then your input, try again");

                }
            } catch (InputMismatchException e) {
                String input = scan.next();
                if (input.equals("0")) {
                    break;
                }
                System.out.println("invalid input, please try again(catch)");
                scan.nextLine();
            }
        }

    }

    static int printRandomNum() {
        int randomNum = (int) (Math.random() * 100) + 2;
        return randomNum;
    }

    static int higher(int a) {
        int higher = a;
        return higher;
    }
    static int lower(int a) {
        int lower = a;
        return lower;
    }

}



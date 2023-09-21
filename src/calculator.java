import java.util.InputMismatchException;
import java.util.Objects;
import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        while (true) {
            try {


                System.out.println("Calculator Menu:\n" +
                        "1. Addition (+) press 1\n" +
                        "2. Subtraction (-) press 2\n" +
                        "3. Multiplication (*) press 3\n" +
                        "4. Division (/) press 4\n" +
                        "5. Exit the program press 5\n" +
                        "Enter your choice down below");

                int addition = 1;
                int subtraction = 2;
                int multiplication = 3;
                int division = 4;
                int exit = 5;
                int option = scan.nextInt();
                char yes = 'Y';
                char no = 'N';


                if (option == addition) {
                    for (int i = 0; true; i++) {
                        System.out.println("type the number");
                        addition(scan.nextInt(), scan.nextInt());
                        System.out.println("continue " + yes + " or " + no + " ?");
                        char answer = scan.next().charAt(0);

                        if (answer == no) {
                            break;
                        }

                    }
                }
                else if (option == subtraction) {
                    for (int i = 0; true; i++) {
                        subtraction(scan.nextInt(), scan.nextInt());
                        System.out.println("continue " + yes + " or " + no + " ?");
                        char answer = scan.next().charAt(0);

                        if (answer == no) {
                            break;
                        }
                    }
                }

                else if (option == multiplication) {
                    for (int i = 0; true; i++) {
                        multiplication(scan.nextInt(), scan.nextInt());
                        System.out.println("continue " + yes + " or " + no + " ?");
                        char answer = scan.next().charAt(0);

                        if (answer == no) {
                            break;
                        }
                    }
                }
                else if (option == division) {
                    for (int i = 0; true; i++) {
                        division(scan.nextInt(), scan.nextInt());
                        System.out.println("continue " + yes + " or " + no + " ?");
                        char answer = scan.next().charAt(0);

                        if (answer == no) {
                            break;
                        }
                    }
                }
                else {
                    if (option == exit) {
                        System.out.println("""
                                You have decided to exit the program,
                                thank you for using me as your calculator,
                                hope to seen you soon again!""");
                        break;
                    }
                }

            } catch (InputMismatchException e) {
                System.out.println("invalid input! please try again");
                System.out.println("-------------------------------");
                scan.nextLine();
            }


        }
    }



    static void addition(int a, int b) {
        double add = a + b;
        System.out.println("You add " + a + " + " + b + " = " + add);
    }

    static void subtraction(int a, int b) {
        double subtract = a - b;
        System.out.println("You subtracted " + a + " - " + b + " = " + subtract);
    }
    static void multiplication(int a, int b) {
        double result = a * b;
        System.out.println("You multiply " + a + " * " + b + " = " + result);
    }

    static void division(int a, int b) {
        double divide = a / b;
        System.out.println("You divide " + a + " / " + b + " = " + divide);
    }
}
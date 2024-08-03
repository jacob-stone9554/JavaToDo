import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int continueLoop = 1;

        while (continueLoop != 0) {
            System.out.println("Welcome to the ToDo App!");
            System.out.println("Enter 1 to continue! \nEnter 0 to exit!");
            System.out.print("Please make a selection: ");
            continueLoop = sc.nextInt();
        }

        System.out.print("Goodbye!");
    }
}
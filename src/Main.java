import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Task task = new Task();
        int continueLoop = 1;

        while (continueLoop != 0) {
            System.out.println("Welcome to the ToDo App!");
            System.out.println("Enter 1 to create a new task! \nEnter 2 to view existing tasks! \nEnter 0 to exit!");
            System.out.print("Please make a selection: ");
            continueLoop = sc.nextInt();
            System.out.print("\n");

            if(continueLoop == 1) {
                //call method to create task
                task = createTask(sc);
            }
            else if (continueLoop == 2) {
                task.printDetails();
            }
            System.out.print("\n");
        }

        System.out.print("Goodbye!");
    }

    public static Task createTask(Scanner sc) {
        Task t = new Task(); //create a task to populate
        String temp = ""; // a string that will hold the values passed into the task

        //clear the buffer of the scanner (if present)
        if(sc.hasNextLine()) {
            sc.nextLine();
        }

        System.out.print("Enter the name of your task: ");
        temp = sc.nextLine();
        t.setTitle(temp);

        System.out.print("Enter a description of your task: ");
        temp = sc.nextLine();
        t.setDescr(temp);

        System.out.print("Enter the due date of your task: ");
        temp = sc.nextLine();
        t.setDueDate(temp);

        System.out.print("Enter the category of your task: ");
        temp = sc.nextLine();
        t.setCategory(temp);

        t.setCompleted(false);

        return t;
    }
}
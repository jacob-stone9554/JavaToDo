import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        Task task = new Task();
        int continueLoop = 1;

        while (continueLoop != 0) {
            System.out.println("Welcome to the ToDo App!");
            System.out.println("Enter 1 to create a new task! \nEnter 2 to view existing tasks! \nEnter 3 to edit an existing task! \nEnter 0 to exit!");
            System.out.print("Please make a selection: ");
            continueLoop = sc.nextInt();
            System.out.print("\n");

            //process menu selections
            if(continueLoop == 1) {
                //call method to create task
                task = createTask(sc);
            }
            else if (continueLoop == 2) {
                task.printDetails();
            }
            else if(continueLoop == 3) {
                //call method to edit task
                task = editTask(sc, task);
            }
            System.out.print("\n");
        }

        System.out.print("Goodbye!");
    }

    /**
     *
     * @param sc the Scanner used to receive input from the user
     * @return Task t, a task populated by user input
     */
    public static Task createTask(Scanner sc) {
        Task t = new Task(); //create a task to populate
        String temp = ""; // a string that will hold the values passed into the task

        //clear the buffer of the scanner (if present)
        clearBuffer(sc);

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
        temp = "";

        return t;
    }

    public static Task editTask(Scanner sc, Task task) {
        Task t = task;
        int choice;
        String temp;

        //clear the buffer of the scanner (if present)
        clearBuffer(sc);

        System.out.print("Enter 1 to edit task name! \nEnter 2 to edit task description! \nEnter 3 to edit task due date!" +
                "\nEnter 4 to edit task category! \nEnter 5 to edit task completion status! \nEnter 6 to cancel!");
        choice = sc.nextInt();

        while(choice != 6) {
            clearBuffer(sc);

            if(choice == 1) {
                //edit name
                System.out.print("Enter new task title: ");
                temp = sc.nextLine();
                t.setTitle(temp);
            }
            else if(choice == 2) {
                //edit description
                System.out.print("Enter new task description: ");
                temp = sc.nextLine();
                t.setDescr(temp);
            }
            else if(choice == 3) {
                //edit due date
                System.out.print("Enter new task due date: ");
                temp = sc.nextLine();
                t.setDueDate(temp);
            }
            else if(choice == 4) {
                //edit category
                System.out.println("Enter new task category: ");
                temp = sc.nextLine();
                t.setCategory(temp);
            }
            else if(choice == 5) {
                //edit completion
                System.out.print("Enter new completion status (type yes or no)");
                temp = sc.nextLine();
                if(temp.toLowerCase().equals("yes")){
                    t.setCompleted(true);
                }
                else if(temp.toLowerCase().equals("no")) {
                    t.setCompleted(false);
                }
                else {
                    System.out.println("ERROR! UNKNOWN COMPLETION DESIGNATION! Please try again.");
                }
            }
            else {
                System.out.println("ERROR! INVALID CHOICE!");
            }

            System.out.print("Enter 1 to edit task name! \nEnter 2 to edit task description! \nEnter 3 to edit task due date!" +
                    "\nEnter 4 to edit task category! \nEnter 5 to edit task completion status! \nEnter 6 to cancel!");
            choice = sc.nextInt();
        }

        return t;
    }

    public static void clearBuffer(Scanner sc) {
        sc.nextLine();
    }
}
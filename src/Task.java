public class Task {
    private String title;
    private String descr;
    private String dueDate;
    private String category;
    private boolean isCompleted;

    //default constructor
    public Task() {
        title = "";
        descr = "";
        dueDate = "";
        category = "";
        isCompleted = false;
    }

    //overloaded constructor to assign tasks

    /**
     *
     * @param title the title of the task
     * @param descr the description of the task
     * @param dueDate the date in which the task is due
     * @param category the category of the task
     */
    public Task(String title, String descr, String dueDate, String category) {
        this.title = title;
        this.descr = descr;
        this.dueDate = dueDate;
        this.category = category;
        this.isCompleted = false; //your task is not going to be done when you are creating it, this needs to be false
    }

    //getters

    /**
     *
     * @return the title of the task
     */
    public String getTitle() {
        return title;
    }

    /**
     *
     * @return the description of the task
     */
    public String getDescr() {
        return descr;
    }

    /**
     *
     * @return the due date of the task
     */
    public String getDueDate() {
        return dueDate;
    }

    /**
     *
     * @return the category of the task
     */
    public String getCategory() {
        return category;
    }

    /**
     *
     * @return get the completion status of the task
     */
    public boolean getIsCompleted() {
        return isCompleted;
    }

    //setters

    /**
     *
     * @param title the new title of the task
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     *
     * @param descr the new description of the task
     */
    public void setDescr(String descr) {
        this.descr = descr;
    }

    /**
     *
     * @param dueDate the new due date of the task
     */
    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    /**
     *
     * @param category the new category of the task
     */
    public void setCategory(String category) {
        this.category = category;
    }

    /**
     *
     * @param isCompleted the new completion status of the task
     */
    public void setCompleted(boolean isCompleted) {
        this.isCompleted = isCompleted;
    }

    /**
     * Format and print the details of the task
     */
    public void printDetails() {
        if(isCompleted) {
            System.out.println("Task: " + title + "\nDescription: " +  descr + "\nCategory: " + category + "\nDue Date: " + dueDate + "\nCompletion Status: Completed");
        }
        else {
            System.out.println("Task: " + title + "\nDescription: " +  descr + "\nCategory: " + category + "\nDue Date: " + dueDate + "\nCompletion Status: Not Yet Completed\n");
        }
    }
}

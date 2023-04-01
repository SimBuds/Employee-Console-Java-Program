// Casey Hsu - 101376814
import java.util.Scanner;
public class Manager {
    public int numEmployees;
    public int maxEmployees;
    public Employee [] employeeList;
    public Manager() {
        this.numEmployees = 0;
        this.maxEmployees = 10;
        this.employeeList = new Employee[maxEmployees];
    }
    public void displayMenu(){
        // Scanner object held in userInput
        Scanner userInput = new Scanner(System.in);

        // Defining my Manager Class Array with size of 10
        Manager employeeList = new Manager();

        // Declaring menu selection variable
        int menuSelection;

        // Do-While loop to have my menu keep looping until 4 is entered by user
        do {
            // My crude looking menu
            System.out.println("\n----Welcome to Casey's Employee Database----");
            System.out.println("--------------------:)----------------------");
            System.out.println("Please choose from the following menu items:");
            System.out.println("1. Add an Employees.");
            System.out.println("2. Generate a Payrolls.");
            System.out.println("3. Find an Employee information");
            System.out.println("4. Exit");
            System.out.println("--------------------:)----------------------");
            // Taking user selection
            menuSelection = Integer.parseInt(userInput.next());

            // I chose to use a switch statement for my menu selection
            switch (menuSelection) {
                case 1:
                    System.out.println("\n---Welcome to the Employee Adding System---\n");
                    // Call to add employee function
                    employeeList.addEmployee();
                    break;
                case 2:
                    System.out.println("\n---Welcome to the Employee Payroll System---\n");
                    // Call to print payroll function
                    employeeList.printPayroll();
                    break;
                case 3:
                    System.out.println("\n--Welcome to the Employee Searching System--\n");
                    // Asking user to enter the employee ID that they want to search for
                    int empId = Integer.parseInt(userInput.next());
                    // Call to find Employee function
                    employeeList.findEmployee(empId);
                    break;
                case 4:
                    // Exit Program
                    System.out.println("\n--Thanks for using Casey's Employee Database--\n");
                    break;
                default:
                    // Default message to user that selects a number out of the scope
                    System.out.println("\nInvalid menu choice please choose again.\n");
            }
        }while (menuSelection != 4); // While menuSelection is not 4
    }
    public void addEmployee() {
        // Taking user input into scanner object
        Scanner userInput = new Scanner(System.in);

        // Creating an if loop evaluating the max to num employees in the system
        if (numEmployees < maxEmployees) {
            // This is my solution for assigning a primary key by default
            int primaryKey = numEmployees;
            primaryKey++;
            // Welcome Message
            System.out.println("\n---Welcome to the Employee Payroll System---\n");
            // Creating temp variables that will be later fed to the object constructor
            System.out.println("Please enter Employee First Name:");
            String fName = userInput.nextLine();
            System.out.println("Please enter Employee Last Name:");
            String lName = userInput.nextLine();
            System.out.println("Please enter Employee Annual Salary:");
            // I was having issues with next() so I switched to nextLine and parsed the user's int input
            int salary = Integer.parseInt(userInput.nextLine());
            System.out.println("Please enter Employee Street Name:");
            String sName = userInput.nextLine();
            System.out.println("Please enter Employee Zip Code:");
            String zip = userInput.nextLine();
            System.out.println("Please enter Employee City:");
            String city = userInput.nextLine();
            System.out.println("Please enter Employee Province:");
            String province = userInput.nextLine();
            System.out.println("Please enter Employee Country:");
            String country = userInput.nextLine();
            // This is the call to the contractor to make a new object at current employee number
            employeeList[numEmployees] = new Employee(primaryKey, fName, lName, salary,
                    new Residence(sName, city, zip, province, country));
            // This toString output is to confirm the adding of the employee
            System.out.println(employeeList[numEmployees].toString());
            // Counter is adding one everytime an employee has been successfully added
            numEmployees++;
            } else System.out.println("Sorry the Database is full.");
              // Error message indicating to user system is full
        }
    public void printPayroll() {
        // Declaring that my temp variable starts at 0 outside the loop
        float yearSalary = 0;
        // Declaring the variables that will hold employees pay total for the year and monthly
        if (numEmployees <= maxEmployees){
        for (int i = 0; i < numEmployees; i++) {
            // Using the getter method in the Employee class to assign to the temp variable salary
            float salary = employeeList[i].getEmpAnnualSalary();
            // Year salary variable will hold total after loop
            yearSalary = yearSalary + salary;
        }
        /*I am making the assumption that the output that was requested
        in the assignment is yearly total and monthly total */
        float monthSalary = yearSalary / 12;
        System.out.println("The amount owed for the month is: $" + monthSalary);
        System.out.println("The total amount owed for the year is: $" + yearSalary);
        }
    }
    public void findEmployee(int empId) {
        // Find Employee by empId
        for (int i = 0; i < numEmployees; i++) {
            // If the user inputs a user id that matches then we will display the information
            // Outputting to my overridden Employee toString method
            if (employeeList[i].getEmpId() == empId) {
                System.out.println(employeeList[i].toString());
            }
        }
    }
}
// Casey Hsu - 101376814
import java.util.Scanner;

public class Menu {

    public void displayMenu() {
        Scanner scan = new Scanner(System.in);
        String choice;

        while (true) {
            // Display the menu
            System.out.println("\n\t=========== Compilation Main Menu ===========");
            System.out.println("\t[0] Sum and Product");
            System.out.println("\t[1] Odd or Even Checker");
            System.out.println("\t[2] Find the Largest Number");
            System.out.println("\t[3] Remove Duplicates");
            System.out.println("\t[4] Node List Operations");
            System.out.println("\t[5] Stack with Arrays");
            System.out.println("\t[6] Stack with Linked List");
            System.out.println("\t[7] Convert Infix to Postfix");
            System.out.println("\t[8] Queue with Arrays");
            System.out.println("\t[9] Queue with Linked List");
            System.out.println("\t[x] Exit Program");
            System.out.println("\t=============================================");
            System.out.print("Enter your choice: ");
            choice = scan.nextLine().trim(); // Trim input for extra safety
            System.out.println();

            // Handle the choice
            switch (choice) {
                case "0":
                    // Code for Sum and Product
                    break;
                case "1":
                    // Code for Odd or Even Checker
                    break;
                case "2":
                    // Code for Find the Largest Number
                    break;
                case "3":
                    // Code for Remove Duplicates
                    break;
                case "4":
                    // Code for Node List Operations
                    break;
                case "5":
                    // Code for Stack with Arrays
                    break;
                case "6":
                    // Code for Stack with Linked List
                    break;
                case "7":
                    // Code for Convert Infix to Postfix
                    break;
                case "8":
                    // Code for Queue with Arrays
                    break;
                case "9":
                    // Code for Queue with Linked List
                    break;
                case "x":
                case "X":
                    System.out.println("Exiting Program...");
                    scan.close();
                    return; // Exit the method
                default:
                    System.out.println("Invalid choice! Please try again.");
                    break;
            }
        }
    }
}

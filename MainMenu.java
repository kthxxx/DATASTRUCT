import java.util.*;

public class MainMenu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String choice;

        do {
            System.out.println("\n\t=========== Compilation Main Menu ===========");
            System.out.println("\t[1] Queue with Linked List");
            System.out.println("\t[2] Queue with Arrays");
            System.out.println("\t[3] Node List Operations");
            System.out.println("\t[4] Convert Infix to Postfix");
            System.out.println("\t[5] Sum and Product");
            System.out.println("\t[6] Odd or Even Checker");
            System.out.println("\t[7] Stack with Arrays");
            System.out.println("\t[8] Stack with Linked List");
            System.out.println("\t[9] Remove Duplicates");
            System.out.println("\t[10] Find the Largest Number");
            System.out.println("\t[x] Exit Program");
            System.out.println("\t=============================================");
            System.out.print("Enter your choice: ");
            choice = scan.nextLine();
            System.out.println();

            switch (choice) {
                case "1":
                    // Queue Node
                    System.out.println("Queue Node Program selected. \n");
                    QueueNode.menuQueueNode(scan);
                    break;

                case "2":
                    // Queue Array
                    System.out.println("Queue Array Program selected. \n");
                    QueueArray.menuQueueArray(scan);
                    break;

                case "3":
                    // Node List
                    System.out.println("Node List Program selected. \n");
                    NodeList.nodeList(scan);
                    break;

                case "4":
                    // Infix to Postfix
                    System.out.println("Infix to Postfix Program selected. \n");
                    InfixtoPostfix.menuInfixToPostfix(scan);
                    break;

                case "5":
                    // Sum and Product
                    System.out.println("Sum and Product Program selected. \n");
                    SumAndProd.SumAndProduct(scan);
                    break;

                case "6":
                    // Odd and Even
                    System.out.println("Odd and Even Program selected. \n");
                    OddAndEven.runOddAndEven(scan);
                    break;

                case "7":
                    // Stack Array
                    System.out.println("Stack Array Program selected. \n");
                    StackArray.stackArray(scan);
                    break;

                case "8":
                    // Stack Node
                    System.out.println("Stack Node Program selected. \n");
                    StackList.stackList(scan);
                    break;

                case "9":
                    // No Duplicate
                    System.out.println("No Duplicate Program selected. \n");
                    noDupelicates.noDuplicate(scan);
                    break;

                case "10":
                    // Largest Number
                    System.out.println("Largest Program selected. \n");
                    LargestNum.findLargest(scan);
                    break;

                case "x":
                case "X":
                    System.out.println("Exiting the Program...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again. \n");
            }
        } while (!choice.equalsIgnoreCase("x"));

        scan.close();
    }
}

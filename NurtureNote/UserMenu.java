import java.util.Scanner;

public class UserMenu {
    private Scanner scanner;

    public UserMenu() {
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        int choice;
        do {
            System.out.println("\nWelcome to NurtureNote");
            System.out.println("1. View Profile");
            System.out.println("2. Input Data");
            System.out.println("3. View Suggestions");
            System.out.println("4. View History");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    new ViewProfile().viewProfile();
                    break;
                case 2:
                    new UserInput().inputData();
                    break;
                case 3:
                    new Suggestion().showSuggestions();
                    break;
                case 4:
                    new History().displayHistory();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);
    }
}
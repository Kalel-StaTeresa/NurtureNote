import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class History {
    public void displayHistory() {
        try (BufferedReader reader = new BufferedReader(new FileReader("user_history.txt"))) {
            String line;
            System.out.println("User History:");
            System.out.printf("%-20s %-5s %-10s %-10s %-10s %-20s\n", "Name", "Age", "Height", "Weight", "BMI", "Date");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Error displaying history: " + e.getMessage());
        }
    }
}

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private String name;
    private int age;
    private double height;
    private double weight;
    private double bmi;
    private String date;

    // Constructor for input data
    public User(String name, int age, double height, double weight) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
        this.date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    // Default constructor for loading data
    public User() {}

    public void calculateBmi() {
        this.bmi = weight / Math.pow(height / 100, 2);
    }

    public void saveData() throws IOException {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("user_history.txt", true))) {
            writer.write(String.format("%-20s %-5d %-10.2f %-10.2f %-10.2f %-20s\n", name, age, height, weight, bmi, date));
        }
    }

    public boolean loadUserData() {
        try (BufferedReader reader = new BufferedReader(new FileReader("user_history.txt"))) {
            String latestLine = null;
            String currentLine;
    
            // Iterate through all lines to find the last one
            while ((currentLine = reader.readLine()) != null) {
                latestLine = currentLine; // Update latestLine with each new line
            }
    
            if (latestLine != null) {
                String[] data = latestLine.split("\\s+");
                if (data.length < 6) {
                    System.out.println("Malformed user data line: " + latestLine);
                    return false;
                }
                this.name = data[0];
                this.age = Integer.parseInt(data[1]);
                this.height = Double.parseDouble(data[2]);
                this.weight = Double.parseDouble(data[3]);
                this.bmi = Double.parseDouble(data[4]);
                this.date = data[5];
                return true;
            } else {
                System.out.println("No data found in the file.");
            }
        } catch (IOException | NumberFormatException e) {
            System.out.println("Error loading user data: " + e.getMessage());
        }
        return false;
    }
    

    // Getters
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public double getBmi() {
        return bmi;
    }
}

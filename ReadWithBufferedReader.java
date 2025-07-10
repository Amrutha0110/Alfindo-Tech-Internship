import java.io.BufferedReader; // For efficient reading of characters, arrays, and lines
import java.io.FileReader;    // For reading character files
import java.io.IOException;     // For handling I/O errors

public class ReadWithBufferedReader {
    public static void main(String[] args) {
        String fileName = "sample.txt"; // The name of the file to read

        // Use try-with-resources to ensure the BufferedReader is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            System.out.println("Contents of " + fileName + ":");
            // Read each line until the end of the file (readLine() returns null)
            while ((line = reader.readLine()) != null) {
                System.out.println(line); // Display the line on the console
            }
        } catch (IOException e) { // Catch IOException if the file can't be found or read
            System.err.println("Error reading the file: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }
}

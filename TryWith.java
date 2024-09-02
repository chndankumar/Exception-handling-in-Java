package Exception;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TryWith {
    public static void main(String[] args) {
        String fileName = "file.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            // Print stack trace for debugging
            e.printStackTrace();
        }
    }
}

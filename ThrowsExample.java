package Exception;

import java.io.*;

public class ThrowsExample {
    // Method that declares it might throw an IOException
    public void readFile(String filePath) throws IOException {
        FileReader file = new FileReader(filePath);
        BufferedReader fileInput = new BufferedReader(file);

        String line = fileInput.readLine();
        System.out.println(line);

        fileInput.close();
    }

    // Method that calls readFile and rethrows any IOException
    public void processFile(String filePath) throws IOException {
        readFile(filePath); // If IOException occurs, it's thrown to the caller
    }

    public static void main(String[] args) {
        ChainExample example = new ChainExample();
        try {
            example.processFile("test.txt"); // This might throw IOException
        } catch (IOException e) {
            // Handling the IOException in the main method
            System.out.println("An error occurred: " + e.getMessage());
        }
    }
}

// Package declaration
package ex20_ScannerClassAndExceptionHandling;

// Required imports for file handling and checked exceptions
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

// Main class to demonstrate checked exceptions (like FileNotFoundException and IOException)
public class Ex5_CheckedException {

    // Main method - throws IOException to handle checked exceptions that may not be caught explicitly
    public static void main(String[] args) throws IOException {

        // ============================
        // Approach 1 - Using try-catch block
        // ============================

        /*
        try {
            // Create FileReader to open the file at the given relative path
            FileReader file = new FileReader("./src/main/java/ex20_ScannerClassAndExceptionHandling/Test.txt");

            // Read and print the first line from the file using BufferedReader
            System.out.println(new BufferedReader(file).readLine());
        }

        // Catch block that handles any IO-related exception including FileNotFoundException
        // Since FileNotFoundException is a subclass of IOException, catching IOException is enough
        catch(IOException e)
        {
            // This message will be printed if an exception occurs (e.g., file not found or read error)
            System.out.println("Handled exception...");
        }
        */

        /*
        // ALTERNATIVE: Separate catch blocks for FileNotFoundException and IOException
        // Use this if you want to handle each type differently (optional)

        catch(FileNotFoundException e)
        {
            // Will execute only if file is not found
            System.out.println("File not found...");
        }

        catch(IOException e)
        {
            // Will execute for other I/O issues (e.g., problems reading the file)
            System.out.println("IO exception occurred...");
        }
        */


        // ============================
        // Approach 2 - Using throws keyword
        // ============================

        // This block skips try-catch and declares that main method might throw IOException
        // If an exception occurs, it is not handled in the program and will crash unless handled externally

        // Attempting to open a file for reading
        FileReader file = new FileReader("./src/main/java/ex20_ScannerClassAndExceptionHandling/Test1.txt");

        // Read and print the first line from the file
        System.out.println(new BufferedReader(file).readLine());
    }
}

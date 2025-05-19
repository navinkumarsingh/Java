package Day04_ConditionalStatements;

import java.util.Scanner; // Importing Scanner class to take user input

public class Ex14_DomainTypeCheckerSwitchCase  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Creating Scanner object to read input
        System.out.println("Enter Domain name"); // Prompting user to enter a domain name
        String domain = sc.nextLine(); // Storing user input as a string

        // Extracting the domain extension (part after the last dot ".")
        // +1 moves the starting position one step ahead of the last dot (.), so we skip the dot itself.
        String ext = domain.substring(domain.lastIndexOf(".") + 1);// Extracting substring after the last '.'

        // Using switch-case to determine the type of website based on the extension
        switch (ext) {
            case "com":
                System.out.println("Commercial"); // If extension is "com", it's a commercial website
                break;
            case "gov":
                System.out.println("Government"); // If extension is "gov", it's a government website
                break;
            case "net":
                System.out.println("Network"); // If extension is "net", it's a network-related website
                break;
            case "org":
                System.out.println("Organisation"); // If extension is "org", it's an organization website
                break;
            default:
                System.out.println("Invalid extension"); // If extension doesn't match, it's invalid
        }

        sc.close(); // Closing the scanner to prevent memory leak
    }
}

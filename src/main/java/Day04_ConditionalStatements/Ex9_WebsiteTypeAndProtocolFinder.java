package Day04_ConditionalStatements;

import java.util.Scanner;

public class Ex9_WebsiteTypeAndProtocolFinder {
    public static void main(String[] args) { // Main method, program execution starts here
        Scanner sc = new Scanner(System.in); // Creating a Scanner object to take input from the user

        System.out.println("Enter a URL:"); // Prompting user to enter a URL
        String url = sc.nextLine(); // Reading the full URL as a string

        // Extracting the protocol (part before ":")
        String protocol = url.substring(0, url.indexOf(":")); // Getting substring before ':'

        // Checking which protocol is being used
        if (protocol.equalsIgnoreCase("http")) { // If protocol is "http"
            System.out.println("Hypertext Transfer Protocol");
        }else if (protocol.equalsIgnoreCase("https")) { // If protocol is "http"
            System.out.println("Hypertext Transfer Protocol");
        }
        else if (protocol.equalsIgnoreCase("ftp")) { // If protocol is "ftp"
            System.out.println("File Transfer Protocol");
        } else { // If protocol is neither "http" nor "ftp"
            System.out.println("Not a Valid Protocol");
        }

        // Extracting the domain extension (part after the last dot ".")
        // +1 moves the starting position one step ahead of the last dot (.), so we skip the dot itself.
        String ext = url.substring(url.lastIndexOf(".") + 1); // Extracting substring after the last '.'

        // Checking the type of website based on its extension
        if (ext.equalsIgnoreCase("com")) { // If extension is "com"
            System.out.println("Commercial");
        } else if (ext.equalsIgnoreCase("org")) { // If extension is "org"
            System.out.println("Organization");
        } else if (ext.equalsIgnoreCase("gov")) { // If extension is "gov"
            System.out.println("Government");
        } else { // If extension doesn't match known types
            System.out.println("Not a Valid Extension");
        }

        sc.close(); // Closing the Scanner to prevent memory leaks
    }
}

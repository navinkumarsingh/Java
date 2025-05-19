// Package declaration - This helps organize related classes together in a folder-like structure.
package Day06_Arrays;

// Class declaration - A class is a blueprint for Java programs.
public class Ex3_TwoDimensionalArrayUsingEnhancedForLoop {

    // The main method - This is where the program starts execution.
    public static void main(String[] args) {

        // Declaring and initializing a 2D array (array of arrays)
        // Each inner array represents a row, and elements inside them are columns.
        int row[][] = {
                {100, 200},      // First row with 2 elements
                {300, 400},      // Second row with 2 elements
                {500, 600, 700}  // Third row with 3 elements (jagged array)
        };

        // Printing the number of rows in the 2D array (outer array length)
        System.out.println("Rows of an array: " + row.length);

        // Printing the number of columns in each row
        // Since this is a jagged array (rows have different column counts), we check each row separately.
        System.out.println("Columns count of first row of an array: " + row[0].length);
        System.out.println("Columns count of second row of an array: " + row[1].length);
        System.out.println("Columns count of third row of an array: " + row[2].length);

        // Using an enhanced for loop (also called "for-each loop") to iterate through the 2D array
        // The outer loop iterates through each row (which is an array itself)
        for (int arr[] : row) {

            // The inner loop iterates through elements (columns) of the current row
            for (int x : arr) {
                // Printing each element followed by a space
                System.out.print(x + " ");
            }
            // Moving to the next line after printing all elements in a row
            System.out.println();
        }
    }
}

/*
Explanation for Beginners:
2D Array Initialization: int row[][] is a 2D array where each row can have a different number of columns.

Finding Size: row.length gives the number of rows, and row[i].length gives the column count for the i-th row.

Enhanced For Loop: This loop is used to traverse the array easily, without worrying about indexes.

Printing Elements: The nested loop prints all values row-wise.
 */
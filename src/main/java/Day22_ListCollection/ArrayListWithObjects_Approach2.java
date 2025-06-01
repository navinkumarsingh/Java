package Day22_ListCollection;
// Import only what is needed
import java.util.ArrayList;
import java.util.Iterator;

    // Define the Student class
    class Students {
        // Private fields to follow encapsulation
        private int rollno;
        private String name;
        private int age;

        // Constructor to initialize a Student object
        public Students(int rollno, String name, int age) {
            this.rollno = rollno;
            this.name = name;
            this.age = age;
        }

        // Getter method for roll number
        public int getRollno() {
            return rollno;
        }

        // Getter method for name
        public String getName() {
            return name;
        }

        // Getter method for age
        public int getAge() {
            return age;
        }

        // Override toString() method to provide a clean string representation
        @Override
        public String toString() {
            return rollno + " " + name + " " + age;
        }
    }

    // Main class with the entry point
    public class ArrayListWithObjects_Approach2 {
        public static void main(String[] args) {
            // Create Student objects
            Students std1 = new Students(101, "Ved", 21);
            Students std2 = new Students(102, "Vedika", 22);
            Students std3 = new Students(103, "Navin", 23);

            // Create an ArrayList to store Student objects
            ArrayList<Students> studentList = new ArrayList<>();

            // Add Student objects to the list
            studentList.add(std1);
            studentList.add(std2);
            studentList.add(std3);

            // ----- Reading data using enhanced for-loop -----
            System.out.println("Reading using for-each loop:");
            for (Students student : studentList) {
                // Print the student using toString() method
                System.out.println(student);
            }

            // ----- Reading data using Iterator -----
            System.out.println("\nReading using Iterator:");
            Iterator<Students> itr = studentList.iterator();
            while (itr.hasNext()) {
                Students st = itr.next();  // No need for typecasting due to generics
                System.out.println(st);
            }
        }
    }



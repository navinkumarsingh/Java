package Ex14_StaticKeyword;

public class Ex3_ObjectCounter {

    // Static variable shared by all instances to keep track of object count
    static int count = 0;

    // Constructor that increments the static count variable every time an object is created
    Ex3_ObjectCounter() {
        count++; // Increase the counter when a new object is created
    }

    // Static method to return the number of objects created
    static int objectCounter() {
        return count;
    }

    public static void main(String[] args) {
        // Creating three objects of the class
        Ex3_ObjectCounter obj1 = new Ex3_ObjectCounter();
        Ex3_ObjectCounter obj2 = new Ex3_ObjectCounter();
        Ex3_ObjectCounter obj3 = new Ex3_ObjectCounter();

        // Calling the static method to get the total object count
        int objectCount = objectCounter();

        // Printing the number of objects created
        System.out.println("Total number of objects created: " + objectCount);
    }
}

package Day13_Polymorphism;

public class Ex3_OverloadMainMethod {
        // Standard main method — entry point
        public static void main(String[] args) {
            Ex3_OverloadMainMethod ov = new Ex3_OverloadMainMethod();
            System.out.println("Main with String[] args");
            // Calling overloaded main methods manually
            ov.main(10);
            ov.main("Hello");
            ov.main(5, 10);
        }

        // Overloaded main method with int parameter
        public static void main(int a) {
            System.out.println("Main with int: " + a);
        }

        // Overloaded main method with String parameter
        public static void main(String str) {
            System.out.println("Main with String: " + str);
        }

        // Overloaded main method with two int parameters
        public static void main(int a, int b) {
            System.out.println("Main with two ints: " + (a + b));
        }
    }


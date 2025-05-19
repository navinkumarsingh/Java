// Define the package this file belongs to
package Day05_Loops;

// Main class to demonstrate an infinite for loop
public class Ex6_InfiniteForLoop {

    // Main method - program entry point
    public static void main(String[] args) {

        // Start an infinite for loop
        // No initialization, no condition, no increment/decrement
        // So the loop runs forever
        for (;;) {
            // Print this message repeatedly because the loop never ends
            System.out.println("This loop will never end");
        }
    }
}

    /*

1. Classic Infinite for Loop

for (;;) {
    System.out.println("This is an infinite loop");
}
🔹 Why?
No initialization, condition, or update → Loop never stops.

2. Using true as the Condition

for (; true ;) {
    System.out.println("This is an infinite loop");
}
🔹 Why?
true is always true, so the loop never exits.

3. Using a Constant Boolean Variable

final boolean RUN = true;
for (; RUN ;) {
    System.out.println("This is an infinite loop");
}
🔹 Why?
Since RUN is true, the condition never fails.

4. Using a Non-Decrementing Variable

for (int i = 1; i > 0; i++) {
    System.out.println("This is an infinite loop");
}
🔹 Why?
i keeps increasing, so i > 0 is always true.

5. Using a Non-Incrementing Variable

for (int i = 1; i <= 5; ) {
    System.out.println("This is an infinite loop");
}
🔹 Why?
i is never incremented, so i <= 5 never changes.

6. Using a break Condition That Never Executes

for (int i = 0; i < 10; i--) {  // i decreases, never reaches 10
    System.out.println("This is an infinite loop");
}
🔹 Why?
i is decreasing (i--), so it never reaches 10.

7. Using continue Without an Exit Condition

for (int i = 0; i < 5; ) {
    System.out.println("This is an infinite loop");
    continue;  // Skips the next part, no update on i
}
🔹 Why?
continue skips i++, so i is never updated.

8. Using a Method That Always Returns true

for (; alwaysTrue(); ) {
    System.out.println("This is an infinite loop");
}

static boolean alwaysTrue() {
    return true;
}
🔹 Why?

alwaysTrue() always returns true, making the loop infinite.
Stopping an Infinite Loop
Use break to exit:

for (;;) {
    System.out.println("Running...");
    if (Math.random() > 0.9) break;  // Breaks randomly
}
These are different ways to create infinite for loops in Java.


     */
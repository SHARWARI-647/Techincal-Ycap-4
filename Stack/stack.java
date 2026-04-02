import java.util.Scanner;

public class StackArray {
    static final int MAX = 100;
    static int[] stack = new int[MAX];
    static int top = -1;

    // Push operation
    static void push(int x) {
        if (top == MAX - 1) {
            System.out.println("Stack is full");
        } else {
            stack[++top] = x;
            System.out.println("Pushed element: " + x);
        }
    }

    // Pop operation
    static void pop() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            int x = stack[top--];
            System.out.println("Popped element: " + x);
        }
    }

    // Print stack
    static void print() {
        if (top == -1) {
            System.out.println("Stack is empty");
        } else {
            System.out.println("Stack elements:");
            for (int i = top; i >= 0; i--) {
                System.out.print(stack[i] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, x;

        while (true) {
            System.out.println("\nEnter the choice:");
            System.out.println("1. Push\n2. Pop\n3. Print\n4. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter element to push: ");
                    x = sc.nextInt();
                    push(x);
                    break;

                case 2:
                    pop();
                    break;

                case 3:
                    print();
                    break;

                case 4:
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
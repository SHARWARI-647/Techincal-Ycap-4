import java.util.Scanner;

public class Queue {
    static final int MAX = 100;
    static int[] queue = new int[MAX];
    static int r = -1;
    static int f = 0;

    // Insert (Enqueue)
    public static void insert(int x) {
        if (r == MAX - 1) {
            System.out.println("Queue is full");
        } else {
            queue[++r] = x;
            System.out.println("Element Inserted: " + x);
        }
    }

    // Delete (Dequeue)
    public static void delete() {
        if (f > r) {
            System.out.println("Queue is empty");
        } else {
            int x = queue[f++];
            System.out.println("Element Deleted: " + x);
        }
    }

    // Print Queue
    public static void print() {
        if (f > r) {
            System.out.println("Queue is empty");
        } else {
            for (int i = f; i <= r; i++) {
                System.out.print(queue[i] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, x;

        while (true) {
            System.out.println("\nEnter the choice:");
            System.out.println("1.Insert\n2.Delete\n3.Print\n4.Exit");

            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter element to insert:");
                    x = sc.nextInt();
                    insert(x);
                    break;

                case 2:
                    delete();
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
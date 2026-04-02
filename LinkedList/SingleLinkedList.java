
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class SingleLinkedList {
    static Node head = null;
    /* public static Node craeteNode(){
         return new Node;
        }
     */

    // Insert at beginning
    public static void insertAtBeg(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Insert at end
    public static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    // Insert at position
    public static void insertAtPos(int data, int pos) {
        if (pos < 1) {
            System.out.println("Invalid position!");
            return;
        }
        if (pos == 1) {
            insertAtBeg(data);
            return;
        }
        Node newNode = new Node(data);
        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Position out of range!");
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode;
    }

    // Delete at beginning
    public static void deleteAtBeg() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
    }

    // Delete at end
    public static void deleteAtEnd() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
    }

    // Delete at position
    public static void deleteAtPos(int pos) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        if (pos < 1) {
            System.out.println("Invalid position!");
            return;
        }

        if (pos == 1) {
            deleteAtBeg();
            return;
        }

        Node temp = head;

        for (int i = 1; i < pos - 1 && temp != null; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null) {
            System.out.println("Position out of range!");
            return;
        }

        temp.next = temp.next.next;
    }

    // Display
    public static void print() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node temp = head;
        System.out.print("Linked List: ");
        while (temp != null) {
            System.out.print(" -> " + temp.data);
            temp = temp.next;
        }
        System.out.println();
    }

    // Main
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice, data, pos;

        while (true) {
            System.out.println("\n--- Singly Linked List Menu ---");
            System.out.println("1. Insert at Beginning");
            System.out.println("2. Insert at End");
            System.out.println("3. Insert at Position");
            System.out.println("4. Delete at Beginning");
            System.out.println("5. Delete at End");
            System.out.println("6. Delete at Position");
            System.out.println("7. Display");
            System.out.println("8. Exit");

            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter value: ");
                    insertAtBeg(sc.nextInt());
                    break;

                case 2:
                    System.out.print("Enter value: ");
                    insertAtEnd(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter value and position: ");
                    data = sc.nextInt();
                    pos = sc.nextInt();
                    insertAtPos(data, pos);
                    break;

                case 4:
                    deleteAtBeg();
                    break;

                case 5:
                    deleteAtEnd();
                    break;

                case 6:
                    System.out.print("Enter position: ");
                    deleteAtPos(sc.nextInt());
                    break;

                case 7:
                    print();
                    break;

                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }
}
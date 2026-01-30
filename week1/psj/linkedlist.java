import java.util.*;

// Node class
class Node {
    int data;
    Node next;   // removed 'static'

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// LinkedList implementation (renamed to avoid conflict)
class MyLinkedList {
    Node head;

    // Insert at the end
    public void insert(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Search for a value
    public boolean search(int key) {
        Node current = head;
        while (current != null) {
            if (current.data == key) {
                return true;
            }
            current = current.next;
        }
        return false;
    }

    // Display the list
    public void display() {
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        System.out.println("null");
    }
}

// Main class must match the file name
public class linkedlist {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(40);
        list.insert(50);

        list.display();  // Output: 10 -> 20 -> 40 -> 50 -> null
        System.out.println("Search 20: " + list.search(20)); // true
        System.out.println("Search 60: " + list.search(60)); // false
    }
}
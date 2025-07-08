public class SinglyLinkedList {
    private Node head; // The head node of the singly linked list.
    private Node tail; // The tail node of the singly linked list.
    private int size;  // The number of nodes in the singly linked list.

    // Inner class representing a Node in the singly linked list.
    private static class Node {
        public int value; // The data value stored in the node.
        public Node next;  // A reference to the next node in the list.
    }

    /**
     * Creates a new singly linked list with a single node containing the specified value.
     * If a list already exists, it will be overwritten.
     *
     * @param nodeValue The value to be stored in the first node.
     * @return The head node of the newly created singly linked list.
     */
    public Node create(int nodeValue) {
        head = new Node(); // Initialize the head node.
        Node node = new Node(); // Create a new node for the value.

        node.next = null; // The first node's next is null as it's the only node.
        node.value = nodeValue; // Set the value of the node.

        head = node; // Both head and tail point to the new node.
        tail = node;
        size = 1; // The size of the list is now 1.

        return head; // Return the head of the list.
    }

    /**
     * Inserts a new node with the specified value at the given location in the singly linked list.
     *
     * @param nodeValue The value to be inserted into the new node.
     * @param location  The position (0-indexed) where the new node should be inserted.
     * - If location is 0, the node is inserted at the beginning (head).
     * - If location is greater than or equal to the current size, the node is appended to the end (tail).
     * - Otherwise, the node is inserted at the specified intermediate position.
     */
    public void insert(int nodeValue, int location) {
        Node node = new Node(); // Create a new node.
        node.value = nodeValue; // Set the value of the new node.

        // Case 1: If the list is empty, create a new list with the given value.
        if (head == null) {
            create(nodeValue);
            return; // Exit after creating the list.
        }
        // Case 2: Insert at the beginning of the list.
        else if (location == 0) {
            node.next = head; // The new node points to the current head.
            head = node;      // The new node becomes the new head.
        }
        // Case 3: Insert at or beyond the end of the list.
        else if (location >= size) {
            node.next = null;   // The new node will be the last, so its next is null.
            tail.next = node;   // The current tail points to the new node.
            tail = node;        // The new node becomes the new tail.
        }
        // Case 4: Insert at an intermediate position.
        else {
            Node temp = head; // Start traversing from the head.
            int index = 0;

            // Traverse to the node just before the desired insertion location.
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }

            Node next = temp.next; // Store the node currently at the insertion location.
            temp.next = node;      // The previous node now points to the new node.
            node.next = next;      // The new node points to the node that was originally at the insertion location.
        }

        size++; // Increment the size of the list.
    }

    /**
     * Traverses and prints the elements of the singly linked list from head to tail.
     * If the list is empty, it prints a message indicating it does not exist.
     */
    public void traverseSinglyLinkedList() {
        // Check if the list is empty.
        if (head == null) {
            System.out.println("is not exist.");
            return; // Exit if the list is empty.
        }

        Node temp = head; // Start traversal from the head.
        System.out.print("Singly Linked List: ");
        // Iterate through each node and print its value.
        for (int i = 0; i < size; i++) {
            System.out.print(temp.value);

            // Add " -> " separator between nodes, but not after the last node.
            if (i != size - 1) {
                System.out.print(" -> ");
            }
            temp = temp.next; // Move to the next node.
        }

        System.out.println("\n"); // Print a newline for better formatting.
    }

    /**
     * Displays the elements of the singly linked list in a "value -> value -> ... -> null" format.
     * This method provides a clear visual representation of the list's structure, including the null termination.
     */
    public void display() {
        Node curr = head; // Start traversal from the head.

        // Iterate through the list until the current node is null (end of list).
        while (curr != null) {
            System.out.print(curr.value + " -> "); // Print the current node's value and an arrow.
            curr = curr.next; // Move to the next node.
        }
        System.out.println("null"); // Indicate the end of the list.
    }
}

public class SinglyLinkedList {
    private Node head; // The head node of the singly linked list.
    private Node tail; // The tail node of the singly linked list.
    private int size;  // The number of nodes in the singly linked list.


//    private static class Node {
//        public int value;
//        public Node next;
//    }

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
     * Searches for a specific value within the singly linked list.
     * It traverses the list from the head and checks each node's value.
     *
     * @param value The integer value to search for in the linked list.
     * @return true if the value is found, false otherwise.
     */
    public boolean searchSinglyLinkedList(int value) {
       if (head != null) {
          Node temp = head;

          /**
           * Loop through the linked list util 'temp' becomes to size (length of the list)
           * or we have checked all with 'size' nodes.
           * Using 'i < size' to found length of linked list traversal
           * than relying solely on 'size' in case of list inconsistencies
           */
          for (int i = 0; i < size; i++) {
              if (temp.value == value) {
                  System.out.printf("Found the node at location : %d\n", i);
              }
              temp = temp.next;
          }
       } else {
           System.out.println("Node not found!");
       }
       return false;
    }

    /**
     * Deletes a node from the singly linked list at a specified location.
     * Handles deletion from the beginning, end, and middle of the list.
     *
     * @param location the zero-based index (location) of the node to be deleted.
     */
    public void deletion(int location) {
        // Case 1 : The linked list is empty because I needed to delete for first index node.
        if (head == null) {
           System.out.println("The Singly Linked List not exist.");
           return;
        }

        // Case 2 : Deleting the head node (first node).
        // This occurs when location is 0.
        if (location == 0) {
            // Move the head pointer to the next node.
            // If there was only one node, head will become null.
           head = head.next;
           size--;

           // If, after deletion, the list becomes empty, update the tail to null as well.
           if (size == 0) {
               tail = null;
           }
           System.out.println("Node at location " + location + " deleted successfully.");
        }
        /**
         * Case 3 : Deletion the last node or a node beyond the current size.
         * 'location >= size' effectively handles both deleting the last node
         *
         * (if location == size - 1 for 0-based indexing) or an invalid out-of-bounds location.
         *
         * For simplicity and common practice, it's often better to treat an out-of-bounds
         * 'location' as an error or delete the last node if 'location >= size - 1'
         * and handle out-of-bounds as an error or no-op.
         */
        // Changed condition to specifically target last node.
        else if (location >= size) {
            /**
             * if location is precisely 'size - 1', we are deletion the actual last node.
             * if 'location > size - 1', it's out of bounds and we can choose to delete the last or do nothing.
             * for rebustness, let's assume 'location >= size - 1' means deleting the last node.
             * */
            Node temp = head;

            /**
             * Traverse to the second-to-last node.
             * The loop runs 'size - 2' times to stop at the node before the tail.
             * For a list with N nodes, the last node is at index N - 1.
             * To delete the last node, we need to reach the node at index N - 2.
             * */
            for (int i = 0; i < size - 2; i++) {
                temp = temp.next;
            }

            /**
             * If 'temp' is the head, it means there was only one node before this deletion.
             * (This specificcheck might be redundant if 'size == 1' is handled by location == 0)
             * If size was 1, head = head.next (null), size--, tail = null already handled by location == 0.
             * So, this 'if (temp == head)' block might not be necessary or indicates a logic flaw here.
             * */
            if (temp == head) {
                tail = head = null;
                size--;
                return;
            }

            temp.next = null;
            tail = temp;
            size--;
            System.out.println("Node at location " + location + " deleted successfully (or last node if out of bounds).");
        // Case 4 : Deleting a node from the middle of the list.
        } else {
            Node temp = head;

            // Traverse to the node before the node to be deleted.
            for (int i = 0; i < location - 1; i++) {
               temp = temp.next;
            }

            /**
             * Link the current node's 'next' to the node after the one being deleted.
             * This bypassed and effectively removes the node at 'location'.
             * */
            temp.next = temp.next.next;
            size--;
            System.out.println("Node at location " + location + " deleted successfully.");
        }
    }

    /**
     * Deletes the entire Singly Linked List.
     * This operation sets both the head and tail pointers to null
     * effectively making the list empty and allowing all nodes to be
     * garbage collected (if no other references exist).
     * */
    public void deleteAll() {
        /**
         * Set the head to the list to be null, this removes the all reference to first node and, consequently
         * To all subsequent nodes in the list.
        */
        head = null;

        // this ensures consistency, as an empty list should not have a tail.
        tail = null;

        /**
         * optionally, if you're tracking size, reset it to 0.
         * public int size; assuming 'size' field exists in Singly Linked List class
         * size = 0
         * */

        System.out.println("The Singly Linked List deleted successfully.");
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

public class CuricularSinglyLinkedList {
    public Node head, tail;
    public int size;

    public Node create(int value) {
        head = new Node();

        Node node = new Node();
        node.value = value;
        node.next = node;

        head = node;
        tail = node;
        size = 1;

        return node;
    }

    public void insert(int value, int location) {
        Node node = new Node();
        node.value = value;

        if (head == null) {
            create(value);
        } else if (location == 0) {
            node.next = head;
            head = node;
            tail.next = head;
        } else if (location >= size) {
            tail.next = node;
            tail = node;
            tail.next = head;
        } else {
            Node temp = head;
            int index = 0;
            while (index < location - 1) {
                temp = temp.next;
                index++;
            }
            node.next = temp.next;
            temp.next = node;
        }
    }

    /**
     * Displays the elements of the singly linked list in a "value -> value -> ... -> null" format.
     * This method provides a clear visual representation of the list's structure, including the null termination.
     * */
    public void display() {
        Node curr = head;

        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }

        System.out.println("null");
    }
}

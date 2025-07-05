public class SinglyLinkedList {
    public Node head;
    public Node tail;
    public int size;

    public Node createSinglyLinkedList(int nodeValue) {
       head = new Node();
       Node node = new Node();

       node.next = null;
//       node.value = Integer.parseInt(null);

        node.value = nodeValue;

       head = node;
       tail = node;
       size = 1;

       return head;
    }

    public void insertInLinkedList(int nodeValue, int location) {
        Node node = new Node();
        node.value = nodeValue;

        if (head == null) {
           createSinglyLinkedList(nodeValue);
           return;
        } else if (location == 0) {
            node.next = head;
            head = node;
        } else if (location >= size) {
            node.next = null;
            tail.next = node;
            tail = node;
        } else {
            Node temp = head;
            int index = 0;

            while (index < location - 1) {
               temp = temp.next;
               index++;
            }

            Node next = temp.next;
            temp.next = node;
            node.next = next;
        }
        size++;
    }

    public void display() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.value + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }
}

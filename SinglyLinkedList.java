class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class SinglyLinkedList {
    private Node head;

    
    public void insertAtStart(int data) {
        Node newNode = new Node(data);
        newNode.next = head; 
        head = newNode; 
    }

    
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        
        list.insertAtStart(10);
        list.insertAtStart(20);
        list.insertAtStart(30);
        
        System.out.println("Linked List after insertions at start:");
        list.printList();
    }
}

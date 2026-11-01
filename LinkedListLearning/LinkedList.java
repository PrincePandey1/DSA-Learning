package LinkedListLearning;

public class LinkedList {
    Node head;

    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    public void addNode(int data) {

        Node newNode = new Node(data);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        currentNode.next = newNode;
    }

    public void printNode() {
        Node curNode = head;

        while (curNode != null) {
            System.out.print(curNode.data + "->");
            curNode = curNode.next;
        }

        System.out.println("null");
    }

    public static void main(String[] args) {
        LinkedList node = new LinkedList();
        node.addNode(1);
        node.addNode(2);
        node.addNode(3);

        node.printNode();
    }

}

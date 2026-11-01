package LinkedListLearning;

import java.util.Stack;

class ListNode {
    int data;
    ListNode next;

    ListNode(int data) {
        this.data = data;
        next = null;
    }
}

public class ReverseLL {

    // TimeComplexity: O(N), Space Complexity: O(N)
    public static ListNode reverseLL(ListNode head) {

        Stack<Integer> stack = new Stack<>();

        ListNode currNode = head;

        while (currNode != null) {
            stack.push(currNode.data);
            currNode = currNode.next;
        }

        ListNode temp = head;

        while (!stack.isEmpty()) {
            temp.data = stack.pop();
            temp = temp.next;
        }

        return head;

    }

    // public static ListNode buildList(ListNode head) {
    // ListNode curr = head;
    // for (int i = 1; i < arr.length; i++) {
    // curr.next = new ListNode(arr[i]);
    // curr = curr.next;
    // }
    // return head;
    // }

    public static void printList(ListNode head) {

        ListNode curr = head;

        while (curr != null) {
            System.out.print(curr.data + " ");
            curr = curr.next;
        }

    }

    public static void main(String[] args) {

        // ReverseLL reverseLL = new ReverseLL();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);

        // buildList(head);
        System.out.println("after Reversal : ");
        reverseLL(head);
        printList(head);

    }

}

package LinkedListLearning;

public class MiddleOfLL {

    ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            next = null;
        }
    }

    // public ListNode middleNodeUsingFixedSize(ListNode head) {

    // ListNode currNode = head;

    // int size = 0;

    // while (currNode != null) {
    // size += 1;
    // currNode = currNode.next;
    // }

    // int middleIndex = size / 2;

    // ListNode result = head;
    // for (int i = 0; i < middleIndex; i++) {
    // result = result.next;
    // }

    // return result;
    // }

    // Using two pointer approach
    public ListNode middleNodeUsingFixedSize(ListNode head) {

        ListNode slow = head;
        ListNode fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        return slow;
    }

    // Helper to build list from array
    public static ListNode buildList(int[] arr) {
        ListNode head = new ListNode(arr[0]);
        ListNode curr = head;
        for (int i = 1; i < arr.length; i++) {
            curr.next = new ListNode(arr[i]);
            curr = curr.next;
        }
        return head;
    }

    public static void printList(ListNode head) {

        ListNode currNode = head;

        while (currNode != null) {
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
    }

    public static void main(String[] args) {

        MiddleOfLL sol = new MiddleOfLL();

        // Test 1: Odd size list (5 nodes)
        ListNode list1 = buildList(new int[] { 1, 2, 3, 4, 5 });
        System.out.print("List 1: ");
        printList(list1);
        System.out.println("Middle: " + sol.middleNodeUsingFixedSize(list1).data);
        System.out.println();

        // Test 2: Even size list (6 nodes)
        ListNode list2 = buildList(new int[] { 1, 2, 3, 4, 5, 6 });
        System.out.print("List 2: ");
        printList(list2);
        System.out.println("Middle: " + sol.middleNodeUsingFixedSize(list2).data);
        System.out.println();

        // Test 3: Single node
        ListNode list3 = buildList(new int[] { 1 });
        System.out.print("List 3: ");
        printList(list3);
        System.out.println("Middle: " + sol.middleNodeUsingFixedSize(list3).data);

    }

}

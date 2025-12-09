/*
 * PROBLEM 16: Merge two sorted linked lists (recursive)
 * 
 * Question in simple words:
 * You are given two linked lists that are already sorted. You need to merge them into one sorted list.
 * For example: If list A = 1 → 4 → 6 and list B = 2 → 3 → 5
 * Result = 1 → 2 → 3 → 4 → 5 → 6
 * 
 * The catch: You must use recursion instead of loops.
 * 
 * How it works:
 * - Compare the first nodes of both lists
 * - Take the smaller one
 * - Attach the result of merging the rest (recursively)
 * - If one list is empty, return the other list
 */

class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }
}

public class Problem16_MergeLinkedLists {
    static ListNode mergeLists(ListNode a, ListNode b) {
        if (a == null)
            return b; // If list A is empty, return B
        if (b == null)
            return a; // If list B is empty, return A

        if (a.val < b.val) {
            // A's value is smaller, take it
            a.next = mergeLists(a.next, b); // Merge rest of A with B
            return a;
        } else {
            // B's value is smaller, take it
            b.next = mergeLists(a, b.next); // Merge A with rest of B
            return b;
        }
    }

    public static void main(String[] args) {
        ListNode a = new ListNode(1);
        a.next = new ListNode(4);
        a.next.next = new ListNode(6);

        ListNode b = new ListNode(2);
        b.next = new ListNode(3);
        b.next.next = new ListNode(5);

        ListNode result = mergeLists(a, b);

        while (result != null) {
            System.out.print(result.val + " "); // Output: 1 2 3 4 5 6
            result = result.next;
        }
    }
}

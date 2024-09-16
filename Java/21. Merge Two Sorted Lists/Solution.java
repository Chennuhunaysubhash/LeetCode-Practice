
public class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        // Create a dummy node to serve as the start of the merged list
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        // Traverse both lists
        while (list1 != null && list2 != null) {
            if (list1.val < list2.val) {
                current.next = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                list2 = list2.next;
            }
            current = current.next;
        }

        // If there are remaining nodes in either list, append them
        if (list1 != null) {
            current.next = list1;
        } else if (list2 != null) {
            current.next = list2;
        }

        // Return the merged list, which starts at dummy.next
        return dummy.next;
    }
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Example lists
        ListNode list1 = createLinkedList(new int[]{1, 2, 4});
        ListNode list2 = createLinkedList(new int[]{1, 3, 4});

        // Merging the lists
        ListNode mergedList = solution.mergeTwoLists(list1, list2);

        // Printing the merged list
        printLinkedList(mergedList);
    }

    // Helper function to create a linked list from an array
    public static ListNode createLinkedList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for (int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    // Helper function to print a linked list
    public static void printLinkedList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
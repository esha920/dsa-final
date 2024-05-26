
class ListNode {
    int val;
    ListNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class LinkedList {
    ListNode head;


    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode current = head;
        while (current != null) {
            ListNode nextNode = current.next; // Store the next node
            current.next = prev;              // Reverse the current node's pointer
            prev = current;                   // Move the previous node pointer up
            current = nextNode;               // Move to the next node in the list
        }
        return prev; //
    }


    public void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }
        System.out.println();
    }


    public void append(int new_data) {
        ListNode new_node = new ListNode(new_data);
        if (head == null) {
            head = new_node;
            return;
        }
        ListNode last = head;
        while (last.next != null) {
            last = last.next;
        }
        last.next = new_node;
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        // Creating the linked list: 1 -> 2 -> 3 -> 4 -> 5
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        System.out.println("Original List:");
        list.printList(list.head);

        // Revers the linked list
        list.head = list.reverseList(list.head);

        System.out.println("Reversed List:");
        list.printList(list.head);
    }
}

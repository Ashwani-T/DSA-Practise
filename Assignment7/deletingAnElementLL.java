package DSA_GATE.Assignment7;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}

class LinkedList {
    private ListNode head;

    // Add a new node at the beginning of the list
    public void addFirst(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = head;
        head = newNode;
    }

    // Add a new node at the end of the list
    public void addLast(int val) {
        ListNode newNode = new ListNode(val);
        if (head == null) {
            head = newNode;
            return;
        }
        
        ListNode current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    // Remove elements with a specific value
    public void removeElements(int val) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        
        head = dummy.next;
    }

    // Print the linked list
    public void printList() {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class deletingAnElementLL {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        
        // Add elements to the list
        list.addLast(1);
        list.addLast(2);
        list.addLast(6);
        list.addLast(3);
        list.addLast(4);
        list.addLast(5);
        list.addLast(6);
        
        System.out.println("Original list:");
        list.printList();
    
        list.removeElements(6);
        
        System.out.println("List after removing 6:");
        list.printList();
        
        
    }
}

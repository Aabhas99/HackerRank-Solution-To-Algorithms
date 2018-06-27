    // Complete the printLinkedList function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static void printLinkedList(SinglyLinkedListNode head) {
    SinglyLinkedListNode n=head;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }

    }

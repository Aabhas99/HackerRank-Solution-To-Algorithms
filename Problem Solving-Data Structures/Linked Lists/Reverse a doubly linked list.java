    // Complete the reverse function below.

    /*
     * For your reference:
     *
     * DoublyLinkedListNode {
     *     int data;
     *     DoublyLinkedListNode next;
     *     DoublyLinkedListNode prev;
     * }
     *
     */
    static DoublyLinkedListNode reverse(DoublyLinkedListNode head) {
    DoublyLinkedListNode n=head;
        DoublyLinkedListNode a=null;
        while(n!=null)
        {
            a=n.prev;
            n.prev=n.next;
            n.next=a;
            n=n.prev;
        }
        if(a!=null)
        {
            head=a.prev;
        }
        return head;
    }

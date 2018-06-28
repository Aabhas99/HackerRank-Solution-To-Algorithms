    // Complete the reversePrint function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode reverse(SinglyLinkedListNode head) {

    SinglyLinkedListNode n=head;
        SinglyLinkedListNode a=null;
        SinglyLinkedListNode b=null;
        while(n!=null)
        {
            b=n.next;
            n.next=a;
            a=n;
            n=b;
        }
        head=a;
        return head;
    }

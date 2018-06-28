    // Complete the removeDuplicates function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode removeDuplicates(SinglyLinkedListNode head) {
    SinglyLinkedListNode n=head;
        SinglyLinkedListNode x=head;
        while(n!=null)
        {
            int i=n.data;
            while(x!=null&&i==x.data)
            {
                x=x.next;
            }
            n.next=x;
            n=n.next;
        }
        return head;
    }

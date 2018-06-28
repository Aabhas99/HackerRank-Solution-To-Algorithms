    // Complete the deleteNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode deleteNode(SinglyLinkedListNode head, int position) {
        if(position==0)
        {
            head=head.next;
            return head;
        }
        SinglyLinkedListNode n=head;
        int i=1;
        while(position!=i)
        {
            n=n.next;
            i++;
        }
        n.next=n.next.next;
        return head;

    }

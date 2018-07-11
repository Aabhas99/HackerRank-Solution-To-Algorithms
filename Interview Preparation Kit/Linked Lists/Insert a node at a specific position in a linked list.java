    // Complete the insertNodeAtPosition function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode head, int data, int position) {
    SinglyLinkedListNode n= new SinglyLinkedListNode(data);
        int i=0;
        if(position==0)
        { 
            n.next=head;
            head=n;
            return head;
        }
        SinglyLinkedListNode a=head;
        i=1;
        while(position!=i)
        {
            i++;
            a=a.next;
        }
        n.next=a.next;
        a.next=n;
        return head;
    }

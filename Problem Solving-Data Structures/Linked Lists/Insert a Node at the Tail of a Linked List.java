    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode tnode = head;
        while (tnode != null)
        {
            System.out.print(tnode.data+" ");
            tnode = tnode.next;
        }
        
        SinglyLinkedListNode n=new SinglyLinkedListNode(data);
        if(head==null)
        {
            head=n;
            return head;
        }
        SinglyLinkedListNode a=head;
        while(a.next!=null)
        {
            a=a.next;
        }
        a.next=n;
        return head;

    }

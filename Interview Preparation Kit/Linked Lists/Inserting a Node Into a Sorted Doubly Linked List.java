    // Complete the sortedInsert function below.

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
    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
    DoublyLinkedListNode n=head;
        DoublyLinkedListNode h=new DoublyLinkedListNode(data);
        
        if(n.data>data||n==null)
        {
            h.next=n;
            h.prev=null;
            head=h;
            return head;
        }
    while(n.next!=null&&n.data<data)
    {
        n=n.next;
        if(n.next==null)
        {
            if(n.data<data)
            {
            n.next=h;
            h.prev=n;
            h.next=null;
            return head;
            }
            else
            {
                break;
            }
        }
        
    }
        n.prev.next=h;
        h.prev=n.prev;
        h.next=n;
        n.prev=h;
        
        return head;
    }

    // Complete the mergeLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode mergeLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
        SinglyLinkedListNode n=null;
        SinglyLinkedListNode head=null;
    SinglyLinkedListNode n1=head1;
        SinglyLinkedListNode n2=head2;
        while(n1!=null&&n2!=null)
        {
            if(n1.data<n2.data)
            {
                if(head==null)
                {
                    head=new SinglyLinkedListNode(n1.data);
                    n=head;
                }
                else
                {
                    SinglyLinkedListNode h=new SinglyLinkedListNode(n1.data);
                    n.next=h;
                    n=h;
                }
                n1=n1.next;
            }
            else
            {
                 if(head==null)
                {
                    head=new SinglyLinkedListNode(n2.data);
                     n=head;
                }
                else
                {
                    SinglyLinkedListNode h=new SinglyLinkedListNode(n2.data);
                    n.next=h;
                    n=h;
                }
                n2=n2.next;
            }
        }
        while(n1!=null)
        {
            SinglyLinkedListNode h=new SinglyLinkedListNode(n1.data);
            System.out.println("a");
            n.next=h;
                    n=h;
            n1=n1.next;
        }
        while(n2!=null)
        {
            SinglyLinkedListNode h=new SinglyLinkedListNode(n2.data);
            System.out.println("a");
            n.next=h;
                    n=h;
            n2=n2.next;
        }
        return head;
    }

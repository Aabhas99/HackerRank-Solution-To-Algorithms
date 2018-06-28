    // Complete the compareLists function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static boolean compareLists(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {
    SinglyLinkedListNode n1=head1;
        SinglyLinkedListNode n2=head2;
    while(n1!=null&&n2!=null)
    {
        if(n1.data!=n2.data)
            return false;
        n1=n1.next;
        n2=n2.next;
    }
        if(n1==null&&n2==null)
        {
            return true;
        }
        return false;
    }

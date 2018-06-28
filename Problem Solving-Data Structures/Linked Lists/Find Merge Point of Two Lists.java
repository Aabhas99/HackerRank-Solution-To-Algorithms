    // Complete the findMergeNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int findMergeNode(SinglyLinkedListNode head1, SinglyLinkedListNode head2) {

    SinglyLinkedListNode n1=head1;
        SinglyLinkedListNode n2=head2;
        HashSet<SinglyLinkedListNode> h=new HashSet<>();
        while(n1!=null)
        {
            h.add(n1);
            n1=n1.next;
        }
        while(n2!=null)
        {
            if(h.contains(n2))
            {
                return n2.data;
            }
            n2=n2.next;
        }
        return 0;
    }

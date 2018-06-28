    // Complete the getNode function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static int getNode(SinglyLinkedListNode head, int positionFromTail) {
        int j=0;
    SinglyLinkedListNode n=head;
        while(n!=null)
        {
            j++;
            n=n.next;
        }
    int na=j-1-positionFromTail;
        int i=0;
        n=head;
        while(i!=na)
        {
            i++;
            n=n.next;
        }
        return n.data;
    }

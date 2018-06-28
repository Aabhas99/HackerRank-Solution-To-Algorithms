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
    static void reversePrint(SinglyLinkedListNode head) {

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
        n=a;
        while(n!=null)
        {
            System.out.println(n.data);
            n=n.next;
        }
    }

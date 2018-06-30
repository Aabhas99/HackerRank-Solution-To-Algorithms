 /* Node is defined as :
 class Node 
    int data;
    Node left;
    Node right;
    
    */

	public static Node insert(Node root,int data) {

    	if(root==null)
        {
            root=new Node(data);
            return root;
        }
        if(root.data<data)
        {
            if(root.right==null)
            {
                root.right=new Node(data);
            }
            else
            {
                insert(root.right,data);
            }
        }
        else
        {
            if(root.left==null)
            {
                root.left=new Node(data);
            }
            else
            {
                insert(root.left,data);
            }
        }
        return root;
    }

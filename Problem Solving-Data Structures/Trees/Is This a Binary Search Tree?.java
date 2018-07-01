/* Hidden stub code will pass a root argument to the function below. Complete the function to solve the challenge. Hint: you may want to write one or more helper functions.  

The Node class is defined as follows:
    class Node {
        int data;
        Node left;
        Node right;
     }
*/
    boolean checkBST(Node root)
    {
           checkBS(root);
        for(int x=0;x<a.size()-1;x++)
        {
            if(a.get(x)>=a.get(x+1))
            {
                return false;
            }
        }
        return true;
    }
    static ArrayList<Integer> a=new ArrayList<>();
    void checkBS(Node root) {
        if(root==null)
        {
            return;
        }
        checkBST(root.left);
        a.add(root.data);
        checkBST(root.right);
    }

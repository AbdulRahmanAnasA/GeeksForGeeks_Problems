class Solution
{
    //Function to return the level order traversal of a tree.
    static ArrayList <Integer> levelOrder(Node root) 
    {
        ArrayList<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        Deque<Node> q=new ArrayDeque<>();
        q.add(root);
        while(!q.isEmpty()){
            Node curr=q.remove();
            ans.add(curr.data);
            if(curr.left != null) q.add(curr.left);
            if(curr.right != null) q.add(curr.right);
        }
        
        return ans;
    }
}

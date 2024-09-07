class Tree
{
    //Function to return list containing elements of left view of binary tree.
    ArrayList<Integer> leftView(Node root)
    {
       ArrayList<Integer> ans=new ArrayList<>();
       if(root==null) return ans;
        Deque<Node> q=new ArrayDeque();
        q.offer(root);
        while(!q.isEmpty()){
            List<Integer> l1=new ArrayList<>();
            int size=q.size();
            for(int i=0;i<size;i++){
            Node curr=q.poll();
            l1.add(curr.data);
            if(curr.left != null ) q.offer(curr.left);
            if(curr.right != null ) q.offer(curr.right);
            }
             ans.add(l1.get(0));  
        }
        return ans;
    }
}

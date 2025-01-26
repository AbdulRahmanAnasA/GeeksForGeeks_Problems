 class Solution {
    // Function to flatten a linked list
    Node flatten(Node root) {
        if(root ==null || root.next == null){
            return root;
        }
            
        Node mergehead=flatten(root.next);
        
        return merge(root,mergehead);
        }
        
    public Node merge(Node head1,Node head2){
        Node dummy=new Node(-1);
        Node temp=dummy;
        while(head1 != null && head2 != null){
            
            if(head1.data<head2.data){
                temp.bottom=head1;
                temp=head1;
                head1=head1.bottom;
            }
            else{
                temp.bottom=head2;
                temp=head2;
                head2=head2.bottom;
            }
            temp.next=null;
        }
        
        if(head1 != null){
            temp.bottom=head1;
        }
        else{
            temp.bottom=head2;
        }
        return dummy.bottom;
    }
    
}

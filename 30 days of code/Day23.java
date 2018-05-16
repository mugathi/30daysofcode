
    
static void levelOrder(Node root){
    Queue<Node> q = new LinkedList<>();
    if(root!=null)q.add(root);
    Node k=q.remove();
        while(k!=null)
        {
            System.out.print(k.data+" ");
           if(k.left!=null)q.add(k.left);
            if(k.right!=null)q.add(k.right);
            k=q.remove();
        }
    
    }
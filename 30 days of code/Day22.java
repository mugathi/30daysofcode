	public static int getHeight(Node root){
      if(root==null)return -1;
        return max(1+getHeight(root.left),1+getHeight(root.right));
    }
static int max(int a,int b)
{
if(a>b)return a;
    return b;
}
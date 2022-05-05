public class TreeNode {
    //Attributes
    private TreeNode left;
    private TreeNode right;
    private String entry;

    //Methods
    //constructor
    public TreeNode(String entry,TreeNode right,TreeNode left){
        this.entry = entry;
        this.left = left;
        this.right = right;
    }

    //setter Methods
    public void setLeft(TreeNode n){
        left = n;
    }
    public void setRight(TreeNode n){
        right = n;
    }
    public void setEntry(String s){
        entry = s;
    }

    //getter Methods
    public TreeNode getLeft(){
        return left;
    }
    public TreeNode getRight(){
        return right;
    }
    public String getEntry(){
        return entry;
    }

    public String getPath(){
      return "";
    }
}

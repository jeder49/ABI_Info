public class Tree {
    private TreeNode root;

    public Tree(TreeNode root){
        this.root = root;
    }

    public void addNode(TreeNode n){
        if(root == null){
            root = n;
            return;
        }
        TreeNode cursor = root;
        while (cursor != null) {
            if (cursor.getEntry().compareTo(n.getEntry()) < 0){
                if (cursor.getRight() != null) {
                    cursor = cursor.getRight();
                }else {
                    cursor.setRight(n);
                    return;
                }
            } else {
                if (cursor.getLeft() != null) {
                    cursor = cursor.getLeft();
                }else {
                    cursor.setLeft(n);
                    return;
                }
            }
        }
    }

    public TreeNode getNode(String s){
        if(root == null){
            System.out.println("No tree found.");
            return null;
        }
        TreeNode cursor = root;
        while (cursor != null) {
            if (cursor.equals(s)) {
                return cursor;
            } else if (cursor.getEntry().compareTo(s) < 0){
                cursor = cursor.getRight();
            } else {
                cursor = cursor.getLeft();
            }
        }
        System.out.println("Could not find this entry.");
        return null;
    }

    public String inorder(TreeNode n, String s){
        if (n.getLeft() != null) {
            s = s + inorder(n.getLeft(),"");
        }
        s = s + "," + n.getEntry();
        if (n.getRight() != null) {
            s = s + inorder(n.getRight(),"");
        }
        return s;
    }

    public String preorder(TreeNode n, String s){
        s = s + "," + n.getEntry();
        if (n.getLeft() != null) {
            s = s + preorder(n.getLeft(),"");
        }
        if (n.getRight() != null) {
            s = s + preorder(n.getRight(),"");
        }
        return s;
    }

    public String postorder(TreeNode n, String s){
        if (n.getLeft() != null) {
            postorder(n.getLeft(),s);
        }
        if (n.getRight() != null) {
            postorder(n.getRight(),s);
        }
        s = s + "," + n.getEntry();
        return s;
    }

    //ToDo
    public int getDepth(){
        int d = 0;
        return d;
    }

    public TreeNode getRoot(){
        return root;
    }
}
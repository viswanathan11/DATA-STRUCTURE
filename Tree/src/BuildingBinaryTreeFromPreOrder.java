import java.util.*;

class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;

    TreeNode(int data){
        this.data=data;
    }
}
/**
 * BuildingBinaryTreeFromPreOrder
 */

public class BuildingBinaryTreeFromPreOrder{
static Scanner sc=new Scanner(System.in);
static public TreeNode buildTreePreOrder(){
    int val=sc.nextInt();
    TreeNode root=new TreeNode(val);
    if(val==-1){
        return null;
    }
    else{
        root.left=buildTreePreOrder();
        root.right=buildTreePreOrder();
    }
    return root;
}
static int countManager(TreeNode root){
    if(root==null){
        return 0;
    }
    int count=0;
    if(root.left!=null||root.right!=null){
        count=1;
    }
    return count+countManager(root.left)+countManager(root.right);
}
public static void main(String[] args) {
    TreeNode root=buildTreePreOrder();
    System.out.println(countManager(root));
}
}
import java.util.*;

class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;
    TreeNode(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class BottomView {
    public void buildTree(List<Integer> res,int[] arr){
        int i=0;
        TreeNode root=new TreeNode(arr[i]);
        Queue<TreeNode> q=new ArrayDeque<>();

        q.offer(root);
        while(!q.isEmpty()){
            
        }
    }
}

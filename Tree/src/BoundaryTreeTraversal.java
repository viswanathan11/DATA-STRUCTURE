import java.util.*;
class TreeNode{
    int data;
    TreeNode right;
    TreeNode left;
    TreeNode(int data,TreeNode left,TreeNode right){
        this.data=data;
        this.left=left;
    }
}


public class BoundaryTreeTraversal {
    public static TreeNode insert(TreeNode root,int data){
    
        if(root==null){
            return new TreeNode(data,null,null);
        }

        if(root.data>data){
            root.left=insert(root.left, data);
        }
        else if(root.data<data){
            root.right=insert(root.right, data);
        }

        return root;
    }

    public void leftTraversal(TreeNode root,List<Integer> res){
        if(root==null)return;
        if(root.right==null&&root.left==null){
            return;
        }
    
         res.add(root.data);
        
         if(root.left!=null)leftTraversal(root.left, res);
         else leftTraversal(root.right, res);
        
    }

    
    public void rightTraversal(TreeNode root,List<Integer> res){
        if(root==null) return;
        if(root.right==null && root.left==null){
            return;
        }
        res.add(root.data);

        if(root.right!=null)rightTraversal(root.right, res);
        else rightTraversal(root.left, res);
    }

    public void TreeLeafNode(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }

        if(root.left==null && root.right==null){
            res.add(root.data);
        }

        TreeLeafNode(root.left, res);
        TreeLeafNode(root.right, res);

    }
    public static void main(String[] args) {
TreeNode root = insert(null, 10);
root = insert(root, 20);
root = insert(root, 30);
root = insert(root, 40);
root = insert(root, 50);
        BoundaryTreeTraversal traversal = new BoundaryTreeTraversal();
        List<Integer> res = new ArrayList<>();

        if (root != null) {
            res.add(root.data);
            traversal.leftTraversal(root.left, res);
            traversal.TreeLeafNode(root.left, res);
            traversal.TreeLeafNode(root.right, res);

            List<Integer> rightBoundary = new ArrayList<>();
            traversal.rightTraversal(root.right, rightBoundary);
            Collections.reverse(rightBoundary);
            res.addAll(rightBoundary);
        }

        System.out.println(res);
    }
}

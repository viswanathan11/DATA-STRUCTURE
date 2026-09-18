

class TreeNode{
    int data;
    TreeNode left,right;
    TreeNode(int data){
        this.data=data;
    }
}
public class BstFromPreOrder {
    public static TreeNode buildTree(int[] pre,int[] idx,int ub){

        if(idx[0]>=pre.length || pre[idx[0]]>ub){
            return null;
        }

        TreeNode root=new TreeNode(pre[idx[0]]);
        idx[0]+=1;
        root.left=buildTree(pre, idx, root.data);
        root.right=buildTree(pre, idx, ub);

        return root;
    }

    public static void preorder(TreeNode root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);

    }
    public static void main(String[] args) {
        int[] pre={6,3,1,4,8,9};
        int idx[]={0};
        TreeNode root=buildTree(pre,idx,Integer.MAX_VALUE);

        preorder(root);

    }
}

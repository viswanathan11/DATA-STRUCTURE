import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

class TreeNode{
    int data;
    TreeNode right,left;
    TreeNode(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}
public class BstPractice {
    static Scanner sc=new Scanner(System.in);

    public static TreeNode buildTree(){
        int val=sc.nextInt();
        TreeNode root=new TreeNode(val);

        if(val==-1){
            return null;
        }

        else{
            root.left=buildTree();
            root.right=buildTree();
        }
        return root;
    }


    public static void inorder(TreeNode root){
        if(root==null) return;
        inorder(root.left);
        System.out.println(root.data);
        inorder(root.right);
    }

    public static TreeNode buildFromPreOrderArray(int[] pre,int[] idx,int ub){
        
        if(idx[0]>=pre.length||pre[idx[0]]>ub) return null;        
        TreeNode root=new TreeNode(pre[idx[0]]);
        idx[0]+=1;
        root.left=buildFromPreOrderArray(pre, idx, root.data);
        root.right=buildFromPreOrderArray(pre, idx, ub);

        return root;
    }
    public static void preorder(TreeNode root){
        if(root==null) return;
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }

    public static boolean verifyBst(TreeNode root,int ub,int lb){

        if(root==null) return true;
        if(root.data>ub || root.data<lb) return false;

        return verifyBst(root.left, root.data, lb) && verifyBst(root.right, ub, root.data);
    }

    public static TreeNode buildLevelOrderTree(int[] arr){
        Queue<TreeNode> q=new LinkedList<>();
        int i=0;
        TreeNode root=new TreeNode(arr[i]);
        q.offer(root);
        i+=1;
        while(!q.isEmpty()){
            TreeNode temp=q.poll();

            if(i<arr.length){
                temp.left=new TreeNode(arr[i]);
                q.offer(temp.left);
            }

            i++;
            if(i<arr.length){
                temp.right=new TreeNode(arr[i]);
                q.offer(temp.right);
            }
            i++;
        }

        return root;
    }
public static void main(String[] args) {
    int[] idx={0};
    int[] pre={6,3,1,4,8,9};
   // TreeNode root=buildTree();
//    TreeNode root=buildFromPreOrderArray(pre,idx,Integer.MAX_VALUE);
TreeNode root=buildLevelOrderTree(new int[]{4,5,6,2,1,18,1});
    preorder(root);
    System.out.println("\nVerify BST: "+ verifyBst(root,Integer.MAX_VALUE,Integer.MIN_VALUE));
}    
}

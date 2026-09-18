import java.util.*;
class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;

    TreeNode(int data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}


class BST{
    public TreeNode insert(TreeNode root,int data){
        if(root==null){
            return new TreeNode(data);
        }
        if(data<root.data){
            root.left=insert(root.left,data);
        }else if(data>root.data){
            root.right=insert(root.right,data);
        }
        return root;
    }

    public boolean search(TreeNode root,int data){
        if(root==null){
            return false;
        }
        if(root.data==data){
            return true;
        }
        if(data<root.data){
            return search(root.left,data);
        }
        return search(root.right,data);
    }
    public void inorder(TreeNode root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
public int findMin(TreeNode root){
    TreeNode curr=root;

    while(curr.left!=null){
        curr=curr.left;
    }
    return curr.data;
}

public int findMax(TreeNode root){
        TreeNode curr=root;
        while(curr.right!=null){
            curr=curr.right;
        }
        return curr.data;
}

public int height(TreeNode root){
        if(root==null){
            return -1;
        }
        return 1+Math.max(height(root.left),height(root.right));
}
}

public class TreeDataStructre {
    public static void main(String... args){
        BST bst=new BST();
        TreeNode root=null;
        root = bst.insert(root, 50);
        root = bst.insert(root, 30);
        root = bst.insert(root, 70);
        root = bst.insert(root, 20);
        root = bst.insert(root, 40);
        root = bst.insert(root, 60);
        root = bst.insert(root, 80);

        root=bst.insert(root,10);
        root=bst.insert(root,100);
        System.out.println("Max: "+bst.findMax(root));
        System.out.println("Min: "+bst.findMin(root));
        System.out.print("Inorder traversal: ");bst.inorder(root);
        System.out.print("\nHeight of tree: "+bst.height(root));
    }
}

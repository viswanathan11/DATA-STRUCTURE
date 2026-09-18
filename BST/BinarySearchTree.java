package BST;
import java.util.*;
class Node{
    int data;
    Node right;
    Node left;
    Node(int data){
        this.data=data;
        this.right=null;
        this.left=null;
    }
}

class BST{
Node root;
BST(){
    this.root=null;
}

Node insert(Node root,int data){
    if(root==null){
        return new Node(data);
    }

    if(root.data>data){
        root.left=insert(root.left, data);
    }
    else if(root.data<data){
        root.right=insert(root.right, data);
    }

    return root;
}


boolean SearchNode(Node root,int data){
    if(root==null) return false;

    if(root.data==data) return true;
    else if(root.data<data) return SearchNode(root.right,data);
    else return SearchNode(root.left,data);
}

void inorder(Node root){

    if(root!=null){

        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
}

void preorder(Node root){
    if(root!=null){
        System.out.print(root.data+" ");
        preorder(root.left);
        preorder(root.right);
    }
}

void postorder(Node root){
    if(root!=null){
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data+" ");
    }
}
}
class BinarySearchTree{
    public static void main(String[] args){
        BST tree=new BST();
        tree.root=tree.insert(tree.root,50);
        tree.insert(tree.root,60);
        tree.insert(tree.root,23);
        tree.insert(tree.root, 70);
        tree.insert(tree.root, 20);
        tree.insert(tree.root, 40);
        tree.insert(tree.root, 80);
        System.out.print("Inorder: ");
        tree.inorder(tree.root);
        System.out.print("\nPreorder: ");
        tree.preorder(tree.root);
        System.out.print("\npostorder: ");
        tree.postorder(tree.root);
    }
}
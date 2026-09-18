
import java.util.*;
class TreeNode{
    int data;
    TreeNode right,left;
    TreeNode(int data){
        this.data=data;
    }
}
public class ParentBuiltBst {
    static HashMap<Integer,TreeNode> hsp=new HashMap<>();
    static Scanner sc=new Scanner(System.in);
    public static TreeNode build(int n){
        TreeNode root=null;
        for(int i=0;i<n;i++){
            int parent=sc.nextInt();
            int child=sc.nextInt();
            char dir=sc.next().charAt(0);

            if(!hsp.containsKey(parent)){
                hsp.put(parent, new TreeNode(parent));
            }

            if(!hsp.containsKey(child)){
                hsp.put(child,new TreeNode(child));
            }

            TreeNode p=hsp.get(parent);
            TreeNode c=hsp.get(child);

            if(dir=='L'){
                p.left=c;
            }else{
                p.right=c;
            }

            if(root==null){
                root=p;
            }
        }

        return root;
    }

    public static void preOrder(TreeNode root){
        if(root==null){
            return;
        }

        System.out.print(root.data+" ");
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void main(String[] args) {
        TreeNode root=build(6);
        preOrder(root);
    }
}

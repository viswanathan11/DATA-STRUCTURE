
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


/**
 * levelOrderBst
 */

class TreeNode{
    int data;
    TreeNode right,left;
    TreeNode(int data){
        this.data=data;
    }
}
public class levelOrderBst {
    static Scanner sc=new Scanner(System.in);
    public static TreeNode directionBuilTree(){
        int n=sc.nextInt();
        int r=sc.nextInt();
        TreeNode root=new TreeNode(r);
        Queue<TreeNode> q=new LinkedList<>();
        q.offer(root);
        n-=1;
        while(n-->0){
            int d=sc.nextInt();
            char dir=sc.next().charAt(0);
            TreeNode t=q.poll();
            if(dir=='L'){
                t.left=new TreeNode(d);
                q.offer(t.left);
            }
            else if(dir=='R'){
                t.right=new TreeNode(d);
                q.offer(t.right);
            }
        }
       return root;
    }

    public static TreeNode buildTree(int[] lvl){
        int i=0;
        Queue<TreeNode> q=new LinkedList<>();

        TreeNode root=new TreeNode(lvl[i]);
        q.offer(root);
        i++;

        while(!q.isEmpty() && i<lvl.length){
            TreeNode t=q.poll();

            if(i<lvl.length&&lvl[i]!=-1){
                t.left=new TreeNode(lvl[i]);
                q.offer(t.left);
            }
            i++;
            if(i<lvl.length&&lvl[i]!=-1){
                t.right=new TreeNode(lvl[i]);
                q.offer(t.right);
            }
            i++;
        }

        return root;

    }

    public static void levleOrder(List<Integer> res,TreeNode root){
        Queue<TreeNode> q=new LinkedList<>();

        q.offer(root);
        while(!q.isEmpty()){
            int size=q.size();
            while(size-->0){
                TreeNode t=q.poll();
                if(t.left!=null)q.offer(t.left);
                if(t.right!=null)q.offer(t.right);
                res.add(t.data);
            }
        }
    }
    public static void main(String[] args) {
        int[] lvl= {1,2,3,4,-1,5,-1,7,-1,-1,-1,-1};
        List<Integer> res=new ArrayList<>();
        TreeNode root=buildTree(lvl);
        levleOrder(res, root);
        System.out.print(res);
        TreeNode root1=directionBuilTree();
        res.clear();
        levleOrder(res, root1);
        System.out.println(res);
    }
}
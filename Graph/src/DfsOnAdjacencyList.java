import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DfsOnAdjacencyList {
    static List<ArrayList<Integer>> adj;
    static ArrayList<Integer> res;
    static  boolean[] visited;
    public static void dfs(int node){
        if(visited[node]) return;
        visited[node]=true;
        res.add(node);
        for(int neighbour:adj.get(node)){
            if(!visited[neighbour]){
                dfs(neighbour);
            }
        }
    }
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        adj=new ArrayList<>();
        res=new ArrayList<>();
        System.out.print("Eneter number of nodes: ");
        int N=sc.nextInt();
        System.out.print("Enter number of edges: ");
        int M=sc.nextInt();
        visited=new boolean[N+1];

        for(int i=0;i<=N;i++){
            adj.add(new ArrayList<>());
        }

        for(int i=0;i<M;i++){
            int from=sc.nextInt();
            int to=sc.nextInt();
            adj.get(from).add(to);
            adj.get(to).add(from);
        }
        int row=0;
        for(ArrayList<Integer> i:adj){
            System.out.println("row "+ row+" "+i);
            row++;
        }
        dfs(1);

        System.out.println("dfs traversal: "+res);
    }
}

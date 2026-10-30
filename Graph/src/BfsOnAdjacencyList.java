import java.util.*;

public class BfsOnAdjacencyList {
    static List<ArrayList<Integer>> adj;
    static List<Integer> res;
    static boolean[] visited;
    public static void bfs(int node){
        Queue<Integer> queue=new ArrayDeque<>();
        queue.offer(node);
        visited[node]=true;
        while(!queue.isEmpty()){
            int parent=queue.poll();
            res.add(parent);
            for(int neighbour:adj.get(parent)){
                if(!visited[neighbour]){
                visited[neighbour]=true;
                queue.offer(neighbour);
                }
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
        bfs(1);

        System.out.println("bfs traversal: "+res);
    }
}

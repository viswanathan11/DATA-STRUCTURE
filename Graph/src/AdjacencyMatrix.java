import java.util.Scanner;

public class AdjacencyMatrix {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Number of nodes: ");
        int N=sc.nextInt();
        System.out.print("Number of vertices: ");
        int M=sc.nextInt();
        //suppose 1-based indexing take N+1 else N fine
        int[][] adj=new int[N+1][N+1];
        //get the M vertices
        for(int i=0;i<M;i++){
            int from=sc.nextInt();
            int to=sc.nextInt();

            adj[from][to]=1;
            adj[to][from]=1;
        }


        System.out.println("Adjacency Matrix: ");
        System.out.println("Adjacency Matrix:");

        System.out.print("          ");
        for (int i = 1; i <= N; i++) {
            System.out.print("col " + i + "   ");
        }
        System.out.println();

        for (int i = 1; i <= N; i++) {

            System.out.print("row " + i + "   ");

            for (int j = 1; j <= N; j++) {
                System.out.print("   " + adj[i][j] + "     ");
            }

            System.out.println();
        }
    }
}

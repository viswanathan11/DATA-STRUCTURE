import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AdjacencyList {
    static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int N=sc.nextInt();
        int M=sc.nextInt();

        List<ArrayList<Integer>> adj=new ArrayList<>();

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
    }
}

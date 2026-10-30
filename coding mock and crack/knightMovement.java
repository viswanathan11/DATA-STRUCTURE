import java.util.Scanner;

public class knightMovement {
    static int[][] board;
    static int[][] dir={{-2,-1},{-2,+1},{-1,-2},{-1,+2},{1,2},{2,-1},{2,1},{1,-2}};
    public static boolean dfs(int i,int j,int N,int move){
        if(move==N*N-1){
            return true;
        }

        for(int k=0;k<8;k++){
            int dx=i+dir[k][0];
            int dy=j+dir[k][1];

            if(dx<N&&dy<N&&dx>=0&&dy>=0&&board[dx][dy]==-1){
                board[dx][dy]=move+1;
                if(dfs(dx, dy, N, move+1)){
                    return true;
                };
                board[dx][dy]=-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int N=s.nextInt();
        int sr=s.nextInt();
        int sc=s.nextInt();
        board=new int[N][N];

        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board[i][j]=-1;
            }
        }
        board[sr][sc]=0;
        int moves=0;
        boolean result=dfs(sr,sc,N,0);

        if(result){

            System.out.println("Final sequence matrix: ");
            
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }else{
        System.out.println("No valid tour");
    }
    }
}

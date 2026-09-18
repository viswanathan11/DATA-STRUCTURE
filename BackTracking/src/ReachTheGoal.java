public class ReachTheGoal {
    static int R;
    static int C;
    static boolean[][] visited;
    static boolean Acan;
    static boolean Bcan;

    public static void dfs(char[][] grid,int i,int j,char st){

        if(i>=R||i<0||j>=C||j<0||visited[i][j]||grid[i][j]=='1'){
            return;
        }

        if(grid[i][j]=='G'){
            if(st=='A'){
                Acan=true;
            }
            if(st=='B'){
                Bcan=true;
            }
            return;
        }

        visited[i][j]=true;

        if(st=='A'){
            //right
            if(j+1<C&&i<R&&!visited[i][j+1]&&grid[i][j+1]!='1'){
                dfs(grid,i,j+1,st);
            }

            //bottom
            if(i+1<R&&j<C&&!visited[i+1][j]&&grid[i+1][j]!='1'){
                dfs(grid,i+1,j,st);
            }

            visited[i][j]=false;
            return;
        }

        else if(st=='B'){
            //left
            if(j-1>=0&&i<R&&!visited[i][j-1]&&grid[i][j-1]!='1'){
                dfs(grid,i,j-1,st);
            }

            //top
            if(i-1>=0&&j<C&&!visited[i-1][j]&&grid[i-1][j]!='1'){
                dfs(grid,i-1,j,st);
            }

            visited[i][j]=false;
            return;
        }
    }
    public static void main(String[] args){
        char[][] grid = {
                {'0', 'A', '0', '0', '0'},
                {'0', '0', '1', '1', '0'},
                {'0', '0', '0', '1', '0'},
                {'0', '1', '0', '0', 'G'},
                {'0', 'B', '0', '0', '0'}
        };
        R=grid.length;
        C=grid[0].length;
        Acan=false;
        Bcan=false;
        visited=new boolean[R][C];

        for(int i=0;i<R;i++){
            for(int j=0;j<C;j++){
                if(grid[i][j]=='A'){
                    dfs(grid,i,j,'A');
                }

                if(grid[i][j]=='B'){
                    dfs(grid,i,j,'B');
                }
            }
        }

        if(Acan&&Bcan){
            System.out.println("BOTH");
        }else if(Acan){
            System.out.println('A');
        }else if(Bcan){
            System.out.println('B');
        }else{
            System.out.println("NONE");
        }
    }
}

public class RecursionSum {
    public static void main(String[] args) {
        System.out.println(Sum(5,0));
    }

    static int Sum(int n,int s){
        if(n==0){
            return 0;
        }

        int sum=s+n;
        return n+Sum(n-1,sum);

    }
}

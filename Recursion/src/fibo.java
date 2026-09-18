public class fibo {

    public static void main(String[] args){

        System.out.println(Fibonaci(5));
    }
    static int Fibonaci(int n){

        if(n==0) return 0;
        if (n==1) return 1;

        return Fibonaci(n-1)+Fibonaci(n-2);
    }
}

public class DigitSumRecursion {

    public static void main(String[] args) {
//        System.out.println(digitSum(122323));
        Revrese(1233433);
        System.out.println(rev);
    }


    static int rev=0;

    static void Revrese(int n){

        if(n==0){
            return ;
        }
        rev=rev*10+n%10;



        Revrese(n/10);

    }
    static String  digitSum(int n){

        if(n==0){
            return "";
        }

        return n%10+ digitSum(n/10);
    }
}

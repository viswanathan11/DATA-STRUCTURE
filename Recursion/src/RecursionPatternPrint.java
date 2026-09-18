public class RecursionPatternPrint
{
    public static void main(String[] args) {
        PrintPattern2(5,0);
    }


    public static void PrintPattern2(int r,int c){

        if(r==0){
            return;
        }

        if(c<r){

            //now how many times?
            PrintPattern2(r,c+1);
            System.out.print("* ");

        }
        else {

            PrintPattern2(r - 1, 0);
            System.out.println();
        }
}
    public static void PrintPattern(int r,int c){

        if(r==0){
            return;
        }

        if(c<r){
            System.out.print("* ");
            //now how many times?
            PrintPattern(r,c+1);

        }
        else {
            System.out.println();
            PrintPattern(r - 1, 0);
        }
    }
}

import java.util.*;
public class NumberRecursion
{
    public  static void  main(String[] args){

print(1);
}
static void print(int n){
        if(n==5){
            System.out.println(n);
            return ;
        }


        print(++n);
        System.out.println(n);
}


}


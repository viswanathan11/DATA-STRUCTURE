import java.util.Scanner;

public class StringSubsets {
    public static void generateSubset(String s1,String subset){
        if(s1==""){
            System.out.print(subset+" ");
            return;
        }

        generateSubset(s1.substring(1), subset+s1.substring(0,1));
        generateSubset(s1.substring(1), subset);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.next();
        generateSubset(s1,"");
    }
}

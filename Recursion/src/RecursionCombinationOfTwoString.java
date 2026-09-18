import java.util.*;
public class RecursionCombinationOfTwoString {
    public static void generator(String s1,String s2,int i,List<String> lt){
        if(i==s1.length()){
            return ;
        }
        if(s2.length()==0){
            lt.add(""+s1.charAt(i));
            
        }
        combinationWithS2(""+s1.charAt(i),s2,0,lt);
        generator(s1, s2, i+1, lt);
    }

    public static void combinationWithS2(String s1,String s2,int j,List<String> lt){
        if(j==s2.length()){
            return;
        }
        lt.add(s1+s2.charAt(j));
        combinationWithS2(s1, s2, j+1, lt);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        List<String> result=new ArrayList<>();
        generator(s1, s2, 0, result);


        System.out.println(result);
    }
}

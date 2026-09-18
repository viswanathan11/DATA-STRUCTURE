import java.util.*;

public class Subsequences {
    public static void main(String[] args) {

        subsequence("","MBALAVISWANATHAN");
        System.out.println(lt);

        System.out.println(subsequence2("","abc"));
    }

    static List<String> lt=new ArrayList<>();
    static void subsequence(String p,String s){

        if(s.isEmpty()){
            System.out.println(p);
            lt.add(p);
            return;
        }
        subsequence(p+s.charAt(0),s.substring(1));

        subsequence(p,s.substring(1));
    }

    static ArrayList<String> subsequence2(String p,String s){

        ArrayList<String> temp=new ArrayList<>();
        if(s.isEmpty()){
            System.out.println(p);
            temp.add(p);
            lt.add(p);
            return temp;
        }
        ArrayList<String> ansLeft = subsequence2(p+s.charAt(0),s.substring(1));

        ArrayList<String> ansRight=subsequence2(p,s.substring(1));

        temp.addAll(ansLeft);
        temp.addAll(ansRight);

        return temp;
    }
}

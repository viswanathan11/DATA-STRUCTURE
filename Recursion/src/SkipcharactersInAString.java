public class SkipcharactersInAString {

    public static void main(String[] args) {
        System.out.println(SkipCharacters("aabaccvad",'a',0,""));
        System.out.print(SkipCharacters2("aabaccvad",'a',0));
    }
    public static String SkipCharacters2(String s,char c,int i){
        String res="";
        if(i==s.length()){
            return res;
        }
        if(s.charAt(i)==c){
            res=res;
        }else{
            res+=s.charAt(i);
        }
        String resultFromTopToBellow=SkipCharacters2(s,c,i+1);
        res+=resultFromTopToBellow;
        return res;

    }

    public static String SkipCharacters(String s,char c,int i,String res){

        if(i==s.length()){
            return res;
        }
        if(s.charAt(i)==c){
            res=res;
        }else{
            res+=s.charAt(i);
        }

        return SkipCharacters(s,c,i+1,res);
    }
}

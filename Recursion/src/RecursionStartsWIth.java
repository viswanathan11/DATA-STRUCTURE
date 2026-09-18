public class RecursionStartsWIth {
    public static void main(String[] args) {
        System.out.println(skipApple("bacdappleab"));
    }

    public static String skipApple(String s){


        if(s.isEmpty()){
            return "";
        }

        if(s.startsWith("apple")){
                return skipApple(s.substring(6));

        }
        return s.charAt(0)+skipApple(s.substring(1));
    }
}

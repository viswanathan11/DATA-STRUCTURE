import java.util.*;
public class ExpressionAddOperator {
            void solve(String s,long target,List<String> res,String path,int i,long result,long residual){
                if(i==s.length()){
                    if(result==target){
                        res.add(path);
                    }
                    return ;
                }
                long num=0;
                for(int j=i;j<s.length();j++){
6                    num=Long.parseLong(s.substring(i,j+1));
                    if(j>i && s.charAt(i)=='0') continue;
                    if(i==0){
                        solve(s,target,res,path+num,j+1,num,num);
                    }
                    else{
                        solve(s,target,res,path+"+"+num,j+1,result+num,num);
                        solve(s,target,res,path+"-"+num,j+1,result-num,-num);
                        solve(s,target,res,path+"*"+num,j+1,(result-residual)+num*residual,num*residual);
                    }
                }
            }
            public List<String> addOperators(String num, int target) {
                List<String> res=new ArrayList<>();
                String path="";
                long result=0;
                long residual=0;
                int i=0;
                long k=(long)target;
                solve(num,k,res,path,i,result,residual);
                return res;
            }

    static void main(String[] args) {
        ExpressionAddOperator obj=new ExpressionAddOperator();
        System.out.println(obj.addOperators("105",6));
    }
    }

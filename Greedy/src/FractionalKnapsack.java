import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int[] val={60, 100, 120};
        int[] wt={10, 20, 30};
        int capacity=50;
        double[][] ratio=new double[val.length][2];

        for(int i=0;i<val.length;i++){
            ratio[i][0]=(double)val[i];
            ratio[i][1]=(double)wt[i];
        }

        Arrays.sort(ratio,(a, b)->Double.compare(b[0]/b[1],a[0]/a[1]));
        List<double[]> knp=new ArrayList<>();
        int i=0;
        double res=0.0;
        while(i<val.length){
            if(ratio[i][1]<=capacity){
                capacity-=(int)ratio[i][1];
                res+=ratio[i][0];
                knp.add(new double[]{ratio[i][0],ratio[i][1]});
            }else{
                double fractionalValue=capacity*(ratio[i][0]/ratio[i][1]);
                res+=fractionalValue;
                knp.add(new double[]{fractionalValue,capacity});
                capacity-=capacity;
                break;
            }
            i++;
        }

        System.out.println("Maximum Value that can be carrid is: "+res);
        System.out.println("Knapsack Bag: ");
        for(double[] arr:knp){
            System.out.print("["+arr[1]+" , "+arr[0]+"] ");
        }
    }
}

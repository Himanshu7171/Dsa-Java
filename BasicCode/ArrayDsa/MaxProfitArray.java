package BasicCode.ArrayDsa;

public class MaxProfitArray {

    public static int maxprofit(int [] prizes){
    int minprofit = Integer.MIN_VALUE;
    int maxprofit = 0 ;
     for (int i = 0 ; i < prizes.length ; i++) {
        minprofit = Math.min(minprofit, prizes[i]);
        maxprofit = Math.max(maxprofit, prizes[i] - maxprofit );


        
     }
     return maxprofit ;


    }
    public static void main(String[] args) {
        int [] prices = {7,1,5,3,6,4};
        int result = maxprofit(prices);
        System.out.println("  Max Profit Is :" + result);
        

    }
    
}

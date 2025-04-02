public class buyandsell {
    public static int maximum(int price[]) {
        int buy_price = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int i = 0;i<price.length;i++){
            if(buy_price < price[i]){
                maxProfit = price[i] - buy_price;
            }else{
                buy_price = price[i];
            }
        }
       return maxProfit;
    }

    public static void main(String[] args) {
        int price[]  = {1,2,5,6,3,4,8,5};
        int max = maximum(price);
        System.out.println(max);
    }
}

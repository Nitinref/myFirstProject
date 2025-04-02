public class kadanes {
    public static void subbarraysum(int arr[] ) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            currSum+=arr[i];
            maxSum =   Math.max(currSum,maxSum);
            if(currSum <0){
                currSum = 0;
            }


        }
        System.out.println("the maximum sum is:"+maxSum);


    }

    public static void main(String[] args) {
        int arr[] = {-2,-4,-5,-6,-8,-7,-9};
      subbarraysum(arr);
    }
}

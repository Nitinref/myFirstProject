public class subbarraysum {
    public static void printsubbarraysum(int arr[] ) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++) {
                int end = j;
                 currentSum = 0;
                for(int k = start;k<=end;k++){
                    currentSum += arr[k];
                 }
                System.out.println(currentSum);
                if(  maxSum<currentSum){
                     maxSum = currentSum;
                }

            }

        }
        System.out.println(maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {2,4,6,8,10};
        printsubbarraysum(arr);
    }

}

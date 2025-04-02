public class subbarraysum2 {
    public static void printsubbarraysum(int arr[] ) {
        int currentSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefix[] = new int[arr.length];
        prefix[0] = arr[0];
        for(int i = 1;i<arr.length;i++){
            prefix[i] = prefix[i-1]+arr[i];
        }
        for(int i = 0;i<arr.length;i++){
            int start = i;
            for(int j = i;j<arr.length;j++) {
                int end = j;
                currentSum = 0;
                currentSum = start == 0 ?prefix[end] : prefix[end]-prefix[start-1];
//used the ternary operator for making the conditition when start = 0 so start-1 = negative value by which in indexing is not possible.
//                System.out.println(currentSum);
                if(  maxSum<currentSum){
                    maxSum = currentSum;
                }

            }

        }
        System.out.println("max sum = "+maxSum);
    }

    public static void main(String[] args) {
        int arr[] = {1,-2,6,-1,3};
        printsubbarraysum(arr);
    }

}

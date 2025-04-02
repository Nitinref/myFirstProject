public class largest {
    public static int largestElement(int nums[]) {
        int largest  = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        if (nums == null || nums.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements.");
        };

        for(int i = 0;i< nums.length;i++){
            if(largest < nums[i]){
                largest = nums[i];

            }

        }

        for(int i = 0;i< nums.length;i++) {
            if( secondLargest < nums[i] && nums[i] <largest){
                secondLargest = nums[i];
            }
        }
        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("All elements are the same.");
        };
        return secondLargest;

    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7,8,9};
        int result = largestElement(nums);
        System.out.println(result);
    }
}

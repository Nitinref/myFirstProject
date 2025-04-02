public class rotate {
    public static void main(int nums [] , int k) {
           int n = nums.length;
            k = k % n;
            int temp[] = new int [k];
            for(int i =0;i<k;i++ ){
                temp[i] = nums[i];
            };
            for(int i = k;i<n;i++){
                nums[i-k] = nums[i];
            };

            for(int i = n-k;i<n;i++){
                nums[i] = temp[i-(n-k)];

            }

    }

    public static void main(String[] args) {
        int nums[] = {1,2,3,4,5,6,7};
        int k = 4;

      main(nums , k );
      for(int num:nums){
          System.out.println(num + " ");
      }
    }
}

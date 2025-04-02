class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        for(int i  = 0;i<n;){
            int correctIdx = nums[i];
            if(nums[i] < n && nums[i] != nums[correctIdx] ){
                int temp = nums[i];
                nums[i] = nums[correctIdx];
                nums[ correctIdx] = temp;

            }else{
                i++;
            }
        }

        for(int j = 0;j<n;j++){
            if(nums[j] != j){
                return j;
            }
        }
        return n;
    }
}
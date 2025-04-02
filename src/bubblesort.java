import java.util.Arrays;

public class bubblesort {
    public static void bubble(int nums[]) {
        int n = nums.length;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 1; j < nums.length - i; j++) {
                if (nums[j] < nums[j - 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j - 1];
                    nums[j - 1] = temp;
                }
            }
        }
    }


    public static void main(String[] args) {
        int nums[] = {1,5,6,4,9,2,5,7,2};
        bubble(nums);
        System.out.println(Arrays.toString(nums));
        }
    }


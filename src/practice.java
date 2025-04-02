public class practice{
    public static int sorted(int arr[],int target) {
        int start = 0;
        int end =  arr.length-1;
        while(start <=end){
            int mid =  start + (end-start)/2;
            if(arr[mid] == target){
                return mid;
            }
            if(arr[start] <= arr[mid] ){
                if(arr[start] <=target && target <=arr[mid]){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }else{
                if(arr[mid] <= target && target <=arr[end]){
                    start = mid +1;
                }else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {7,8,9,1,2,3,4,5,6};
      int result =   sorted(arr,1);

        if (result!= -1) {
            System.out.println("Target found at index: " + result);
        } else {
            System.out.println("Target not found in the array.");
        }
    }
}

public class infinity {
     static int  ans(int arr[], int target ) {

       int  start = 0;
       int  end = 1;
       while(target > arr[end]){
         int newstart = end +1;
           end = end +(end-start+1)*2;
           start = newstart;

       }
       return binarysearch(arr ,target,start, end);
    }

    public static int binarysearch(int arr[], int target,int start,int end) {


        while(start<=end){
            int mid = start +end/2;
            if(target == arr[mid]){
                return mid;
            } else if (target < arr[mid]) {
                end =mid -1;
            }else{
                start = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {1,4,5,6,7,8,89,99,111};
        int target = 8;
        System.out.println(ans(arr, target));
    }
}

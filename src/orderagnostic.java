public class orderagnostic {
    public static int main(int arr[]  , int target ) {

        int start = 0;
        int end =  arr.length-1;

        boolean isack = arr[start] <arr[end];
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target == arr[mid]){
                return mid;
            }if(isack){
                if(target<arr[mid]){
                   end = mid-1;
                }else if(target > arr[mid]){
                    start = mid +1;
                }
            }else{
                if(target>arr[mid]){
                    end = mid-1;
                }else if(target < arr[mid]){
                    start = mid +1;
                }

            }

        }
        return  -1;
    }

    public static void main(String[] args) {
        int arr[] = {7,6,4,3,2,1};
      int ans =   main(arr , 3);
        System.out.println(ans);
    }
}

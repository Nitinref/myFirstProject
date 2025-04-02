import java.util.Arrays;

public class cyclic {
    public static void sort(int arr[] ) {
        int i  = 0;
        while(  i < arr.length){
            int correctIdx = arr[i] -1;
            if(arr[i] != arr[correctIdx]){
                int temp = arr[correctIdx] ;
                arr[correctIdx] = arr[i];
                arr[i] = temp;
            }else{
                i++;
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = {5,3,4,1,2};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

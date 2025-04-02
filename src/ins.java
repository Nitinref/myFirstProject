import java.util.Arrays;

public class ins {
    public static void sort(int arr[] ) {

        int n = arr.length;
     for(int i = 0;i<n;i++){
         int key  = arr[i];
        int  j = i-1;

        while(j>=0 && arr[j] > key){
            arr[j + 1 ] = arr[j];
             j = j-1;
        }
        arr[j+1]  = key;
     }
    }

    public static void main(String[] args) {
        int arr[] = {1,2,4,5,6,8,9};
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

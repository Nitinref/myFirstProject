public class Make {
    public static void sort(int arr[] ) {
        
        
            int n = arr.length;
            for(int i = 0;i<arr.length;i++){
                for(int j = 1;j<n-i-1;j++){
                    if(arr[j] < arr[j-1]){
                        int temp = arr[j];
                     arr[j]   =  arr[j-1];
                       arr[ j-1] = temp;
                    }
                }
            }
            
        
    }

    public static void main(String[] args) {
        int arr[] = {4,6,5,4,9,};
        sort(arr);
        printArray(arr);
    }

    public static void printArray(int arr[]) {
        for(int num:arr){
            System.out.println(num);
        }
        System.out.println();
    }
}

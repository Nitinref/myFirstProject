public class swap {
    public static void Sort(int arr[] ) {

        int n = arr.length;
        for(int i = 0;i<n;i++) {
            int maxIndex = 0;

            for(int j = 1;j<n-i;j++){
                if(arr[maxIndex]  < arr[j]){
                   maxIndex = j;
                }
            }

            int temp = arr[maxIndex];
            arr[maxIndex] = arr[n-i-1];
            arr[n-i-1] = temp;
        }
    }

    public static void main(String[] args) {
        int arr[] = {4, 5, 8, 9, 1, 2, 3};

        System.out.println("Before Sorting: ");
        printArray(arr);

        Sort(arr);

        System.out.println("After Sorting: ");
        printArray(arr);
    }
    public static void printArray(int arr[]) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}

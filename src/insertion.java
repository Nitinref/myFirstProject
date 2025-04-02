import java.util.Scanner;

public class insertion{
    public static void main(int arr[] ,  int index , int element ) {
        int n  = arr.length;
        if(index >= n || index <0){
            System.out.println("invalid indexing");
        }

        for(int i =index;i<n-1;i++){
            arr[i] = element;

        }

        for (int i =0;i<n-1;i++){
            System.out.print( " " +arr[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {1,5,6,9,9,8,400};
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER THE INDEX:");
     int index = sc.nextInt();
        System.out.println("Enter the element to insert");
     int element = sc.nextInt();
     main(arr , index , element);

    }
}
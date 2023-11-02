package recursion;

public class MaxInArray {

    static int max(int arr[],int size){
        if(size==0)
        {
            return arr[0];
        }
        return arr[size]>max(arr, size-1)?arr[size]:max(arr, size-1);
    }
    public static void main(String[] args) {
        int arr[]={13,1,-3,22,5};
        System.out.print("output:"+max(arr,arr.length-1));
    }
    
}

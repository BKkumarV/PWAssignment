package recursion;

public class SumOfElement {

    static int sum(int arr[],int size){
        if(size==0)
        {
            return arr[size];
        }
        return arr[size]+sum(arr, size-1);
    }
    public static void main(String[] args) {
        int arr[]={92,23,15,-20,10};
        System.out.println("output:"+sum(arr,arr.length-1));
    }
    
}

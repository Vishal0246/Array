public class RotatedKTimeLeft {

    static void rotatedKTimeLeft(int arr[], int k){
        int n=arr.length;
        reverse(arr,0,k-1);
        reverse(arr,k,n-1);
        reverse(arr,0, n-1);
    }
    static void reverse(int arr[], int start, int end){
        int j=end;
        for(int i=start; i<j; i++){
            int t=arr[j];
             arr[j]=arr[i];
             arr[i]=t;
             j--;

        }
    }
    public static void main(String args[]){

        int arr[]={1,3,2,6,4,8,5};
        int k=3;
        rotatedKTimeLeft(arr,k);
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+",");
        }


    }
    
}

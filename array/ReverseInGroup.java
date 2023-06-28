public class ReverseInGroup {

    static void reverseingroup(int arr[], int n, int k){
        int j=k-1;
        int t;
        for(int i=0; i<j; i++){
            
            t=arr[j];
            arr[j]=arr[i];
            arr[i]=t;
            j--;
        }
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6,7};
        int k=3;
        int n=arr.length;

        reverseingroup(arr,n,k);

        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }


    }
    
}

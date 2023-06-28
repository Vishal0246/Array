public class WaveForm {
    public static void waveform(int a[], int n){
        // Code your solution here.
        for(int i=0; i<n; i++){
            if(i>0 && a[i]>a[i-1] ){
                int t=a[i-1];
                a[i-1]=a[i];
                a[i]=t;
                
            }
            if(i<n-1 && a[i]>a[i+1]){
                int t=a[i+1];
                a[i+1]=a[i];
                a[i]=t;
                
            }
        }
    }
    public static void main(String args[]){
        int arr[]={4 ,3 ,7, 8, 6, 2, 1};
        int n=arr.length;
        waveform(arr,n);
        for(int i=0; i<n ; i++){
            System.out.print(arr[i]);
        }
    }
    
}

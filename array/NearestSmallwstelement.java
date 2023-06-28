public class NearestSmallwstelement {


    public static void Nearestsmallestleftelement(int arr[]){

        int n=arr.length;

        for(int i=0; i<n; i++){
            int f=0;
            for(int j=i-1; j>=0; j--){
                if(arr[i]>arr[j]){
                    System.out.println(arr[j]);
                    f++;
                    break;
                }
            }
            if(f==0){
                System.out.println("-1");
            }

        }
    }
    public static void main(String[] args) {
        int arr[]={10,4,8,34,8,55,6,4,9};
        Nearestsmallestleftelement(arr);

        
    }
    
}

public class Greatestementright {

    public static void greatestementtoright(int arr[]){
        int n=arr.length;

        for(int i=0; i<n; i++){
            int c=0;
            for(int j=i+1; j<n; j++){
                if(arr[j]>arr[i]){
                    System.out.println(arr[j]);
                    c++;
                    break;
                    
                }
            }

            if(c==0){
                System.out.println("-1");
            }
        }
    }

    public static void main(String[] args) {

        int arr[]={12,4,7,3,88,23,78};
        greatestementtoright(arr);

        
    }
    
}

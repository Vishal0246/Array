
public class Insertelement{

    static void insertElement(int arr[], int size, int pos, int num){
        for(int i=size-1; i>=pos; i--){
            arr[i+1]=arr[i];
        }
        arr[pos]=num;
    }


    public static void main(String args[]){
        int arr[]=new int[25];
        arr[0]=2;
        arr[1]=5;
        arr[2]=67;
        arr[3]=45;
        arr[4]=5;
        int n=5;
        int pos=2;
        int num=34;
        System.out.print("print before insert");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
        
        insertElement(arr,n,pos,num);
        n+=1;

        
        System.out.print("print after insert");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+",");
        }
        


    }
}
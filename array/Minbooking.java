public class Minbooking {
    public static int minimumTime(int N, int cur, int[] pos, int[] time) {
        // code here
        int newarr[]=new int[N];
      for(int i=0; i<N; i++){
          int p=pos[i];
          int t=time[i];
          newarr[i]=-((cur-p)*t);
          
      }
      int min=newarr[0];
      for(int i=0; i<N; i++){
          if(newarr[i]<min){
              min=newarr[i];
          }
      }
      return min;
    }
    public static void main(String args[]){
        int n=3;
        int cur=4;
        int pos[]={1,5,6};
        int time[]={2,3,1};
       int m= minimumTime(n,cur,pos,time);
       System.out.println(m);


    }
}
    



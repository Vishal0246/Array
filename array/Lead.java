public class Lead {

    public static void lead(int arr[]) {
        int n = arr.length;
    

        for (int i = 0; i < n ; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] <= arr[j]) {
                    break;
                }
             
                
                 else if (j==n) {
                    System.out.print(arr[i] + ",");

                }
            }

        }

    }

    public static void main(String[] args) {
        int arr[] = { 16, 17, 4, 3, 5, 2, };
        System.out.println("hello");

        lead(arr);

    }

}

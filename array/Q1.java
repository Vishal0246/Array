import java.util.*;
public class Q1 {
   


	static Scanner sc = new Scanner(System.in);
	
	public static void input(int []arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the element at index "+ i + " : ");
			arr[i] = sc.nextInt();
		}
	}
	

	public static void print_array(int []arr) {
		System.out.print("Array : ");
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i] + ", ");
		}
		System.out.println();
	}

public static void array_wave_form(int []arr) {
		for(int i=1; i<=(arr.length-1); i=i+2) {
			if(arr[i]>arr[i-1]) {
				int temp = arr[i];
				arr[i]=arr[i-1];
				arr[i-1]=temp;
			}
			if((i<arr.length-1 && arr[i]>arr[i+1])) {
				int temp = arr[i];
				arr[i]=arr[i+1];
				arr[i+1]=temp;
			}
		}
	}
public static void rotation(int[]arr) {
		int count=0;
		int b=2 ;
		int temp;int i;
		while(count<b) {
			temp=arr[0];
			for(i=0;i<arr.length-1;i++) {
				arr[i]=arr[i+1];	
			}
			arr[i]=temp;
			count++;
			
		}
	}
public static int binarySearch(int arr[], int a, int b, int c)
	{
		if (a >= b) {
			int mid = b + (a- b) / 2;

			if (arr[mid] == c)
				return mid;

			if (arr[mid] > c)
				return binarySearch(arr, b, mid - 1, c);

			return binarySearch(arr, mid + 1, a, c);
		}
		return -1;
	}
public static int factorial(int x) {
		if(x==0)
			return 1;
		if(x==1)
			return 1;
		else
			return x*factorial(x-1);
	}
public static void Fibo(int a,int b,int n) {
		if(n==0) {
			return;
		}
		int c=a+b;
		System.out.print(c+" ");
		Fibo(b,c,n-1);
	}
public static int printGcd(int a,int b) {
		if(a<b)
			return printGcd(b,a);
		if(a%b==0)
			return b;
		return printGcd(b,a%b);
	}
public static int search(int arr[], int search)
	{
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == search)
				return i;
		}
		return -1;
	}
public static void largest_sum_of_contiguousArray(){
		int arr[]= {1,-2,3,4,-4,6,-4,3,2};
		int max_g=0, max_l=0;
		for(int i=0;i<arr.length;i++) {
			max_l=max_l+arr[i];
			if(max_l<0)
				max_l=0;
		    if(max_g<max_l)
				max_g=max_l;
		  
		}

		  System.out.println("Largest sum is "+max_g);
	}
public static void sum_array() {
		int a[]= {1,2,3,4};
		int sum=0;
		for(int i=0;i<a.length;i++) {
			sum=sum+a[i];
		}
		System.out.println(sum);
	}
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Which question do you want to solve");
		int Questions=sc.nextInt();
		switch(Questions) {
		case 1:
			System.out.println(factorial(5));break;
		case 2:
			int a=0,b=1;
			
			System.out.println("Fibonaci series upto");
			int n=sc.nextInt();
			System.out.print(a+" ");
			System.out.print(b+" ");
			Fibo(a,b,n-2);break;
		case 3:
			System.out.println(printGcd(100,150));break;
		case 4:
			int arr[] = { 45, 2, 3, 4, 10, 40 };
			int search = 10;

			
			int result = search(arr, search);
			if (result == -1)
				System. out.print(" not present");
			else
				System.out.print(search+" is present at index " + result);
			break;
		case 5:
			System.out.println("Enter size : ");
int size = sc.nextInt();
			int []A = new int[size];
			
			
			input(A);
			
			
			print_array(A);
			
			array_wave_form(A);
			
		
			print_array(A);break;
		case 6:
			System.out.println("Enter size : ");
			int s = sc.nextInt();
			int []Ar = new int[s];
			
			
			input(Ar);
			
			
			print_array(Ar);
			// sorting(Ar);
			print_array(Ar);break;
		case 7:
			System.out.println("Enter size : ");
			int siz = sc.nextInt();
			int []Arr = new int[siz];
			
			
			input(Arr);
	
			print_array(Arr);
			rotation(Arr);
			print_array(Arr);
			break;
case 8://Binary search
			System.out.println("Enter size : ");
			int array_size = sc.nextInt();
			int []Array = new int[array_size];
			
			
			input(Array);
	
			print_array(Array);
		case 9:
			largest_sum_of_contiguousArray();break;
		case 10:
			sum_array();
			break;
		
		}
	}

}
    


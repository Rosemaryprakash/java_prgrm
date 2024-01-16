import java.util.*;

class Position{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the size of the array:");
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++){
			arr[i]=sc.next();
		}
		System.out.println("The array:");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.print("Enter the element to be searched :");
		String e=sc.next();
		int count=0;
		for(int i=0;i<n;i++){
			if(e.equalsIgnoreCase(arr[i])){
				count++;
			}
		}
		int[] a=new int[count];
		int k=0;
		for(int i=0;i<n;i++){
			if(e.equalsIgnoreCase(arr[i])){
				a[k]=i+1;
				k++;
			}
		}
		int min=a[0];
		int max=a[count-1];
		System.out.println();
		System.out.println("The first :"+min+" the last: "+max);
	}
}
		
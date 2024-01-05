import java.util.*;

class Volume{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
		int n=sc.nextInt();
		int[] height=new int[n];
		for(int i=0;i<n;i++){
			height[i]=sc.nextInt();
		}
		int a=0;
		int b=0;
		int[] area=new int[n];
		for(int i=1;i<n;i++){
			int h=height[i]-height[i-1];
			b=h*1;
			for(int j=0;j<n;j++){
				a=(height[i]-height[j])*(i-j);
				if(b<a){
					b=a;
				}
			}
			area[i]=b;
		}
		int max=0;
		for(int i=0;i<n;i++){
			if(max<area[i]){
				max=area[i];
			}
		}
		System.out.print(max);
	}
}
					
			

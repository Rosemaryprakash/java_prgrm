import java.util.*;

class Ams{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();
		int k=num;
		int cube=0;
		int rev;
		while(k>0){
			rev=k%10;
			k=k/10;
			rev=rev*rev*rev;
			cube=cube+rev;
		}
		System.out.print(cube);
	}
}
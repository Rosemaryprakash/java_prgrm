import java.util.*;

class Vowels{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the string : ");
		String str=sc.next();
		char[] c=str.toCharArray();
		int count=0;
		int n=str.length();
		for(int i=0;i<n;i++){
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
				count++;
			}
		}
		System.out.print(count);
		char[] ind=new char[count];
		int k=0;
		for(int i=0;i<n;i++){
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
				ind[k]=c[i];
				k++;
			}
		}
		for(int i=0;i<count;i++){
			System.out.println(ind[i]);
		}
		
		char temp;
		for(int i=0;i<n;i++){
			if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u'||c[i]=='A'||c[i]=='E'||c[i]=='I'||c[i]=='O'||c[i]=='U'){
				//int q=ind[count-1];
				c[i]=ind[count-1];
				count--;	
			}
		}
		System.out.print(c);
	}
}

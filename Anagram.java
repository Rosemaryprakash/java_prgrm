import java.util.*;

class Anagram{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		String str1=sc.next();
		String str2=sc.next();
		char[] a=str1.toCharArray();
		char[] b=str2.toCharArray();
		int s1=str1.length();
		int s2=str2.length();
		if(s1==s2){
			for(int i=0;i<s1-1;i++){
				for(int j=i+1;j<s1;j++){
					if(a[i]>a[j]){
						char d=a[i];
						a[i]=a[j];
						a[j]=d;
					}
				}
			}
			for(int i=0;i<s2-1;i++){
				for(int j=i+1;j<s2;j++){
					if(b[i]>b[j]){
						char d=b[i];
						b[i]=b[j];
						b[j]=d;
					}
				}
			}
			System.out.println(a);
			System.out.println(b);
			String new1=new String(a);
			String new2=new String(b);
			String n1=new1.toUpperCase();
			String n2=new2.toUpperCase();
			if(n1.equals(n2)){
				System.out.print("ANAGRAM");
			}
			else{
				System.out.print("Not an ANAGRAM");
			}
		}
		else{
			System.out.print("Not an ANAGRAM");
		}
	}
}		
import java.util.*;
import java.lang.*;

class Strg{
	public static void main(String[] args){
		try{
			char a;
			Scanner inn=new Scanner(System.in);
			String st=inn.next();
			char[] c=st.toCharArray();
			int t=st.length()-1;
			/*for(int i=0;i<=t;i++){
					a=c[i];
					c[i]=c[t];
					c[t]=a;
					t--;
					if(t==i){
						break;
					}
			}
			System.out.print(c);  */
			//System.out.println("Char array:"+char);
			for(int j=0;j<=t+1;j++){
				for(int i=0;i<t;i++){
					a=c[i];
					c[i]=c[i+1];
					c[i+1]=a;
				}
				t--;
			}
			//String reversedStr = new String(c);
			System.out.print(c);
		}
		catch(Exception e){System.out.print(e); }
	}
}
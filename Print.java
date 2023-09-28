class Print
{
	int a=10;
	static int b=20;
	public static void main(String[] args)	
	{
		Print t1=new Print();
		System.out.println(t1.a);
		System.out.println(t1.b);
		t1.a=444;
		t1.b=555;
		Print t2=new Print();
		System.out.println(t2.a);
		System.out.println(t2.b);
		t2.b=111;
		System.out.println(t2.b);
		Print t3=new Print();
		System.out.println(t3.a);
		System.out.println(t3.b);
		Print t4=new Print();
		System.out.println(t4.a);
		System.out.println(t4.b);
	}
}
		
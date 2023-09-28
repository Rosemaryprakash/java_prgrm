class Tst
{
	int a=10;
	int b=20;
	void add()
	{
		System.out.print(a+b);
	}
	public static void main(String[] args)
	{
		Tst t=new Tst();
		System.out.println(t.a+t.b);
		t.add();
	}
}
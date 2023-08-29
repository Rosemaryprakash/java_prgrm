import java.io.*;
class Res
{
	synchronized public void num()
	{
		int i;
		for(i=0;i<5;i++)
		{
			System.out.println(i);
		}
	}
}	
class Threads extends Thread
{
	Res r;
	Threads(Res r)
	{
		this.r=r;
	}
	public void run()
	{
		this.r.num();

	}
	
}
public class ThreadSynchronization
{
	public static void main(String[] args)
	{
		Res obj=new Res();
		Threads t1=new Threads(obj);
		Threads t2=new Threads(obj);
		t1.start();
		t2.start();
	}
}
/*
	���󣺴�����������ÿ�������д�Ǯ��ÿ�δ�100���������Ρ�


*/
class Bank
{
	private int sum;
	Object obj=new Object();
	public void add(int num)
	{
		synchronized(obj)
		{
			sum=sum+num;
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException e)
			{}
			System.out.println("sum = "+sum+"--"+Thread.currentThread().getName());
		}
	}
	Bank()
	{
		
	}
}
class Cus implements Runnable
{
	private Bank b=new Bank();
	public void run()
	{
		
		for(int x=0;x<300;x++)
		{
			b.add(100);
		}
	}
}
class ThreadDemo4
{
	public static void main(String[] args)
	{
		Cus c=new Cus();
		Thread t1=new Thread(c);
		Thread t2=new Thread(c);
		t1.start();
		t2.start();
		
	}
}




























































































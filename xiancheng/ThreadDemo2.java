class ThreadDemo2
{
	public static void main(String[] args)
	{
		Demo d=new Demo();
		Thread d1=new Thread(d);
		Thread d2=new Thread(d);
		d1.start();
		d2.start();			
	}
}
class Demo extends Fu implements Runnable//׼����չDemo��Ĺ��ܣ����������ݿ�����Ϊ���߳�ִ�У��ӿڣ���
{
	public void run()
	{
		show();
	}
	public void show()
	{
		for(int x=1;x<10;x++)
			System.out.println("x = "+x+"...."+Thread.currentThread().getName());
	}
}
class Fu
{
	
	Fu()
	{}
}
/*
	�����̵߳ĵڶ��ַ�ʽ��ʵ��Runnable�ӿڡ�


*/
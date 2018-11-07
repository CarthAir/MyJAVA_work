class ThreadDemo5
{
	public static void main(String[] args)
	{
		Ticket t1=new Ticket();
		Thread d1=new Thread(t1);
		Thread d2=new Thread(t1);
		
		d1.start();
		try{Thread.sleep(10);}catch(InterruptedException e){}
		t1.flag=false;
		d2.start();
	}
}
class Ticket implements Runnable
{
	boolean flag=true;
	private int num=300;
	Object obj=new Object();
	public void run()
	{
		sale();
	}
	public void sale()
	{
		if(flag)
		{
			while(true)
			{
				synchronized(obj)//ͬ����
				{
					if(num>0)
					{
						try
						{
							Thread.sleep(10);
						}
						catch(InterruptedException k){}
						System.out.println("TicketID: "+num--+"--obj--"+Thread.currentThread().getName());
					}
				}
			}
		}
		else
			while(true)
				this.show();
	}
	public synchronized void show()
	{
		if(num>0)
		{
			try
			{
				Thread.sleep(10);
			}
			catch(InterruptedException k){}
			System.out.println("TicketID: "+num--+"--show--"+Thread.currentThread().getName());
		}
	}
}


/*
	ͬ������ʹ�õ����ǵ�ǰ����
	
	��̬ͬ������ʹ�õ����Ǹú��������ֽ����ļ���



*/




















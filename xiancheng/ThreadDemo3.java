/*
	������Ʊ

*/

class ThreadDemo3 
{
	public static void main(String[] args)
	{
		Ticket t1=new Ticket();
		Thread d1=new Thread(t1);
		Thread d2=new Thread(t1);
		Thread d3=new Thread(t1);
		d1.start();
		d2.start();
		d3.start();
	}
}
class Ticket implements Runnable
{
	private int num=1000;
	Object obj=new Object();
	public void run()
	{
		sale();
	}
	public void sale()
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
					System.out.println("TicketID: "+num--+"--"+Thread.currentThread().getName());
				}
			}
		}
	}
}

/*
	���̰߳�ȫ�������ԭ��
		1������߳��ڲ����������ݡ�
		2�������������ݵ��̴߳����ж�����
		
	���˼·��
	�����������������ݵĴ����װ�����������߳���ִ����Щ����ʱ��
	�����̲߳����Բ������㡣
	�������Щ���붼ִ����Ϻ������̲߳ſ��Բ������㡣
	
	��java�У���ͬ�������Ϳ��Խ��������⡣
	
	ͬ��������ʽ��
	synchronized(����)
	{
		��Ҫ��ͬ���Ĵ���;
	}
	ͬ���ĺô���
	������̵߳İ�ȫ���⡣
	
	ͬ���ı׶ˣ�
	������ʽ��ͣ���Ϊͬ������̶߳����ж�ͬ��������Ч�жϣ���
	
	ͬ����ǰ�᣺
	�����ж���̣߳���ʹ��ͬһ������
	
*/









/*
�̼߳�ͨѶ��
����߳��ڴ���ͬһ��Դ����������ͬ��



�ȴ����ѻ��ƣ�
������
	wait():���̴߳��ڶ���״̬����wait���̻߳�洢���̳߳��С�
	notify():�����̳߳��е�һ���̡߳�
	notifyAll():�����̳߳��е������̡߳�

��Щ���������붨����ͬ���У���Ϊ��Щ���������ڲ����߳�״̬�ķ�����
����Ҫ��ȷ���������ĸ����ϵ��̡߳�

*/
class Resource
{
	String name;
	String sex;
	boolean flag=false;
}
class Input implements Runnable
{
	Resource r;
	Input(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		int x=0;
		while(true)
		{
			synchronized(r)
			{
				if(r.flag)
					try{r.wait();}catch(InterruptedException t){}
				else
				{
					if(x==0)
					{
						r.name="Mark";
						r.sex="Male";
					}
					else
					{
						r.name="����";
						r.sex="ŮŮŮŮŮ";
					}
					r.flag=true;
					r.notify();
				}
				x=(x+1)%2;
			}
		}
	}
}
class Output implements Runnable
{
	Resource r;
	Output(Resource r)
	{
		this.r=r;
	}
	public void run()
	{
		while(true)
		{
			synchronized(r)
			{
				if(!r.flag)
					try{r.wait();}catch(InterruptedException u){}
				else
				{	
					System.out.println(r.name+"..."+r.sex+"--"+Thread.currentThread().getName());	
				}
				r.flag=false;
				r.notify();
			}
		}
	}
}
class ResourceDemo
{
	public static void main(String[] args)
	{
		Resource r=new Resource();
		Input p=new Input(r);
		Output o=new Output(r);
		Thread d1=new Thread(p);
		Thread d2=new Thread(o);
		d1.start();
		d2.start();
	}
}











































/*
	���߳��µĵ������ģʽ��

*/
//����ʽ ��Ķ�û���߳����⣬����
class Single
{
	private static final Single s=new Single();
	private Single(){}
	public static Single getInstance()
	{
		return s;
	}
}

//����ʽ
class Single2 implements Runnable
{
	private static Single2 s=null;
	private Single2(){};
	public static synchronized Single2 getInstance()
	{
		if(s==null)
		{
			synchronized(Single2.class)
			{
				if(s==null)
				{	
					s=new Single2();
						try{Thread.sleep(10);}catch(InterruptedException e){}
				}
				
			}
		}
		return s;
	}
	public void run()
	{
		this.getInstance();
	}
}
class SingleDemo
{
	public static void main(String[] args)
	{
		Single2 d=Single2.getInstance();
		Thread d1=new Thread(d);
		Thread d2=new Thread(d);
		
	}
}













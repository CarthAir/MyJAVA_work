/*
	��δ���һ���߳��أ�
	�����̷߳�ʽһ���̳�Thread�ࡣ
	
	���裺
	1������һ����̳�Thread��
	2������Thread���е�run����
	3��ֱ�Ӵ���Thread����������
	4������start�������ò������߳�
	
*/

class ThreadDemo 
{
	public static void main(String[] args)
	{
		
		/*
			�����̵߳�Ŀ����Ϊ�˿���һ��ִ�д����·����ȥ����ָ���������������ʵ��ͬʱ���С�
		*/	
		Demo2 d1=new Demo2("��ɭ");
		Demo2 d2=new Demo2("Jack_Black");
		d1.start();//�����߳�
		for(int x=0;x<10;x++)
			System.out.println("haha...."+Thread.currentThread().getName());
		d2.start();
	}
}
class Demo2 extends Thread
{
	private String name;
	Demo2(String name)
	{
		this.name=name;
	}
	public void run()
	{
		show();
	}
	public void show()
	{
		for(int x=0;x<10;x++)
		{
			System.out.println(this.name+"...x="+x+"..."+Thread.currentThread().getName());
		}
	}
}























 
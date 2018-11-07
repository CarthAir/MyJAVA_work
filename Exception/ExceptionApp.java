/*
	Ӧ�á�	
*/
//�쳣�ࣺlanPing
class lanPing extends Exception
{
	lanPing(){}
	lanPing(String msg)
	{
		super(msg);
	}
}
//�쳣�ࣺMaoYan
class MaoYan extends Exception
{
	MaoYan(){}
	MaoYan(String l)
	{
		super(l);
	}
}
class NoPlanException extends Exception
{
	NoPlanException(){}
	NoPlanException(String msg)
	{
		super(msg);
	}
}
//����������
class ExceptionApp
{
	public static void main(String[] args)
	{
		Teacher t=new Teacher("Yuma");
		try
		{
			t.prelect();
		}
		catch(NoPlanException n)//ֻ�и��쳣������ʦ�޷�������׳������������ķ��������
		{
			System.out.println("��ʱ����");
		}
	}
}
//��ʦ��
class Teacher
{
	private String name;
	private Computer comp;
	Teacher(String name)
	{
		this.name=name;
		comp=new Computer();
	}
	//�������޷�ʹ�ã���ʦҪ��ͬѧ��ϰ��
	public void test()
	{
		System.out.println("�����ϰ");
	}
	//ð���쳣��ʦ�޷��������Ҫ�׳���
	public void prelect()throws NoPlanException
	{
		try
		{
			comp.run();
			System.out.println(name+"�Ͽ�");
		}
		catch(MaoYan m)
		{
			System.out.println(m);
			test();
			throw new NoPlanException("��ʱ�޷�����");
		}
		catch(lanPing l)
		{
			System.out.println(l);
			comp.reset();
			prelect();//�޸���ɼ������Ρ�
		}
		
	}
}
class Computer
{
	private int state=2;
	public void run()throws lanPing,MaoYan//�������������Լ��޷���������⣬�������׳�
	{
		if(state==1)
			throw new lanPing("���������ˣ�����");
		if(state==2)
			throw new MaoYan("����ð���ˣ�����");
		System.out.println("Computer...Run");
	}
	//��������������
	public void reset()
	{
		state=0;
		System.out.println("����");
	}
}

























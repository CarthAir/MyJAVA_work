/*
	��̬ʱ��
	��Ա���ص㣺
	1����Ա������
		����ʱ���ο������ͱ��������������Ƿ��е��õĳ�Ա�������У�����ͨ����û�������ʧ�ܡ�
		����ʱ���ο������ͱ��������������Ƿ��е��õĳ�Ա�����������и��������еĳ�Ա������
		��˵����������ж��ο��Ⱥ���ߡ�
				
	2����Ա�������Ǿ�̬����
		����ʱ���ο������ͱ��������������Ƿ��е��õĺ������У�����ͨ����û�У�����ʧ�ܡ�
		����ʱ���ο����Ƕ��������������Ƿ��е��ú�����
		��˵�����뿴��ߣ����п��ұߡ�
		
	3����̬������
		���漰��̬�ԣ�����Ķ�̬�ԣ�
*/

class Fu
{
	int num=3;
	void show()
	{
		System.out.println("Fu show");
	}
	static void method()
	{
		System.out.println("Fu...method");
	}
}
class Zi extends Fu
{
	int num=4;
	void show()	
	{
		System.out.println("Zi show");
	}
	static void method()
	{
		System.out.println("Zi...method");
	}
}
class duotaiTest5
{
	public static void main(String[] args)
	{
		Fu f=new Zi();
		f.show();
		f.method();
		System.out.println(f.num);
		Zi z=(Zi)f;
		z.method();
		System.out.println(z.num);
	}
}














 
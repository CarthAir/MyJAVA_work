/*
	����ĳ�ʼ�����̣� ���������й��캯��Ĭ�϶�����ʸ��ࡣ
*/
class Fu
{
	Fu()
	{
		System.out.println("fu run");
	}
	
}
class Zi extends Fu
{
	Zi()
	{
		//super();
		System.out.println("Zi run");
	}
}
class Extendspra
{
	public static void main(String[] args)
	{
		new Zi();
	}
}
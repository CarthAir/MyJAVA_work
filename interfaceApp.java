/*
	Ϊ����չ�Ժ󽫳��ֵĲ�֪���ıʼǱ��豸��
	����һ������ֻҪ�豸���Ϲ��򼴿ɡ�
*/

class BookPC
{
	public static void main(String[] args)
	{
		useUSB(new sharpU());
		useUSB(new Mouse());
	}
	public static void useUSB(USB u)//�ӿ����͵����ö���ָ���Լ������ࡣ
	{
		u.open();
		u.close();
	}
}

interface USB
{
	public void open();
	public void close();
	
}
//һ�������һ��u��
class sharpU implements USB
{
	public void open()
	{
		System.out.println("sharpU open");
	}

	public void close()
	{
		System.out.println("sharpU close");
	}
}
class Mouse implements USB
{
	public void open()
	{
		System.out.println("Mouse open");
	}

	public void close()
	{
		System.out.println("Mouse close");
	}
}











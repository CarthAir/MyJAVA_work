class Car
{
	//���಻��Ҫ�������У����Բ���Ҫ��������
	int num;
	String colour;//��Ա�������������У����������о���Ч��
	void run()
	{
		System.out.print("num="+num+";colour="+colour);
	}
}
class carDemo
{
	public static void main(String[] args)
	{
		Car c=new Car();
		c.num=5;
		c.colour="red";
		c.run();//ʹ�ö���.��Ա�����г�Ա��
	}
}

	

class Car
{
	//���಻��Ҫ�������У����Բ���Ҫ��������
	int num;
	String colour;//��Ա�������������У����������о���Ч��
}
class severalcars
{
	public static void main(String[] args)
	{
		Car c1=new Car();
		Car c2=new Car();
		Car c3=new Car();
		show(c1);
		show(c2);
		show(c3);
	}	
	public static void show(Car c)
	{
		c.num=4;
		c.colour="red";
		System.out.print("num="+c.num+";colour="+c.colour+";\n");
	}
}

